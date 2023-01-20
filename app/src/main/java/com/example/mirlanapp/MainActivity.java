package com.example.mirlanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GameAdapter adapter;
    private ArrayList<Game> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        fellList();
        setAdater();
    }

    private void findViews() {
        recyclerView = findViewById(R.id.recyclerViewGame);

    }

    private void fellList(){
        arrayList = new ArrayList<>();

        arrayList.add(new Game("God of War Ragnarok", "God of War 2: Ragnarok События новой игры разворачиваются спустя некоторое время после оригинала", R.drawable.maxresdefault));
        arrayList.add(new Game("Horizon West", " Horizon Forbidden West представляет собой Action/RPG с видом от третьего лица. ", R.drawable.hhhh));
        arrayList.add(new Game("Elden Ring", "Игра с открытым миром;", R.drawable.header));
        arrayList.add(new Game("FIFA 23", "Игра в жанре симулятора футбола;", R.drawable.capsule));
        arrayList.add(new Game("Sifu", "Экшен от третьего лица ", R.drawable.ssss));
        arrayList.add(new Game("Rome", "MMO RPG", R.drawable.RRRRR));
    }

    private void setAdater(){
        adapter = new GameAdapter(arrayList);
        recyclerView.setAdapter(adapter);
    }
}