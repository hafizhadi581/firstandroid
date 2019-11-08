package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule17;
import com.example.asdscreening.rules.Rules;

public class SeventhteenthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private Rules rules = Rules.getInstance();
    private final String TAG = "Activity 17: ";

    private CheckBox cbWatchMe;
    private CheckBox cbWatchBabble;
    private CheckBox cbsWatchPraise;
    private CheckBox cbWatchLook;
    private ImageView ivQ171;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventeenth_question);

        cbWatchMe = findViewById(R.id.cb_watch_me);
        cbWatchBabble = findViewById(R.id.cb_watch_babble);
        cbsWatchPraise = findViewById(R.id.cb_praise);
        cbWatchLook = findViewById(R.id.cb_watch_look);

        ivQ171 = findViewById(R.id.iv_q171);
        ivQ171.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == ivQ171) {
            rules.setRule17(new Rule17(cbWatchMe.isChecked(), cbWatchBabble.isChecked(), cbsWatchPraise.isChecked(), cbWatchLook.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());

            Intent intent = new Intent(SeventhteenthQuestionActivity.this, CalculateScoreActivity.class);
            startActivity(intent);
        }

    }
}
