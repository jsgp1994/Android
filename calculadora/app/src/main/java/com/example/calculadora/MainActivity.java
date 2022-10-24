package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton suma, resta, multiplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suma = (RadioButton) findViewById(R.id.suma);
        resta = (RadioButton) findViewById(R.id.resta);
        multiplicacion = (RadioButton) findViewById(R.id.multiplicacion);
    }

    public void sendBtn(View view){

        String showMsg = suma.isChecked() ? "Selecciono Suma" : resta.isChecked() ? "Selecciono Resta" : "Selecciono Multiplicacion";

        Toast.makeText(this,showMsg, Toast.LENGTH_LONG).show();
    }
}