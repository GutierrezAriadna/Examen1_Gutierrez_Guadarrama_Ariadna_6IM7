package com.example.cecyt9.examen1_gutierrez_guadarrama_ariadna_6im7;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    EditText numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero=(EditText)findViewById(R.id.cantidad);
    }

    public void onClickConvertir(View vw)
    {
        try{
            int resultado = Integer.parseInt(numero.getText().toString());
            Toast.makeText(getApplicationContext(),""+resultado/15, Toast.LENGTH_LONG).show();
            Intent intento=new Intent(this,Actividad2.class);
            Bundle datos=new Bundle();
            datos.putString("El resultado es: ",""+resultado/15);
            intento.putExtras(datos);
            finish();
            startActivity(intento);

        }catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Ha Ocurrido un error"+e.getMessage(), Toast.LENGTH_LONG).show();
        }


    }
}
