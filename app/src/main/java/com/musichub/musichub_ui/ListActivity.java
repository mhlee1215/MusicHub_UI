package com.musichub.musichub_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        List<Music> musicList = new ArrayList<Music>();

        for (int i = 0; i < 30; i++) {

            musicList.add(new Music("Title_"+i, "Signer_"+i));
        }


        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new ListAdapter(this, musicList));
    }
}
