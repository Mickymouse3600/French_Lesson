package com.example.mickymouse.french_phrase;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    public void ButtonTapped(View view){


     int id= view.getId();
     String ourid;
     ourid=view.getResources().getResourceEntryName(id);
        Log.i("Ourid" ,ourid);
     int resourceId= getResources().getIdentifier(ourid,"raw","com.example.mickymouse.french_phrase");
        Log.i("Resource" ,String.valueOf(resourceId));
        MediaPlayer Mplayer = MediaPlayer.create(this, resourceId);
        Mplayer.start();

        Log.i("button tapped" ,ourid);
    }
}
