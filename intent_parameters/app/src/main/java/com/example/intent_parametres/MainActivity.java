package com.example.intent_parametres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name = (EditText) findViewById(R.id.txt_name);
    }

    public void _btn_registrar(View view){
        String name = edt_name.getText().toString();

        if(name.isEmpty()){
            Toast.makeText(this, "Por favor relacione un nombre valido", Toast.LENGTH_SHORT).show();
        }else{
            Intent employee = new Intent(this, Employee.class);
            employee.putExtra("name", name);
            startActivity(employee);
        }
    }

}