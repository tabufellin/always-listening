package com.example.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.contactos.utilidades.utilidades;

public class NuevaPalabra extends AppCompatActivity {

    EditText Texto, Vibracion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_palabra);

        Texto = (EditText) findViewById(R.id.editText1);
        Vibracion = (EditText) findViewById(R.id.editText2);
    }

    public void AbrirPantalla (View view){
        Intent anadir = new Intent(this, Anadir.class);
        startActivity(anadir);
    }

    public void GuardarPalabra(View view)
    {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "BaseDeDatos", null, 1);

        SQLiteDatabase db = conn.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(utilidades.CAMPO_ID, 1/*Valor del textBox asignado*/);
        values.put(utilidades.CAMPO_TEXTO, Texto.getText().toString()/*Valor del textBox asignado*/);
        values.put(utilidades.CAMPO_ACTIVADA, 1/*Valor del textBox asignado*/);
        values.put(utilidades.CAMPO_PATRON_VIBRACION, Vibracion.getText().toString()/*Valor del textBox asignado*/);

        Long registros = db.insert(utilidades.TABLA_PALABRA, utilidades.CAMPO_ID, values);
        String _texto = Texto.getText().toString();
        Toast.makeText(getApplicationContext(), "Palabra: '"+_texto+"' guardada. "+registros.toString()+" palabras en total.",Toast.LENGTH_SHORT).show();
    }

}
