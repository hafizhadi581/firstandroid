package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule19;
import com.example.asdscreening.rules.Rules;

public class NineteenthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private Rules rules = Rules.getInstance();
    private final String TAG = "Activity 19: ";

    private CheckBox isLookFeel;
    private CheckBox isHearScary;
    private CheckBox isApproach;
    private CheckBox isUnfamilliar;
    private ImageView ivQ191;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nineteenth_question);
        isLookFeel = findViewById(R.id.cb_look_feel);
        isHearScary = findViewById(R.id.cb_hear_scary);
        isApproach = findViewById(R.id.cb_approach);
        isUnfamilliar = findViewById(R.id.cb_unfamiliar);

        ivQ191 = findViewById(R.id.iv_q191);
        ivQ191.setOnClickListener(this);

    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {

            case R.id.cb_look_feel:

                if (checked)
                    hideCbFeel();
                    //do things when checked
                else
                    showCbFeel();
                // do things when unchecked
                break;

        }
        switch (view.getId()) {

            case R.id.cb_hear_scary:

                if (checked)
                    hideCbHearScary();
                    //do things when checked
                else
                    showCbHearScary();
                // do things when unchecked
                break;

        }
        switch (view.getId()) {

            case R.id.cb_approach:

                if (checked)
                    hideCbApproach();
                    //do things when checked
                else
                    showCbApproach();
                // do things when unchecked
                break;
        }

    }

    private void hideCbFeel() {

        View cbHearScaryHide = findViewById(R.id.cb_hear_scary);
        cbHearScaryHide.setVisibility(View.GONE);
        View tvYq192Hide = findViewById(R.id.tv_yq192);
        tvYq192Hide.setVisibility(View.GONE);

        View cbApproachHide = findViewById(R.id.cb_approach);
        cbApproachHide.setVisibility(View.GONE);
        View tvYq193Hide = findViewById(R.id.tv_yq193);
        tvYq193Hide.setVisibility(View.GONE);

        View cbUnfamilliarHide = findViewById(R.id.cb_unfamiliar);
        cbUnfamilliarHide.setVisibility(View.GONE);
        View tvYq194Hide = findViewById(R.id.tv_yq194);
        tvYq194Hide.setVisibility(View.GONE);

    }

    private void showCbFeel() {

        View cbHearScaryshow = findViewById(R.id.cb_hear_scary);
        cbHearScaryshow.setVisibility(View.VISIBLE);
        View tvYq192show = findViewById(R.id.tv_yq192);
        tvYq192show.setVisibility(View.VISIBLE);

        View cbApproachshow = findViewById(R.id.cb_approach);
        cbApproachshow.setVisibility(View.VISIBLE);
        View tvYq193show = findViewById(R.id.tv_yq193);
        tvYq193show.setVisibility(View.VISIBLE);

        View cbUnfamilliarshow = findViewById(R.id.cb_unfamiliar);
        cbUnfamilliarshow.setVisibility(View.VISIBLE);
        View tvYq194show = findViewById(R.id.tv_yq194);
        tvYq194show.setVisibility(View.VISIBLE);

    }

    private void hideCbHearScary() {

        View cbApproachHide = findViewById(R.id.cb_approach);
        cbApproachHide.setVisibility(View.GONE);
        View tvYq193Hide = findViewById(R.id.tv_yq193);
        tvYq193Hide.setVisibility(View.GONE);

        View cbUnfamilliarHide = findViewById(R.id.cb_unfamiliar);
        cbUnfamilliarHide.setVisibility(View.GONE);
        View tvYq194Hide = findViewById(R.id.tv_yq194);
        tvYq194Hide.setVisibility(View.GONE);

    }

    private void showCbHearScary() {

        View cbApproachshow = findViewById(R.id.cb_approach);
        cbApproachshow.setVisibility(View.VISIBLE);
        View tvYq193show = findViewById(R.id.tv_yq193);
        tvYq193show.setVisibility(View.VISIBLE);

        View cbUnfamilliarshow = findViewById(R.id.cb_unfamiliar);
        cbUnfamilliarshow.setVisibility(View.VISIBLE);
        View tvYq194show = findViewById(R.id.tv_yq194);
        tvYq194show.setVisibility(View.VISIBLE);

    }

    private void hideCbApproach() {

        View cbUnfamilliarHide = findViewById(R.id.cb_unfamiliar);
        cbUnfamilliarHide.setVisibility(View.GONE);
        View tvYq194Hide = findViewById(R.id.tv_yq194);
        tvYq194Hide.setVisibility(View.GONE);

    }

    private void showCbApproach() {

        View cbUnfamilliarshow = findViewById(R.id.cb_unfamiliar);
        cbUnfamilliarshow.setVisibility(View.VISIBLE);
        View tvYq194show = findViewById(R.id.tv_yq194);
        tvYq194show.setVisibility(View.VISIBLE);

    }

    @Override
    public void onClick(View v) {
        if (v == ivQ191) {

            rules.setRule19(new Rule19(isLookFeel.isChecked(),
                    isHearScary.isChecked(),
                    isApproach.isChecked(),
                    isUnfamilliar.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());

            Intent intent = new Intent(NineteenthQuestionActivity.this, CalculateScoreActivity.class);
            startActivity(intent);
        }
    }
}
