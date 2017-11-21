package com.example.luciano.pokedex;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Luciano on 15/11/2017.
 */

public class EspecieAdaptador extends RecyclerView.Adapter<EspecieAdaptador.EspecieViewHoder> {

    public static final String ID = "ID";
    public static final String NOMBRE = "NOMBRE";
    public static final String TIPO = "TIPO";
    public static final String VELOCIDAD = "VELOCIDAD";
    public static final String ATAQUE = "ATAQUE";
    public static final String DEFENSA = "DEFENSA";
   // public static final Integer IMAGE = Integer.valueOf("IMAGE");

    private List<Especie> especies;
    public EspecieAdaptador (List<Especie> especies){
        this.especies = especies;
    }

    @Override
    public EspecieViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new EspecieViewHoder(v);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(EspecieViewHoder especieViewHoder, int position) {
        Especie especie = especies.get(position);
        especieViewHoder.idEspecie.setText(especie.getnId());
        especieViewHoder.nombreEspecie.setText(especie.getnEspecie());
        especieViewHoder.tipoEspecie.setText(especie.getnTipo());
       // especieViewHoder.fotoEspecie.setImageAlpha(especie.getnFoto());

    }

    @Override
    public int getItemCount() {
        return especies.size();
    }

    public class EspecieViewHoder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView idEspecie;
        private TextView nombreEspecie;
        private TextView tipoEspecie;
        private ImageView fotoEspecie;


        public EspecieViewHoder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);
            idEspecie = itemView.findViewById(R.id.idEspecie);
            nombreEspecie = itemView.findViewById(R.id.nombreEspecie);
            tipoEspecie = itemView.findViewById(R.id.tipoEspecie);
            fotoEspecie = (ImageView) itemView.findViewById(R.id.imageView);

        }

        @Override
        public void onClick(View v) {
            Context context = v.getContext();
            int position = getAdapterPosition();
            Especie especie = especies.get(position);
            Intent intent = new Intent(v.getContext(),EspecieDescripcion.class);
            intent.putExtra(ID,especie.getnId());
            intent.putExtra(NOMBRE, especie.getnEspecie());
            intent.putExtra(TIPO, especie.getnTipo());
            intent.putExtra(VELOCIDAD,especie.getnVelocidad());
            intent.putExtra(ATAQUE,especie.getnAtaque());
            intent.putExtra(DEFENSA,especie.getnDefensa());
           // intent.putExtra(String.valueOf(IMAGE),especie.getnFoto());

            context.startActivity(intent);

        }
    }
}
