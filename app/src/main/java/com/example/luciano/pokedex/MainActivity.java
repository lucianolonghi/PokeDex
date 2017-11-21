package com.example.luciano.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Especie> especies;
    private RecyclerView listaEspecies;
    private EspecieAdaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaEspecies = findViewById(R.id.rvLista);
        LinearLayoutManager lin = new LinearLayoutManager(this);
        lin.setOrientation(LinearLayoutManager.VERTICAL);
        listaEspecies.setLayoutManager(lin);


        data();
        inicializaAdaptador();

    }
    public void data(){
        especies = new ArrayList<>();
        especies.add(new Especie("#001","Bulbasaur","Planta,Veneno","Velocidad: 300","Ataque:30","Defensa:10",R.drawable.bulbasaur));
        especies.add(new Especie("#002","Ivusaur","Planta,Veneno","Velocidad: 5","Ataque:100","Defensa:20",R.drawable.ivusaur));
        especies.add(new Especie("#003","Venasaur","Planta,Veneno","Velocidad: 6","Ataque:120","Defensa:50",R.drawable.venasaur));
        especies.add(new Especie("#004","Charmander","Fuego", "Velocidad: 7","Ataque:45","Defensa:5",R.drawable.charmander));
        especies.add(new Especie("#005","Charmeleon","Fuego", "Velocidad: 10","Ataque:130","Defensa:60",R.drawable.charmeleon));
        especies.add(new Especie("#006","Charizard","Fuego,Volador","Velocidad: 25","Ataque:250","Defensa:99",R.drawable.charizard));
        especies.add(new Especie("#007","Squirtle","Agua","Velocidad:30","Ataque:12","Defensa:8",R.drawable.squirtle));
    }
    public void inicializaAdaptador(){
        adaptador = new EspecieAdaptador(especies);
        listaEspecies.setAdapter(adaptador);
    }
}
