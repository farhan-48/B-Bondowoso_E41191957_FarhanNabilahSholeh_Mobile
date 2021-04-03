package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
//    RecyclerViewAdapter adapter;
    int[] img;
    String[] title;
    String[] desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recycler_view);

        img = new int[] {
                R.drawable.papuma,
                R.drawable.puger,
                R.drawable.watu_ulo,
                R.drawable.teluk_love,
                R.drawable.perkebunan_teh_gunung_gambir,
                R.drawable.nusa_barong,
        };

        title = getResources().getStringArray(R.array.title);

        desc = getResources().getStringArray(R.array.desc);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, img, title, desc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}