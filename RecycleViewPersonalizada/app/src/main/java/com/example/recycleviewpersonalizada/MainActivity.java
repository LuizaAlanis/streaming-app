package com.example.recycleviewpersonalizada;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<DtoFilme> arrayListFilm = new ArrayList<>();
    RecyclerView recyclerViewFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewFilm = findViewById(R.id.recycleViewFilm);

        carregaFilmes();
        MeuAdapter adapter = new MeuAdapter(arrayListFilm);

        recyclerViewFilm.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerViewFilm.setAdapter(adapter);
    }

    private void carregaFilmes() {
        DtoFilme filme = new DtoFilme("Um sonho de liberdade", "1994", "★9.2","Drama", R.drawable.sonho);
        DtoFilme filme2 = new DtoFilme("O poderoso chefão", "1972", "★9.1","Drama", R.drawable.chefao1);
        DtoFilme filme6 = new DtoFilme("O poderoso chefão 2", "1974", "★9.0","Drama", R.drawable.chefao2);
        DtoFilme filme3 = new DtoFilme("Cavalheiro das trevas", "2008", "★9.0","Aventura", R.drawable.batman);
        DtoFilme filme4 = new DtoFilme("12 Homens e uma sentença", "1957", "★8.9","Drama", R.drawable.sentenca);
        DtoFilme filme5 = new DtoFilme("A lista de schindler", "1993", "★8.9","Drama", R.drawable.lista);

        arrayListFilm.add(filme);
        arrayListFilm.add(filme2);
        arrayListFilm.add(filme3);
        arrayListFilm.add(filme4);
        arrayListFilm.add(filme5);
        arrayListFilm.add(filme6);
    }
}
