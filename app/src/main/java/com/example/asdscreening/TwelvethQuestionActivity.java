package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule12;
import com.example.asdscreening.rules.Rules;

public class TwelvethQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG =  "Activity 12: ";
    private Rules rules = Rules.getInstance();

    private CheckBox isReactSoundWashing;
    private CheckBox isReactSoundBabies;
    private CheckBox isReactSoundVaccuum;
    private CheckBox isReactSoundHairDryer;
    private CheckBox isReactSoundTraffic;
    private CheckBox isReactSoundBabies2;
    private CheckBox isReactSoundMusic;
    private CheckBox isReactSoundDoorBell;
    private CheckBox isReactSoundSuperMarket;

    private CheckBox isReactCoverEars;
    private CheckBox isReactLikingNoise;
    private CheckBox isReactSoundScream;
    private CheckBox isReactSoundCry;
    private CheckBox isReactSoundCover;
    private ImageView ivQ121;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelveth_question);


        isReactSoundWashing = findViewById(R.id.cb_sounds_washing);
        isReactSoundBabies = findViewById(R.id.cb_sound_babies);
        isReactSoundVaccuum = findViewById(R.id.cb_sounds_vacuum);
        isReactSoundHairDryer = findViewById(R.id.cb_sounds_hairdryer);
        isReactSoundTraffic = findViewById(R.id.cb_sounds_traffic);
        isReactSoundBabies2 = findViewById(R.id.cb_sounds_babies2);
        isReactSoundMusic = findViewById(R.id.cb_sounds_music);
        isReactSoundDoorBell = findViewById(R.id.cb_sounds_doorbell);
        isReactSoundSuperMarket = findViewById(R.id.cb_sounds_supermarket);

        isReactCoverEars = findViewById(R.id.cb_react_ears);
        isReactLikingNoise = findViewById(R.id.cb_like_noise);
        isReactSoundScream = findViewById(R.id.cb_react_scream);
        isReactSoundCry = findViewById(R.id.cb_react_cry);
        isReactSoundCover = findViewById(R.id.cb_react_cover);
        ivQ121 = findViewById(R.id.iv_q121);
        ivQ121.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == ivQ121){


            rules.setRule12(new Rule12(isReactSoundWashing.isChecked(), isReactSoundBabies.isChecked(), isReactSoundVaccuum.isChecked(), isReactSoundHairDryer.isChecked(),
            isReactSoundTraffic.isChecked(), isReactSoundBabies2.isChecked(), isReactSoundMusic.isChecked(), isReactSoundDoorBell.isChecked(),
            isReactSoundSuperMarket .isChecked(), isReactCoverEars.isChecked(), isReactLikingNoise.isChecked(), isReactSoundScream.isChecked(),
            isReactSoundCry.isChecked(), isReactSoundCover.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());
            Intent intent = new Intent(TwelvethQuestionActivity.this, ThirteenthQuestionActivity.class);
            startActivity(intent);
        }
    }
}
