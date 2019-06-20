package com.example.android.musicalstructure;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library_list);
        Toast.makeText(this, "Click a Song from the Library to Play", Toast.LENGTH_LONG).show();
        ArrayList<Music> musicName = new ArrayList<>();
        musicName.add(new Music("Just Let Go","Joyner Lucas"));
        musicName.add(new Music("I'm Sorry","Joyner Lucas"));
        musicName.add(new Music("I Love","Joyner Lucas"));
        musicName.add(new Music("Sucker","Jonas Brothers"));
        musicName.add(new Music("MIDDLE CHILD","J. Cole"));
        musicName.add(new Music("All The Small Things","blink-182"));
        musicName.add(new Music("The Hell Song","Sum 41"));

        MusicAdapter adapter = new MusicAdapter(this, musicName);

        final ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.isClickable();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Library.this, NowPlaying.class);
                startActivity(intent);
            }
        });
    }
}
