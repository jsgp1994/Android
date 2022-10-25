package com.example.intent_parametres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Employee extends AppCompatActivity {

    private TextView txv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        txv_name = (TextView) findViewById(R.id.txt_employee);
        txv_name.setText("Empleado: " + getIntent().getStringExtra("name"));
    }

    public void _first_screen(View view){
        Intent firstScreen =  new Intent(this, MainActivity.class);
        startActivity(firstScreen);
    }
}