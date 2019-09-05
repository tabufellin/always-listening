package com.example.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.contactos.utilidades.utilidades;

public class PantallaPrincipal extends AppCompatActivity {

   // EditText Texto, Vibracion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        /*Texto = (EditText) findViewById(R.id.editText1);
        Vibracion = (EditText) findViewById(R.id.editText2);*/
    }


}
