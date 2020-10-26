package com.aulanosa.holaUsuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FrmmensajeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frmmensaje);

        TextView txtMensaje = (TextView) findViewById(R.id.TxtMensaje);

        Bundle bundle = getIntent().getExtras();

        txtMensaje.setText("Hola "+bundle.getString("nombre"));
    }
}