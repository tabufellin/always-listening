package com.example.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "BaseDeDatos", null, 1);
    }

    public void Anadir (View view){
        Intent anadir = new Intent(this, Anadir.class);
        startActivity(anadir);
    }

    public void Anadir2 (View view){
        Intent anadir = new Intent(this, Anadir.class);
        startActivity(anadir);
    }



}
