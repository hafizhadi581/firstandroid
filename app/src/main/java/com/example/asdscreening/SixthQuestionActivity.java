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
    private CheckBox cbReachObject;
    private CheckBox cbLeadObject;
    private CheckBox cbGetObject;
    private CheckBox cbSound;
    private CheckBox cbPoint;


    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_question);

        ivq61 = findViewById(R.id.iv_q61);
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
            case R.id.cb_lead_object:
            case R.id.cb_get_object:
            case R.id.cb_sounds:
                if (checked)
                    showCbPoint();
                    //do things when checked
                else
                    hideCbPoint();
                     // do things when unchecked
                break;

        }
    }

    private void showCbPoint(){
        View cbPointShow = findViewById(R.id.cb_point);
        cbPointShow.setVisibility(View.VISIBLE);
        View tvYq62Show = findViewById(R.id.tv_yq62);
        tvYq62Show.setVisibility(View.VISIBLE);
    }
    private void hideCbPoint(){
        View cbPointHide = findViewById(R.id.cb_point);
        cbPointHide.setVisibility(View.GONE);
        View tvYq62Show = findViewById(R.id.tv_yq62);
        tvYq62Show.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View view) {

        if (view == ivq61){

            rules.setRule6(new Rule6(cbReachObject.isChecked(), cbLeadObject.isChecked(), cbGetObject.isChecked(), cbSound.isChecked(), cbPoint.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());

            Intent intent= new Intent(SixthQuestionActivity.this, SeventhQuestionActivity.class);
            startActivity(intent);
        }
    }

}
