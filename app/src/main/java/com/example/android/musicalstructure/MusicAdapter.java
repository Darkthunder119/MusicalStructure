package com.example.android.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter {
    public MusicAdapter(Context context, ArrayList<Music> music)
    {
        super(context, 0, music);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.text_output_library, parent, false);
        }
        Music music =  (Music) getItem(position);
        // Find the TextView in the library_list.xml layout with the ID version_name
        TextView songTextView =  listItemView.findViewById(R.id.song_Name_view);
        // set this text on the songTextView
        songTextView.setText(music.getmSongName());

        // Find artistTextView and setText the ArtistName
        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);

        artistTextView.setText(music.getmArtistName());

        return listItemView;
    }
}