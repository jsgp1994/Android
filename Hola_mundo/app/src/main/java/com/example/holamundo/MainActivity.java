package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.holamundo.model.Alumno;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Se crea un objeto Alumno*/
        /*Alumno alumno = new Alumno();
        alumno.setNombre("Juan Sebastian Gaviria Prada");
        alumno.setFecha_nacimiento(new Date());
        alumno.setNumero_cuenta(12345678);*/


    }

    public void enviarDatos(View view){
        EditText edtNombre = (EditText) findViewById(R.id.edName);
        String name_person = edtNombre.getText().toString();
        Toast.makeText(getBaseContext(), "Felicidades tu nombre es : " + name_person, Toast.LENGTH_LONG).show();
    }
}