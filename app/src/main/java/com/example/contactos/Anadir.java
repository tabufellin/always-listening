package com.example.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Anadir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir);
        int i =0; //Contador
    }

    public void Atras (View view){
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);

    }
}
