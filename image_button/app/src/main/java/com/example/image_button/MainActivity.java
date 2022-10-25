package com.example.image_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void _btn_uno(View view){
        Toast.makeText(this, "Click en navegador", Toast.LENGTH_SHORT).show();
    }

    public void _btn_dos(View view){
        Toast.makeText(this, "Click en host", Toast.LENGTH_SHORT).show();
    }

}