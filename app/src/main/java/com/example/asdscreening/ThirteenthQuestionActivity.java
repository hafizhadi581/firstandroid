package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule13;
import com.example.asdscreening.rules.Rules;

public class ThirteenthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG =  "Activity 13: ";
    private Rules rules = Rules.getInstance();

    private CheckBox cbWalk;
    private CheckBox cbWalkOn;
    private ImageView ivQ131;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteenth_question);

        cbWalk = findViewById(R.id.cb_walk);
        cbWalkOn = findViewById(R.id.cb_walk_on);
        ivQ131 = findViewById(R.id.iv_q131);

        ivQ131.setOnClickListener(this);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {

            case R.id.cb_walk:

                if (checked)
                    showCbWalkOn();
                    //do things when checked
                else
                    hideCbWalkOn();
                // do things when unchecked
                break;

        }
    }
    private void showCbWalkOn(){
        View cbWalkOnShow = findViewById(R.id.cb_walk_on);
        cbWalkOnShow.setVisibility(View.VISIBLE);
        View tvYq132Show = findViewById(R.id.tv_yq132);
        tvYq132Show.setVisibility(View.VISIBLE);
    }
    private void hideCbWalkOn(){
        View cbWalkOnHide = findViewById(R.id.cb_walk_on);
        cbWalkOnHide.setVisibility(View.GONE);
        View tvYq132Hide = findViewById(R.id.tv_yq132);
        tvYq132Hide.setVisibility(View.GONE);
    }


    @Override
    public void onClick(View v) {
        if (v == ivQ131) {

            rules.setRule13(new Rule13(cbWalk.isChecked(),cbWalkOn.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());
            Intent intent = new Intent(ThirteenthQuestionActivity.this, CalculateScoreActivity.class);
            startActivity(intent);
        }
    }
}
