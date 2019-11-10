package com.example.asdscreening;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnStart;
    ImageButton btnAbout;
    ImageButton btnExit;
    ImageButton btnSetting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.music);
        mediaPlayer.start();

        btnStart = findViewById(R.id.btn_start); //start button
        btnAbout = findViewById(R.id.btn_about);
        btnExit = findViewById(R.id.btn_exit);
        btnSetting = findViewById(R.id.btn_setting);

        btnStart.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnExit.setOnClickListener(this);
        btnSetting.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v == btnStart) {
            Intent intent = new Intent(MainActivity.this, FirstQuestionActivity.class);
            startActivity(intent);
        }
        if (v == btnAbout) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        }
        if (v == btnSetting){
            Intent intent = new Intent (MainActivity.this, SettingActivity.class);
            startActivity(intent);
        }
        if (v == btnExit) {
            Intent homeIntent = new Intent(Intent.ACTION_MAIN);
            homeIntent.addCategory( Intent.CATEGORY_HOME );
            homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(homeIntent);
        }
    }

}
