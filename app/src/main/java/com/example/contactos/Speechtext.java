package com.example.contactos;

import android.content.ActivityNotFoundException;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.speech.RecognizerIntent;

import java.util.ArrayList;
import java.util.Locale;//?

import android.widget.Toast;




public class Speechtext extends AppCompatActivity {
    private ArrayList<String> palabrarecibida;


    public void mostrarAudioInput() {// metodo para que cuando reconozca la palabra la muestre en pantalla.
        Intent mod = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH); //reconoce idioma en que se habla
        mod.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        mod.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        try {
            startActivityForResult(mod, 100);
        } catch (ActivityNotFoundException que) {

            Toast.makeText(Speechtext.this, "Oh no", Toast.LENGTH_LONG).show();//Si no reconoce el texto muestra este mensaje
        }
    }

    public void onActivityResult(int request_code, int result_code, Intent mod) {//metodo que guarda la informacion que es captada por el dispositivo.
        super.onActivityResult(request_code, result_code, mod);// request code ya esta determinado en el metodo anterior
        //result code es si en verdad capto una palabra y la reconoce, y mod es el objeto que reconocio el audio.(metodo anterior)
        if (request_code) {
            if (result_code == RESULT_OK && !=null)// Result_ok = true
            {
                ArrayList<String> palabras = mod.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                this.palabrarecibida = palabras;// se guarda en la lista, que es un atributo de la clase.
            }
        } else {
            //condicion del while del metodo repetitivo. my services
        }
    }

}