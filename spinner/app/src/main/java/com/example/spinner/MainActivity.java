package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String [] opciones = { "Suma", "Resta", "Multiplicacion" };
    int [] ids = { 10, 20, 30 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);


        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.style_spinner, opciones);
        spinner.setAdapter(adapter);
    }

    public void _btn_calculadora(View view){
        int position = spinner.getSelectedItemPosition();
        Toast.makeText(this,String.valueOf(ids[position]), Toast.LENGTH_LONG).show();
    }

}