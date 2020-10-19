package com.example.myapplication.myapplication10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.myapplication10.adapter.TrucAdapter;
import com.example.myapplication.myapplication10.adapter.bo.Truc;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Truc> listeTruc = new ArrayList<>();
        listeTruc.add(new Truc("Soliers", "14540"));
        listeTruc.add(new Truc("Caen", "14000"));
        listeTruc.add(new Truc("Rennes", "35000"));
        listeTruc.add(new Truc("Nantes", "44000"));
        TrucAdapter adapter = new TrucAdapter(this, R.layout.presentation_ligne, listeTruc);

        ListView liste = findViewById(R.id.ma_liste);
        liste.setAdapter(adapter);
    }
}