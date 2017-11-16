package com.example.luciano.pokedex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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
        especies.add(new Especie("Bulbasaur","Planta,Veneno"));
        especies.add(new Especie("Ivusaur","Planta,Veneno"));
        especies.add(new Especie("Venasaur","Planta,Veneno"));
        especies.add(new Especie("Charmander","Fuego"));
        especies.add(new Especie("Charmeleon","Fuego"));
        especies.add(new Especie("Charizard","Fuego,Volador"));
        especies.add(new Especie("Squirtle","Agua"));
    }
    public void inicializaAdaptador(){
        adaptador = new EspecieAdaptador(especies);
        listaEspecies.setAdapter(adaptador);
    }
}
