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

    private CheckBox cbIsUpset;
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

        cbIsUpset = findViewById(R.id.cb_upset);
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

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {

            case R.id.cb_upset:

                if (checked)
                    showCbUpset();
                    //do things when checked
                else
                    hideCbUpset();
                // do things when unchecked
                break;

        }

    }


    public void showCbUpset(){

        View tvYq121Show = findViewById(R.id.tv_yq121);
        tvYq121Show.setVisibility(View.VISIBLE);

        View cbSoundsWashingShow = findViewById(R.id.cb_sounds_washing);
        cbSoundsWashingShow.setVisibility(View.VISIBLE);
        View tvYq122Show = findViewById(R.id.tv_yq122);
        tvYq122Show.setVisibility(View.VISIBLE);

        View cbSoundsBabiesShow = findViewById(R.id.cb_sound_babies);
        cbSoundsBabiesShow.setVisibility(View.VISIBLE);
        View tvYq123Show = findViewById(R.id.tv_yq123);
        tvYq123Show.setVisibility(View.VISIBLE);

        View cbSoundsVacuumShow = findViewById(R.id.cb_sounds_vacuum);
        cbSoundsVacuumShow.setVisibility(View.VISIBLE);
        View tvYq124Show = findViewById(R.id.tv_yq124);
        tvYq124Show.setVisibility(View.VISIBLE);

        View cbSoundsHairDryerShow = findViewById(R.id.cb_sounds_hairdryer);
        cbSoundsHairDryerShow.setVisibility(View.VISIBLE);
        View tvYq125Show = findViewById(R.id.tv_yq125);
        tvYq125Show.setVisibility(View.VISIBLE);

        View cbSoundsTrafficShow = findViewById(R.id.cb_sounds_traffic);
        cbSoundsTrafficShow.setVisibility(View.VISIBLE);
        View tvYq126Show = findViewById(R.id.tv_yq126);
        tvYq126Show.setVisibility(View.VISIBLE);

        View cbSoundsBabies2Show = findViewById(R.id.cb_sounds_babies2);
        cbSoundsBabies2Show.setVisibility(View.VISIBLE);
        View tvYq127Show = findViewById(R.id.tv_yq127);
        tvYq127Show.setVisibility(View.VISIBLE);

        View cbSoundsMusicShow = findViewById(R.id.cb_sounds_music);
        cbSoundsMusicShow.setVisibility(View.VISIBLE);
        View tvYq128Show = findViewById(R.id.tv_yq128);
        tvYq128Show.setVisibility(View.VISIBLE);

        View cbSoundsDoorBellShow = findViewById(R.id.cb_sounds_doorbell);
        cbSoundsDoorBellShow.setVisibility(View.VISIBLE);
        View tvYq129Show = findViewById(R.id.tv_yq129);
        tvYq129Show.setVisibility(View.VISIBLE);

        View cbSoundsSuperMarketShow = findViewById(R.id.cb_sounds_supermarket);
        cbSoundsSuperMarketShow.setVisibility(View.VISIBLE);
        View tvYq1210Show = findViewById(R.id.tv_yq1210);
        tvYq1210Show.setVisibility(View.VISIBLE);

    }
    public void hideCbUpset(){

        View tvYq121Hide = findViewById(R.id.tv_yq121);
        tvYq121Hide.setVisibility(View.GONE);

        View cbSoundsWashingHide = findViewById(R.id.cb_sounds_washing);
        cbSoundsWashingHide.setVisibility(View.GONE);
        View tvYq122Hide = findViewById(R.id.tv_yq122);
        tvYq122Hide.setVisibility(View.GONE);

        View cbSoundsBabiesHide = findViewById(R.id.cb_sound_babies);
        cbSoundsBabiesHide.setVisibility(View.GONE);
        View tvYq123Hide = findViewById(R.id.tv_yq123);
        tvYq123Hide.setVisibility(View.GONE);

        View cbSoundsVacuumHide = findViewById(R.id.cb_sounds_vacuum);
        cbSoundsVacuumHide.setVisibility(View.GONE);
        View tvYq124Hide = findViewById(R.id.tv_yq124);
        tvYq124Hide.setVisibility(View.GONE);

        View cbSoundsHairDryerHide = findViewById(R.id.cb_sounds_hairdryer);
        cbSoundsHairDryerHide.setVisibility(View.GONE);
        View tvYq125Hide = findViewById(R.id.tv_yq125);
        tvYq125Hide.setVisibility(View.GONE);

        View cbSoundsTrafficHide = findViewById(R.id.cb_sounds_traffic);
        cbSoundsTrafficHide.setVisibility(View.GONE);
        View tvYq126Hide = findViewById(R.id.tv_yq126);
        tvYq126Hide.setVisibility(View.GONE);

        View cbSoundsBabies2Hide = findViewById(R.id.cb_sounds_babies2);
        cbSoundsBabies2Hide.setVisibility(View.GONE);
        View tvYq127Hide = findViewById(R.id.tv_yq127);
        tvYq127Hide.setVisibility(View.GONE);

        View cbSoundsMusicHide = findViewById(R.id.cb_sounds_music);
        cbSoundsMusicHide.setVisibility(View.GONE);
        View tvYq128Hide = findViewById(R.id.tv_yq128);
        tvYq128Hide.setVisibility(View.GONE);

        View cbSoundsDoorBellHide = findViewById(R.id.cb_sounds_doorbell);
        cbSoundsDoorBellHide.setVisibility(View.GONE);
        View tvYq129Hide = findViewById(R.id.tv_yq129);
        tvYq129Hide.setVisibility(View.GONE);

        View cbSoundsSuperMarketHide = findViewById(R.id.cb_sounds_supermarket);
        cbSoundsSuperMarketHide.setVisibility(View.GONE);
        View tvYq1210Hide = findViewById(R.id.tv_yq1210);
        tvYq1210Hide.setVisibility(View.GONE);

    }

    @Override
    public void onClick(View v) {
        if (v == ivQ121) {


            rules.setRule12(new Rule12(cbIsUpset.isChecked(),cbReactSoundWashing.isChecked(), cbReactSoundBabies.isChecked(), cbReactSoundVaccuum.isChecked(), cbReactSoundHairDryer.isChecked(),
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
