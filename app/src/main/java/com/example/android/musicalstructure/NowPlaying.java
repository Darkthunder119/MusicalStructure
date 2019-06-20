package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        Button nowPlay = findViewById(R.id.play_button);
        nowPlay.setText(R.string.Play);

        nowPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this, "Playback would be heard if we had real files!", Toast.LENGTH_SHORT).show();
            }
        });

        Button nowLibrary = findViewById(R.id.library);

        nowLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NowPlaying.this, Library.class);
                startActivity(intent);
            }
        });

        Button nowHome = findViewById(R.id.home);
        nowHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
