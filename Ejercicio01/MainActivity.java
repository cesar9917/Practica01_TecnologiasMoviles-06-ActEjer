package com.cesar.registro_java;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etApellidos, etEdad;
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular con el XML
        etNombre = findViewById(R.id.etNombre);
        etApellidos = findViewById(R.id.etApellidos);
        etEdad = findViewById(R.id.etEdad);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        // Evento del botón
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = etNombre.getText().toString();
                String apellidos = etApellidos.getText().toString();
                String edad = etEdad.getText().toString();

                // Validación simple
                if (nombre.isEmpty() || apellidos.isEmpty() || edad.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Registrado: " + nombre + " " + apellidos + " - Edad: " + edad,
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}