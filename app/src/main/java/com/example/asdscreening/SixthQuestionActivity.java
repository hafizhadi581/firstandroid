package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule6;
import com.example.asdscreening.rules.Rules;

public class SixthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG =  "Activity 6: ";
    private Rules rules = Rules.getInstance();

    private ImageView ivq61;
    private CheckBox cbPointFinger;
    private CheckBox cbReachObject;
    private CheckBox cbLeadObject;
    private CheckBox cbGetObject;
    private CheckBox cbSound;
    private CheckBox cbPoint;
    private int Num = 0;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_question);

        ivq61 = findViewById(R.id.iv_q61);
        cbPointFinger = findViewById(R.id.cb_point_finger);
        cbReachObject = findViewById(R.id.cb_reach_object);
        cbLeadObject = findViewById(R.id.cb_lead_object);
        cbGetObject = findViewById(R.id.cb_get_object);
        cbSound = findViewById(R.id.cb_sounds);
        cbPoint = findViewById(R.id.cb_point);


        ivq61.setOnClickListener(this);

    }
    public void onCheckboxClicked(View view) {
    // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

    // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.cb_reach_object:
                if (checked) {
                    Num++;
                    showCbPoint();
                }
                    //do things when checked
                else {
                    Num--;
                    hideCbPoint();
                }
                     // do things when unchecked
                break;

        }
        switch (view.getId()) {
            case R.id.cb_lead_object:
                if (checked) {
                    Num++;
                    showCbPoint();
                }
                //do things when checked
                else {
                    Num--;
                    hideCbPoint();
                }
                // do things when unchecked
                break;

        }
        switch (view.getId()) {
            case R.id.cb_get_object:
                if (checked) {
                    Num++;
                    showCbPoint();
                }
                //do things when checked
                else {
                    Num--;
                    hideCbPoint();
                }
                // do things when unchecked
                break;

        }
        switch (view.getId()) {
            case R.id.cb_sounds:
                if (checked) {
                    Num++;
                    showCbPoint();
                }
                //do things when checked
                else {
                    Num--;
                    hideCbPoint();
                }
                // do things when unchecked
                break;

        }
        switch (view.getId()) {
            case R.id.cb_point_finger:
                if (checked)
                    hideCbFinger();
                    //do things when checked
                else
                    showCbFinger();
                // do things when unchecked
                break;

        }
    }
    private void showCbFinger(){

        View tvYq61Show = findViewById(R.id.tv_yq61);
        tvYq61Show.setVisibility(View.VISIBLE);

        View cbReachObjectShow = findViewById(R.id.cb_reach_object);
        cbReachObjectShow.setVisibility(View.VISIBLE);
        View tvYq63Show = findViewById(R.id.tv_yq63);
        tvYq63Show.setVisibility(View.VISIBLE);

        View cbLeadObjectShow = findViewById(R.id.cb_lead_object);
        cbLeadObjectShow.setVisibility(View.VISIBLE);
        View tvYq64Show = findViewById(R.id.tv_yq64);
        tvYq64Show.setVisibility(View.VISIBLE);

        View cbGetObjectShow = findViewById(R.id.cb_get_object);
        cbGetObjectShow.setVisibility(View.VISIBLE);
        View tvYq65Show = findViewById(R.id.tv_yq65);
        tvYq65Show.setVisibility(View.VISIBLE);

        View cbSoundsShow = findViewById(R.id.cb_sounds);
        cbSoundsShow.setVisibility(View.VISIBLE);
        View tvYq66Show = findViewById(R.id.tv_yq66);
        tvYq66Show.setVisibility(View.VISIBLE);
    }
    private void hideCbFinger(){
        View tvYq61Hide = findViewById(R.id.tv_yq61);
        tvYq61Hide.setVisibility(View.GONE);

        View cbReachObjectHide = findViewById(R.id.cb_reach_object);
        cbReachObjectHide.setVisibility(View.GONE);
        View tvYq63Hide = findViewById(R.id.tv_yq63);
        tvYq63Hide.setVisibility(View.GONE);

        View cbLeadObjectHide = findViewById(R.id.cb_lead_object);
        cbLeadObjectHide.setVisibility(View.GONE);
        View tvYq64Hide = findViewById(R.id.tv_yq64);
        tvYq64Hide.setVisibility(View.GONE);

        View cbGetObjectHide = findViewById(R.id.cb_get_object);
        cbGetObjectHide.setVisibility(View.GONE);
        View tvYq65Hide = findViewById(R.id.tv_yq65);
        tvYq65Hide.setVisibility(View.GONE);

        View cbSoundsHide = findViewById(R.id.cb_sounds);
        cbSoundsHide.setVisibility(View.GONE);
        View tvYq66Hide = findViewById(R.id.tv_yq66);
        tvYq66Hide.setVisibility(View.GONE);
    }

    private void showCbPoint(){
        if(Num >= 1){

            View cbPointShow = findViewById(R.id.cb_point);
            cbPointShow.setVisibility(View.VISIBLE);
            View tvYq62Show = findViewById(R.id.tv_yq62);
            tvYq62Show.setVisibility(View.VISIBLE);
        }
    }
    private void hideCbPoint(){
        if(Num == 0){

            View cbPointHide = findViewById(R.id.cb_point);
            cbPointHide.setVisibility(View.GONE);
            View tvYq62Show = findViewById(R.id.tv_yq62);
            tvYq62Show.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View view) {

        if (view == ivq61){

            rules.setRule6(new Rule6(cbPointFinger.isChecked(),cbReachObject.isChecked(), cbLeadObject.isChecked(), cbGetObject.isChecked(), cbSound.isChecked(), cbPoint.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());

            Intent intent= new Intent(SixthQuestionActivity.this, SeventhQuestionActivity.class);
            startActivity(intent);
        }
    }

}
