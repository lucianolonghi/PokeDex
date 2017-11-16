package com.example.luciano.pokedex;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Luciano on 15/11/2017.
 */

public class EspecieAdaptador extends RecyclerView.Adapter<EspecieAdaptador.EspecieViewHoder> {

    private List<Especie> especies;
    public EspecieAdaptador (List<Especie> especies){
        this.especies = especies;
    }

    @Override
    public EspecieViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new EspecieViewHoder(v);
    }

    @Override
    public void onBindViewHolder(EspecieViewHoder especieViewHoder, int position) {
        Especie especie = especies.get(position);
        especieViewHoder.nombreEspecie.setText(especie.getnEspecie());
        especieViewHoder.tipoEspecie.setText(especie.getnTipo());
    }

    @Override
    public int getItemCount() {
        return especies.size();
    }

    public class EspecieViewHoder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView nombreEspecie;
        private TextView tipoEspecie;

        public EspecieViewHoder(View itemView){
            super(itemView);
            nombreEspecie = itemView.findViewById(R.id.nombreEspecie);
            tipoEspecie = itemView.findViewById(R.id.tipoEspecie);
        }

        @Override
        public void onClick(View v) {
            Context context = v.getContext();
            int position = getAdapterPosition();
            Especie especie = especies.get(position);
            Intent intent = new Intent(v.getContext(),);
        }
    }
}
