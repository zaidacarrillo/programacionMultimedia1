package com.aulanosa.holaUsuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText Txtmensaje = (EditText)findViewById(R.id.TxtMensaje);
        final EditText txtApellidos = (EditText)findViewById(R.id.txtApellidos);
        final EditText txtTelefono = (EditText)findViewById(R.id.txtTelefono);
        final EditText txtDireccion = (EditText)findViewById(R.id.txtDireccion);
        final EditText txtDni = (EditText)findViewById(R.id.txtDni);
        final Button btnHola = (Button) findViewById(R.id.BtnHola);
        btnHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FrmmensajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nombre",Txtmensaje.getText().toString());
                bundle.putString("apellidos",txtApellidos.getText().toString());
                bundle.putString("telefono",txtTelefono.getText().toString());
                bundle.putString("dni",txtDni.getText().toString());
                bundle.putString("direccion",txtDireccion.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);



            }
        });


    }
}