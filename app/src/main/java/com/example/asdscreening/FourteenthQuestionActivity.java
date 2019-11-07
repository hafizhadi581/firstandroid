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

    private CheckBox cbLookForNeed;
    private CheckBox cbLookForPlay;
    private CheckBox cbLookForFeed;
    private CheckBox cbLookForDiaper;
    private CheckBox cbLookForRead;
    private CheckBox cbLookForTalk;
    private CheckBox cbLookForEye;
    private CheckBox cbLookFor5Times;
    private ImageView ivQ141;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteenth_question);

        cbLookForNeed = findViewById(R.id.cb_look_need);
        cbLookForPlay = findViewById(R.id.cb_look_play);
        cbLookForFeed = findViewById(R.id.cb_look_feeding);
        cbLookForDiaper = findViewById(R.id.cb_look_diaper);
        cbLookForRead = findViewById(R.id.cb_look_reading);
        cbLookForTalk = findViewById(R.id.cb_look_talk);
        cbLookForEye = findViewById(R.id.cb_look_eye);
        cbLookFor5Times = findViewById(R.id.cb_look_5times);
        ivQ141 = findViewById(R.id.iv_q141);
        ivQ141.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (v == ivQ141) {

            rules.setRule14(new Rule14(cbLookForNeed.isChecked(),
                    cbLookForPlay.isChecked(),
                    cbLookForFeed.isChecked(),
                    cbLookForDiaper.isChecked(),
                    cbLookForRead.isChecked(),
                    cbLookForTalk.isChecked(),
                    cbLookForEye.isChecked(),
                    cbLookFor5Times.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());

            Intent intent = new Intent(FourteenthQuestionActivity.this, CalculateScoreActivity.class);
            startActivity(intent);
        }
    }
}
