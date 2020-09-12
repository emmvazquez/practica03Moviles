package com.practica.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.practica.practica3.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarMensaje(View v){
        Intent intent = new Intent(this, MensajeDesplegadoActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String mensaje = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, mensaje);
        startActivity(intent);

    }
}
