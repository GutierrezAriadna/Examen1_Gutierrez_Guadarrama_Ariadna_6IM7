package com.example.cecyt9.examen1_gutierrez_guadarrama_ariadna_6im7;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {

    TextView txtRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        try {
            Intent recibido = getIntent();
            Bundle DatosRec = recibido.getExtras();

            txtRes = (TextView) findViewById(R.id.txtResultado);
            txtRes.setText("Gutierrez Guadarrama Ariadna "+DatosRec.getString("<3"));
        }catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Ha ocurrido un error", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickCorreo(View vw)
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Examen 1 Parcial");
        intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo:\n"+txtRes.getText().toString());
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
        startActivity(intent);
    }
}
