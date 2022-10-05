package com.example.appnotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txt_matemticas, txt_fisica, txt_quimica;
    private TextView txt_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_matemticas = (EditText)findViewById(R.id.txt_matematicas);
        txt_fisica = (EditText)findViewById(R.id.txt_fisica);
        txt_quimica = (EditText)findViewById(R.id.txt_quimica);
        txt_status = (TextView)findViewById(R.id.txt_status);
    }

    //Metodo que permite Evaluar si el estudiante paso o no el examen
    public void status_approved(View view){
        int matematicas = Integer.parseInt(txt_matemticas.getText().toString());
        int fisica = Integer.parseInt(txt_fisica.getText().toString());
        int quimica = Integer.parseInt(txt_quimica.getText().toString());
        int result = (matematicas + fisica + quimica)/3;
        txt_status.setText(result < 6 ? "Reprobo con " + result : "Aprobo con " + result);
    }

    //Metodo que permite limpiar las variables
    public void _clear(View view){
        txt_matemticas.setText("");
        txt_fisica.setText("");
        txt_quimica.setText("");
        txt_status.setText("Verificar Notas");
    }

}