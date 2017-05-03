package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_now_playing);

        // Find the View that shows each Activity
        ImageView songsButton = (ImageView)findViewById(R.id.songs_Button);
        ImageView albumButton = (ImageView)findViewById(R.id.album_Button);
        ImageView artistButton = (ImageView)findViewById(R.id.artist_Button);
        ImageView genreButton = (ImageView)findViewById(R.id.genre_Button);
        ImageView lyricsButton = (ImageView)findViewById(R.id.lyrics_Button);

        // Set a click listener on Activity-selection Views
        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(NowPlaying.this, PlaylistActivity.class);
                startActivity(songsIntent);
            }
        });

        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent albumIntent = new Intent(NowPlaying.this, MusicLibraryActivity.class);
                startActivity(albumIntent);
            }
        });

        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(NowPlaying.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        genreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(NowPlaying.this, EqualizerActivity.class);
                startActivity(genreIntent);
            }
        });

        lyricsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lyricsIntent = new Intent(NowPlaying.this, LyricsActivity.class);
                startActivity(lyricsIntent);
            }
        });
    }

}
