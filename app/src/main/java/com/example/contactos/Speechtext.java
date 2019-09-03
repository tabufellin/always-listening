package com.example.contactos;

import android.content.ActivityNotFoundException;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.content.Intent;
import android.speech.RecognizerIntent;

import java.util.ArrayList;
import java.util.Locale;//?
import android.widget.TextView;
import android.widget.Toast;




public class Speechtext extends AppCompatActivity {
    TextView catp = (TextView)findViewById()(R.id.catch);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        };
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()) {
            //@Override
            public void onClick(View  view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }

    public void microbutton(View vaw) {
        if (vaw.getId() == R.id.microButton);
    }

        mostrarAudioImput();
    }

    public void mostrarAudioInput() {
        Intent mod = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        mod.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL), RecognizerIntent.LANGUAGE_MODEL_FREE_FORM;
        mod.putExtra(RecognizerIntent.EXTRA_LANGUAGE), Locale.getDefault();

        try {
            startActivityForResult(mod, 100);
        } catch (ActivityNotFoundException que) {

            Toast.makeText(Speechtext.this, "oh no", Toast.LENGTH_LONG).show();
        }}

        public void onActivityResult ( int request_code, int result_code, Intent mod){
            super.onActivityResult(request_code, result_code, mod);
            switch (request_code) {
                case 100:
                    if (result_code == RESULT_OK && !=null)
                {

                    ArrayList<String> palabras = mod.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    catp.setText(catp.get(0));
                }
                break;
            }
        }

