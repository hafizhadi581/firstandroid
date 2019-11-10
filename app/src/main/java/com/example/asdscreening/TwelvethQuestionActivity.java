package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule12;
import com.example.asdscreening.rules.Rules;

public class TwelvethQuestionActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private final String TAG = "Activity 12: ";
    private Rules rules = Rules.getInstance();


    private int numberOfTick = 0;

    private CheckBox cbReactSoundWashing;
    private CheckBox cbReactSoundBabies;
    private CheckBox cbReactSoundVaccuum;
    private CheckBox cbReactSoundHairDryer;
    private CheckBox cbReactSoundTraffic;
    private CheckBox cbReactSoundBabies2;
    private CheckBox cbReactSoundMusic;
    private CheckBox cbReactSoundDoorBell;
    private CheckBox cbReactSoundSuperMarket;

    private CheckBox cbReactCoverEars;
    private CheckBox cbReactLikingNoise;
    private CheckBox cbReactSoundScream;
    private CheckBox cbReactSoundCry;
    private CheckBox cbReactSoundCover;

    private ImageView ivQ121;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelveth_question);


        cbReactSoundWashing = findViewById(R.id.cb_sounds_washing);
        cbReactSoundBabies = findViewById(R.id.cb_sound_babies);
        cbReactSoundVaccuum = findViewById(R.id.cb_sounds_vacuum);
        cbReactSoundHairDryer = findViewById(R.id.cb_sounds_hairdryer);
        cbReactSoundTraffic = findViewById(R.id.cb_sounds_traffic);
        cbReactSoundBabies2 = findViewById(R.id.cb_sounds_babies2);
        cbReactSoundMusic = findViewById(R.id.cb_sounds_music);
        cbReactSoundDoorBell = findViewById(R.id.cb_sounds_doorbell);
        cbReactSoundSuperMarket = findViewById(R.id.cb_sounds_supermarket);

        cbReactCoverEars = findViewById(R.id.cb_react_ears);
        cbReactLikingNoise = findViewById(R.id.cb_like_noise);
        cbReactSoundScream = findViewById(R.id.cb_react_scream);
        cbReactSoundCry = findViewById(R.id.cb_react_cry);
        cbReactSoundCover = findViewById(R.id.cb_react_cover);

        ivQ121 = findViewById(R.id.iv_q121);



        cbReactSoundWashing.setOnCheckedChangeListener(this);
        cbReactSoundBabies.setOnCheckedChangeListener(this);
        cbReactSoundVaccuum.setOnCheckedChangeListener(this);
        cbReactSoundHairDryer.setOnCheckedChangeListener(this);
        cbReactSoundTraffic.setOnCheckedChangeListener(this);
        cbReactSoundBabies2.setOnCheckedChangeListener(this);
        cbReactSoundMusic.setOnCheckedChangeListener(this);
        cbReactSoundDoorBell.setOnCheckedChangeListener(this);
        cbReactSoundSuperMarket.setOnCheckedChangeListener(this);

        ivQ121.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == ivQ121) {


            rules.setRule12(new Rule12(cbReactSoundWashing.isChecked(), cbReactSoundBabies.isChecked(), cbReactSoundVaccuum.isChecked(), cbReactSoundHairDryer.isChecked(),
                    cbReactSoundTraffic.isChecked(), cbReactSoundBabies2.isChecked(), cbReactSoundMusic.isChecked(), cbReactSoundDoorBell.isChecked(),
                    cbReactSoundSuperMarket.isChecked(), cbReactCoverEars.isChecked(), cbReactLikingNoise.isChecked(), cbReactSoundScream.isChecked(),
                    cbReactSoundCry.isChecked(), cbReactSoundCover.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());
            Intent intent = new Intent(TwelvethQuestionActivity.this, ThirteenthQuestionActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b) {
            numberOfTick++;
        } else {
            numberOfTick--;
        }


        if (numberOfTick >= 2) {
            setVisibleItem();
        } else {
            setInvisibleItem();
            cbReactCoverEars.setChecked(false);
            cbReactLikingNoise.setChecked(false);
            cbReactSoundScream.setChecked(false);
            cbReactSoundCry.setChecked(false);
            cbReactSoundCover.setChecked(false);
        }
    }

    private void setVisibleItem() {
        View tYq1211Show = findViewById(R.id.tv_yq1211);
        tYq1211Show.setVisibility(View.VISIBLE);

        View tYq1212Show = findViewById(R.id.tv_yq1212);
        tYq1212Show.setVisibility(View.VISIBLE);
        View cbReactEarsShow = findViewById(R.id.cb_react_ears);
        cbReactEarsShow.setVisibility(View.VISIBLE);

        View tYq1216Show = findViewById(R.id.tv_yq1216);
        tYq1216Show.setVisibility(View.VISIBLE);
        View cbLikeNoiseShow = findViewById(R.id.cb_like_noise);
        cbLikeNoiseShow.setVisibility(View.VISIBLE);

        View tYq1213Show = findViewById(R.id.tv_yq1213);
        tYq1213Show.setVisibility(View.VISIBLE);
        View cbReactScreamShow = findViewById(R.id.cb_react_scream);
        cbReactScreamShow.setVisibility(View.VISIBLE);

        View tYq1214Show = findViewById(R.id.tv_yq1214);
        tYq1214Show.setVisibility(View.VISIBLE);
        View cbReactCryShow = findViewById(R.id.cb_react_cry);
        cbReactCryShow.setVisibility(View.VISIBLE);

        View tYq1215Show = findViewById(R.id.tv_yq1215);
        tYq1215Show.setVisibility(View.VISIBLE);
        View cbReactCoverShow = findViewById(R.id.cb_react_cover);
        cbReactCoverShow.setVisibility(View.VISIBLE);


    }

    private void setInvisibleItem() {

        View tYq1211Hide = findViewById(R.id.tv_yq1211);
        tYq1211Hide.setVisibility(View.GONE);

        View tYq1212Hide = findViewById(R.id.tv_yq1212);
        tYq1212Hide.setVisibility(View.GONE);
        View cbReactEarsHide = findViewById(R.id.cb_react_ears);
        cbReactEarsHide.setVisibility(View.GONE);

        View tYq1216Hide = findViewById(R.id.tv_yq1216);
        tYq1216Hide.setVisibility(View.GONE);
        View cbLikeNoiseHide = findViewById(R.id.cb_like_noise);
        cbLikeNoiseHide.setVisibility(View.GONE);

        View tYq1213Hide = findViewById(R.id.tv_yq1213);
        tYq1213Hide.setVisibility(View.GONE);
        View cbReactScreamHide = findViewById(R.id.cb_react_scream);
        cbReactScreamHide.setVisibility(View.GONE);

        View tYq1214Hide = findViewById(R.id.tv_yq1214);
        tYq1214Hide.setVisibility(View.GONE);
        View cbReactCryHide = findViewById(R.id.cb_react_cry);
        cbReactCryHide.setVisibility(View.GONE);

        View tYq1215Hide = findViewById(R.id.tv_yq1215);
        tYq1215Hide.setVisibility(View.GONE);
        View cbReactCoverHide = findViewById(R.id.cb_react_cover);
        cbReactCoverHide.setVisibility(View.GONE);


    }
}
