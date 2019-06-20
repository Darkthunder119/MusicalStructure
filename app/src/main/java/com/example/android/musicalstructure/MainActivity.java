package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nowPlayingView = findViewById(R.id.now_playing);

        Button libraryView = findViewById(R.id.library);

        nowPlayingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(playingIntent);
            }
        });

        libraryView.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent libraryIntent = new Intent(MainActivity.this, Library.class);
                                          startActivity(libraryIntent);

                                      }

                                  }
        );
    }
}
