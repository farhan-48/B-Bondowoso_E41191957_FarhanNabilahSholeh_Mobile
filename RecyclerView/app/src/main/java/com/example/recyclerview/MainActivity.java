package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    SimpleAdapter adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] title;
    String[] desc;
    String[] img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.list_view);

        title = new String[] {
          "Pantai Papuma",
          "Pantai Puger",
          "Pantai Watu Ulo",
          "Teluk Love",
          "Perkebunan Teh Gunung Gambir",
          "Pulau Nusa Barong",
        };

        desc = new String[] {
                getResources().getString(R.string.desc_pantai_papuma),
                getResources().getString(R.string.desc_patai_puger),
                getResources().getString(R.string.desc_watu_ulo),
                getResources().getString(R.string.desc_teluk_love),
                getResources().getString(R.string.desc_perkebunan_teh),
                getResources().getString(R.string.desc_nusa_barong),
        };
        img = new String[] {
                Integer.toString(R.drawable.papuma),
                Integer.toString(R.drawable.puger),
                Integer.toString(R.drawable.watu_ulo),
                Integer.toString(R.drawable.teluk_love),
                Integer.toString(R.drawable.perkebunan_teh_gunung_gambir),
                Integer.toString(R.drawable.nusa_barong),
        };

        mylist = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < title.length; i++) {
            map = new HashMap<String, String>();
            map.put("title", title[i]);
            map.put("desc", desc[i]);
            map.put("img", img[i]);
            mylist.add(map);
        }

        adapter = new SimpleAdapter(this,
                mylist,
                R.layout.list_item,
                new String[] {"title", "desc", "img"},
                new int[]{R.id.tv_title, R.id.tv_desc, R.id.img_thumbnail}
                );
        listview.setAdapter(adapter);
    }
}