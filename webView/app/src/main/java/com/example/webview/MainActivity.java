package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt_uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_uri = (EditText) findViewById(R.id.txt_url);
    }

    public void _btn_verificar(View view){

        String txtUri = edt_uri.getText().toString();

        if(txtUri.isEmpty()){
            Toast.makeText(this, "Por favor relacione una URL valida", Toast.LENGTH_SHORT).show();
        }else{
            Intent objWeb = new Intent(this, Web.class);
            objWeb.putExtra("url", txtUri);
            startActivity(objWeb);
        }
    }
}