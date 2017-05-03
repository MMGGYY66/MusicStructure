package com.example.android.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_playlist);

        // Find the View that shows each Activity
        ImageView nowPlayingButton = (ImageView)findViewById(R.id.nowPlaying_Button);
        ImageView albumButton = (ImageView)findViewById(R.id.album_Button);
        ImageView artistButton = (ImageView)findViewById(R.id.artist_Button);
        ImageView genreButton = (ImageView)findViewById(R.id.genre_Button);
        ImageView lyricsButton = (ImageView)findViewById(R.id.lyrics_Button);

        // Set a click listener on Activity-selection Views
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(PlaylistActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent albumIntent = new Intent(PlaylistActivity.this, MusicLibraryActivity.class);
                startActivity(albumIntent);
            }
        });

        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(PlaylistActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        genreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(PlaylistActivity.this, EqualizerActivity.class);
                startActivity(genreIntent);
            }
        });

        lyricsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lyricsIntent = new Intent(PlaylistActivity.this, LyricsActivity.class);
                startActivity(lyricsIntent);
            }
        });
    }
}
