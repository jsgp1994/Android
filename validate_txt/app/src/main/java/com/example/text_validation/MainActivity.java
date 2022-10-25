package com.example.text_validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed_user, ed_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_user = (EditText) findViewById(R.id.txt_name);
        ed_password = (EditText) findViewById(R.id.txt_password);
    }

    public void _btn_registrar(View view){
        String user = ed_user.getText().toString();
        String password = ed_password.getText().toString();

        if(user.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Por favor diligencie el usuario y contraseña", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Registro exitoso del usuario: " + user, Toast.LENGTH_SHORT).show();
        }

    }

}