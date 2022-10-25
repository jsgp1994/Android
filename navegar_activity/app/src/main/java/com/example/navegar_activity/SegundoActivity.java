package com.example.navegar_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }

    public void _btn_dos(View view){
        Intent primera_pantalla = new Intent(this, MainActivity.class);
        startActivity(primera_pantalla);
    }

}