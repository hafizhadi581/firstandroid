package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule8;
import com.example.asdscreening.rules.Rules;

public class EighthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG =  "Activity 8: ";
    private Rules rules = Rules.getInstance();

    private ImageView ivQ81;
    private CheckBox cbInterestedNotBrotherSister;
    private CheckBox cbRespondToOtherChildren;
    private CheckBox cbPlayingWithOtherChildren;
    private CheckBox cbTalkingToOtherChildren;
    private CheckBox cbBabbleOrMakeNoise;
    private CheckBox cbWatchingOtherChildren;
    private CheckBox cbSmillingAtOtherChildren;
    private CheckBox cbActingShyAtOtherChildren;
    private CheckBox cbGettingExcitedAtOtherChildren;
    private CheckBox cbRespondToOtherChildrenHalfOfTime;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eightth_question);

        cbInterestedNotBrotherSister = findViewById(R.id.cb_interest);
        cbRespondToOtherChildren = findViewById(R.id.cb_respond);
        cbPlayingWithOtherChildren = findViewById(R.id.cb_play);
        cbTalkingToOtherChildren = findViewById(R.id.cb_talk);
        cbBabbleOrMakeNoise = findViewById(R.id.cb_noise);
        cbWatchingOtherChildren = findViewById(R.id.cb_watch);
        cbSmillingAtOtherChildren = findViewById(R.id.cb_smile);
        cbActingShyAtOtherChildren = findViewById(R.id.cb_shy);
        cbGettingExcitedAtOtherChildren = findViewById(R.id.cb_excited);
        cbRespondToOtherChildrenHalfOfTime = findViewById(R.id.cb_respond_2);

        ivQ81 = findViewById(R.id.iv_q81);
        ivQ81.setOnClickListener(this);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {

            case R.id.cb_interest:

                if (checked)
                    hideCbInterest();
                    //do things when checked
                else
                    showCbInterest();
                // do things when unchecked
                break;

        }

    }

    private void hideCbInterest(){
        View cbRespondHide = findViewById(R.id.cb_respond);
        cbRespondHide.setVisibility(View.GONE);
        View tvYq82Hide = findViewById(R.id.tv_yq82);
        tvYq82Hide.setVisibility(View.GONE);


        View tvYq812Hide= findViewById(R.id.tv_yq812);
        tvYq812Hide.setVisibility(View.GONE);

        View cbPlayHide = findViewById(R.id.cb_play);
        cbPlayHide.setVisibility(View.GONE);
        View tvYq83Hide= findViewById(R.id.tv_yq83);
        tvYq83Hide.setVisibility(View.GONE);

        View cbTalkHide = findViewById(R.id.cb_talk);
        cbTalkHide.setVisibility(View.GONE);
        View tvYq84Hide= findViewById(R.id.tv_yq84);
        tvYq84Hide.setVisibility(View.GONE);

        View cbNoisesHide = findViewById(R.id.cb_noise);
        cbNoisesHide.setVisibility(View.GONE);
        View tvYq85Hide= findViewById(R.id.tv_yq85);
        tvYq85Hide.setVisibility(View.GONE);

        View cbWatchHide = findViewById(R.id.cb_watch);
        cbWatchHide.setVisibility(View.GONE);
        View tvYq86Hide= findViewById(R.id.tv_yq86);
        tvYq86Hide.setVisibility(View.GONE);

        View cbSmileHide = findViewById(R.id.cb_smile);
        cbSmileHide.setVisibility(View.GONE);
        View tvYq87Hide= findViewById(R.id.tv_yq87);
        tvYq87Hide.setVisibility(View.GONE);

        View cbShyHide = findViewById(R.id.cb_shy);
        cbShyHide.setVisibility(View.GONE);
        View tvYq89Hide= findViewById(R.id.tv_yq89);
        tvYq89Hide.setVisibility(View.GONE);

        View cbExcitedShyHide = findViewById(R.id.cb_excited);
        cbExcitedShyHide.setVisibility(View.GONE);
        View tvYq810Hide= findViewById(R.id.tv_yq810);
        tvYq810Hide.setVisibility(View.GONE);

        View cbRespond2Hide = findViewById(R.id.cb_respond_2);
        cbRespond2Hide.setVisibility(View.GONE);
        View tvYq811Hide= findViewById(R.id.tv_yq811);
        tvYq811Hide.setVisibility(View.GONE);
    }
    private void showCbInterest(){

        View cbRespondShow = findViewById(R.id.cb_respond);
        cbRespondShow.setVisibility(View.VISIBLE);
        View tvYq82Show = findViewById(R.id.tv_yq82);
        tvYq82Show.setVisibility(View.VISIBLE);


        View tvYq812Show= findViewById(R.id.tv_yq812);
        tvYq812Show.setVisibility(View.VISIBLE);

        View cbPlayShow = findViewById(R.id.cb_play);
        cbPlayShow.setVisibility(View.VISIBLE);
        View tvYq83Show= findViewById(R.id.tv_yq83);
        tvYq83Show.setVisibility(View.VISIBLE);

        View cbTalkShow = findViewById(R.id.cb_talk);
        cbTalkShow.setVisibility(View.VISIBLE);
        View tvYq84Show= findViewById(R.id.tv_yq84);
        tvYq84Show.setVisibility(View.VISIBLE);

        View cbNoisesShow = findViewById(R.id.cb_noise);
        cbNoisesShow.setVisibility(View.VISIBLE);
        View tvYq85Show= findViewById(R.id.tv_yq85);
        tvYq85Show.setVisibility(View.VISIBLE);

        View cbWatchShow = findViewById(R.id.cb_watch);
        cbWatchShow.setVisibility(View.VISIBLE);
        View tvYq86Show= findViewById(R.id.tv_yq86);
        tvYq86Show.setVisibility(View.VISIBLE);

        View cbSmileShow = findViewById(R.id.cb_smile);
        cbSmileShow.setVisibility(View.VISIBLE);
        View tvYq87Show= findViewById(R.id.tv_yq87);
        tvYq87Show.setVisibility(View.VISIBLE);

        View cbShyShow = findViewById(R.id.cb_shy);
        cbShyShow.setVisibility(View.VISIBLE);
        View tvYq89Show= findViewById(R.id.tv_yq89);
        tvYq89Show.setVisibility(View.VISIBLE);

        View cbExcitedShyShow = findViewById(R.id.cb_excited);
        cbExcitedShyShow.setVisibility(View.VISIBLE);
        View tvYq810Show= findViewById(R.id.tv_yq810);
        tvYq810Show.setVisibility(View.VISIBLE);

        View cbRespond2Show = findViewById(R.id.cb_respond_2);
        cbRespond2Show.setVisibility(View.VISIBLE);
        View tvYq811Show= findViewById(R.id.tv_yq811);
        tvYq811Show.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View v) {
        if(v == ivQ81){

            rules.setRule8(new Rule8(cbInterestedNotBrotherSister.isChecked(),
            cbRespondToOtherChildren.isChecked(),
            cbPlayingWithOtherChildren.isChecked(),
            cbTalkingToOtherChildren.isChecked(),
            cbBabbleOrMakeNoise.isChecked(),
            cbWatchingOtherChildren.isChecked(),
            cbSmillingAtOtherChildren.isChecked(),
            cbActingShyAtOtherChildren.isChecked(),
            cbGettingExcitedAtOtherChildren.isChecked(),
            cbRespondToOtherChildrenHalfOfTime.isChecked()));
            Intent intent = new Intent(EighthQuestionActivity.this, CalculateScoreActivity.class);
            startActivity(intent);
        }
    }
}
