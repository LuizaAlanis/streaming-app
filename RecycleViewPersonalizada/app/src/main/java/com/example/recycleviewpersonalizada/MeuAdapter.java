package com.example.recycleviewpersonalizada;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//essa classe tem métodos abstatros
public class MeuAdapter extends RecyclerView.Adapter <MeuAdapter.MeuViewHolder> {

    ArrayList<DtoFilme> arrayListFilm;
    public MeuAdapter(ArrayList<DtoFilme> arrayListFilm) {
        this.arrayListFilm = arrayListFilm;
    }

    //um que cria
    @NonNull
    @Override
    public MeuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.meu_adapter,parent,false);
        return new MeuViewHolder(itemLista);
    }

    //o que faz a ligação
    @Override
    public void onBindViewHolder(@NonNull MeuViewHolder holder, int position) {
        holder.textViewTitulo.setText(arrayListFilm.get(position).getTitulo());
        holder.textViewNota.setText(arrayListFilm.get(position).getNota());
        holder.textViewAno.setText(arrayListFilm.get(position).getAno());
        holder.textViewGenero.setText(arrayListFilm.get(position).getGenero());
        holder.imageViewFilme.setImageResource(arrayListFilm.get(position).getIdImagem());
    }

    //o que define o tamanho dos itens da lista
    @Override
    public int getItemCount() {
        return arrayListFilm.size();
    }

    public class MeuViewHolder extends RecyclerView.ViewHolder{
        TextView textViewTitulo, textViewNota, textViewAno, textViewGenero;
        ImageView imageViewFilme;

        public MeuViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewTitulo = itemView.findViewById(R.id.textViewTitulo);
            textViewNota = itemView.findViewById(R.id.textViewNota);
            textViewAno = itemView.findViewById(R.id.textViewAno);
            textViewGenero = itemView.findViewById(R.id.textViewGenero);
            imageViewFilme = itemView.findViewById(R.id.imageViewFilme);
        }
    }
}
