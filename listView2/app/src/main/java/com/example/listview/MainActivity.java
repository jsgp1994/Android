package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv1;
    TextView txtEmpleado;

    private String nombres[] = { "Juan", "andres", "Santiagos", "valeria" , "Juan", "andres", "Santiagos", "valeria"};
    private String edades [] = { "15", "20", "45", "80", "15", "20", "45", "80" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1 = (ListView) findViewById(R.id.empleados);
        txtEmpleado = (TextView)findViewById(R.id.txtEmpleado);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                txtEmpleado.setText("La edad de " + nombres[i]  + " es " + edades[i] + " años");
            }
        });

    }

    public void _btn_kiss(View view){
        Toast.makeText(this, "Dame un beso Icoooo", Toast.LENGTH_LONG).show();
    }
}