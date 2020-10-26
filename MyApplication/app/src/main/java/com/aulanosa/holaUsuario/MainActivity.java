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
        final Button btnHola = (Button) findViewById(R.id.BtnHola);
        btnHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FrmmensajeActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nombre",Txtmensaje.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);

                Bundle bundle2 = new Bundle();
                bundle.putInt("telefono", Integer.parseInt(Txtmensaje.getText().toString()));
                intent.putExtras(bundle2);
                startActivity(intent);

            }
        });


    }
}