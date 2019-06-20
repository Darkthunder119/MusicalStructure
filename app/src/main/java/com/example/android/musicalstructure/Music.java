package com.example.android.musicalstructure;

public class Music {

    private String mSongName;
    private String mArtistName;

    public Music(String songName , String artistName)
    {
        mSongName = songName;
        mArtistName = artistName;
    }

    public String getmSongName()
    {
        return mSongName;
    }

    public String getmArtistName() {
        return mArtistName;
    }
}
