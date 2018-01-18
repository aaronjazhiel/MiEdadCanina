package com.saludo.everis.miedadcanina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String MAIN_ACTIVITY = "MainActivity";
    private Button btnCalcular;
    private EditText edtEdad;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = (Button) findViewById(R.id.btnCalcularEdad);
        edtEdad = (EditText) findViewById(R.id.mensajeEntrada);
        txtResultado = (TextView) findViewById(R.id.mensajeResulatado);




        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    txtResultado.setText("Si fueras perro, tu edad sería de:  " + (Integer.valueOf(edtEdad.getText().toString())*6));
                  }catch (NumberFormatException e){

                    Toast.makeText(MainActivity.this, "El campo requiere un numero para realizar el calculo", Toast.LENGTH_SHORT).show();

                    Log.d("MainActivity", "ERRO POR INTRODUCIR UNA LETRA");

                }

            }
        });

    }
}
