package com.example.asdscreening;


import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule14;
import com.example.asdscreening.rules.Rules;

public class FourteenthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "Activity 14: ";
    private Rules rules = Rules.getInstance();

    private CheckBox isLookForNeed;
    private CheckBox isLookForPlay;
    private CheckBox isLookForFeed;
    private CheckBox isLookForDiaper;
    private CheckBox isLookForRead;
    private CheckBox isLookForTalk;
    private CheckBox isLookForEye;
    private CheckBox isLookFor5Times;
    private ImageView ivQ141;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteenth_question);

        isLookForNeed = findViewById(R.id.cb_look_need);
        isLookForPlay = findViewById(R.id.cb_look_play);
        isLookForFeed = findViewById(R.id.cb_look_feeding);
        isLookForDiaper = findViewById(R.id.cb_look_diaper);
        isLookForRead = findViewById(R.id.cb_look_reading);
        isLookForTalk = findViewById(R.id.cb_look_talk);
        isLookForEye = findViewById(R.id.cb_look_eye);
        isLookFor5Times = findViewById(R.id.cb_look_5times);
        ivQ141 = findViewById(R.id.iv_q141);
        ivQ141.setOnClickListener(this);

    }

   
    @Override
    public void onClick(View v) {
        if (v == ivQ141) {

            rules.setRule14(new Rule14(isLookForNeed.isChecked(),
                    isLookForPlay.isChecked(),
                    isLookForFeed.isChecked(),
                    isLookForDiaper.isChecked(),
                    isLookForRead.isChecked(),
                    isLookForTalk.isChecked(),
                    isLookForEye.isChecked(),
                    isLookFor5Times.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());

            Intent intent = new Intent(FourteenthQuestionActivity.this, CalculateScoreActivity.class);
            startActivity(intent);
        }
    }
}
