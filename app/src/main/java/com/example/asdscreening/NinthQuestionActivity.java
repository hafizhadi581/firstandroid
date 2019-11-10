package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule9;
import com.example.asdscreening.rules.Rules;

public class NinthQuestionActivity extends AppCompatActivity implements View.OnClickListener {


    private final String TAG =  "Activity 9: ";
    private Rules rules = Rules.getInstance();

    private ImageView ivq91;
    private CheckBox cbBringPictureToys;
    private CheckBox cbBringDonePicture;
    private CheckBox cbBringFlowers;
    private CheckBox cbBringBugsOnGrass;
    private CheckBox cbBringBlocks;
    private CheckBox cbBringOnlyToShow;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth_question);

        cbBringPictureToys = findViewById(R.id.cb_bring_picture);
        cbBringDonePicture = findViewById(R.id.cb_bring_drawing);
        cbBringFlowers = findViewById(R.id.cb_bring_flower);
        cbBringBugsOnGrass = findViewById(R.id.cb_bring_bug);
        cbBringBlocks = findViewById(R.id.cb_bring_block);
        cbBringOnlyToShow = findViewById(R.id.cb_bring_help);
        ivq91 = findViewById(R.id.iv_q91);
        ivq91.setOnClickListener(this);

    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {

            case R.id.cb_bring_picture:
            case R.id.cb_bring_drawing:
            case R.id.cb_bring_flower:
            case R.id.cb_bring_bug:
            case R.id.cb_bring_block:

                if (checked)
                    showCbBringHelp();
                    //do things when checked
                else
                    hideCbBringHelp();
                // do things when unchecked
                break;

        }
    }

    private void showCbBringHelp(){
        View cbBringHelpShow = findViewById(R.id.cb_bring_help);
        cbBringHelpShow.setVisibility(View.VISIBLE);
        View tvYq97Show = findViewById(R.id.tv_yq97);
        tvYq97Show.setVisibility(View.VISIBLE);
    }
    private void hideCbBringHelp(){
        View cbBringHelpHide = findViewById(R.id.cb_bring_help);
        cbBringHelpHide.setVisibility(View.GONE);
        View tvYq97Hide = findViewById(R.id.tv_yq97);
        tvYq97Hide.setVisibility(View.GONE);
    }


    @Override
    public void onClick(View view) {
        if (view == ivq91) {

            rules.setRule9(new Rule9(cbBringPictureToys.isChecked(), cbBringDonePicture.isChecked(), cbBringFlowers.isChecked(), cbBringBugsOnGrass.isChecked(), cbBringBlocks.isChecked(), cbBringOnlyToShow.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());

            Intent intent = new Intent(NinthQuestionActivity.this, TenthQuestionActivity.class);
            startActivity(intent);
        }
    }
}
