package com.example.android.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EqualizerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_equalizer);

        // Find the View that shows each Activity
        ImageView nowPlayingButton = (ImageView)findViewById(R.id.nowPlaying_Button);
        ImageView songsButton = (ImageView)findViewById(R.id.songs_Button);
        ImageView albumButton = (ImageView)findViewById(R.id.album_Button);
        ImageView artistButton = (ImageView)findViewById(R.id.artist_Button);
        ImageView lyricsButton = (ImageView)findViewById(R.id.lyrics_Button);

        // Set a click listener on Activity-selection Views

        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(EqualizerActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(EqualizerActivity.this, PlaylistActivity.class);
                startActivity(songsIntent);
            }
        });

        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent albumIntent = new Intent(EqualizerActivity.this, MusicLibraryActivity.class);
                startActivity(albumIntent);
            }
        });

        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(EqualizerActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        lyricsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lyricsIntent = new Intent(EqualizerActivity.this, LyricsActivity.class);
                startActivity(lyricsIntent);
            }
        });
    }
}
