package com.example.luciano.pokedex;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.luciano.pokedex.EspecieAdaptador.ATAQUE;
import static com.example.luciano.pokedex.EspecieAdaptador.DEFENSA;
import static com.example.luciano.pokedex.EspecieAdaptador.ID;
import static com.example.luciano.pokedex.EspecieAdaptador.NOMBRE;
import static com.example.luciano.pokedex.EspecieAdaptador.TIPO;
import static com.example.luciano.pokedex.EspecieAdaptador.VELOCIDAD;

public class EspecieDescripcion extends AppCompatActivity {

    private String id;
    private String nombre;
    private String tipo;
    private String velocidad;
    private String ataque;
    private String defensa;
    private String foto;

    TextView idEspecie;
    TextView nombreEspecie;
    TextView tipoEspecie;
    TextView velocidadEspecie;
    TextView ataqueEspecie;
    TextView defensaEspecie;
    ImageView imageView;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especie_descripcion);



        id = getIntent().getStringExtra(ID);
        nombre = getIntent().getStringExtra(NOMBRE);
        tipo = getIntent().getStringExtra(TIPO);
        velocidad = getIntent().getStringExtra(VELOCIDAD);
        ataque = getIntent().getStringExtra(ATAQUE);
        defensa = getIntent().getStringExtra(DEFENSA);
       // foto = getIntent().getStringExtra(String.valueOf(IMAGE));


        idEspecie= (TextView) findViewById(R.id.id);
        idEspecie.setText(id);

        nombreEspecie = (TextView) findViewById(R.id.nombre);
        nombreEspecie.setText(nombre);

        tipoEspecie = (TextView) findViewById(R.id.tipo);
        tipoEspecie.setText(tipo);

        velocidadEspecie = (TextView) findViewById(R.id.velocidadEspecie);
        velocidadEspecie.setText(velocidad);

        ataqueEspecie = (TextView) findViewById(R.id.ataque);
        ataqueEspecie.setText(ataque);

        defensaEspecie = (TextView) findViewById(R.id.defensa);
        defensaEspecie.setText(defensa);

        imageView = (ImageView) findViewById(R.id.fotoView);
        //imageView.setImageAlpha(Integer.parseInt(foto));




    }
}
