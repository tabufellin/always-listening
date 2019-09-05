package com.example.contactos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "BaseDeDatos", null, 1);
    }

    public void AbrirPantallaNuevaPalabra (View view){
        Intent anadir = new Intent(this, NuevaPalabra.class);
        startActivity(anadir);
    }

    public void PantallaNoDisponible (View view){
        Toast.makeText(getApplicationContext(), "Función no disponible aun.",Toast.LENGTH_SHORT).show();
    }

}
