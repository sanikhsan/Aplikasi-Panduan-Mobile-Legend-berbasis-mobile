package com.san.project.panduanmoba8bit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvArtikel;
    private ArrayList<Postingan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvArtikel = findViewById(R.id.rv_article);
        rvArtikel.setHasFixedSize(true);

        list.addAll(Artikel.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvArtikel.setLayoutManager(new LinearLayoutManager(this));
        ArtikelAdapter artikelAdapter = new ArtikelAdapter(list);
        rvArtikel.setAdapter(artikelAdapter);
    }
}
