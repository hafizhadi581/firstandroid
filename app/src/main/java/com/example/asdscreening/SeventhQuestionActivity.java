package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule7;
import com.example.asdscreening.rules.Rules;

public class SeventhQuestionActivity extends AppCompatActivity implements View.OnClickListener {


    private final String TAG =  "Activity 7: ";
    private Rules rules = Rules.getInstance();

    private ImageView ivq71;
    private CheckBox cbAirplane;
    private CheckBox cbTruck;
    private CheckBox cbBug;
    private CheckBox cbAnimal;
    private CheckBox cbAttention;
    private CheckBox cbShowInterest;
    private int Num = 0;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh_question);

        cbAirplane = findViewById(R.id.cb_airplane);
        cbTruck = findViewById(R.id.cb_truck);
        cbBug = findViewById(R.id.cb_bug);
        cbAnimal = findViewById(R.id.cb_animal);
        cbAttention = findViewById(R.id.cb_attention);
        cbShowInterest = findViewById(R.id.cb_show_interest);


        ivq71 = findViewById(R.id.iv_q71);
        ivq71.setOnClickListener(this);

    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {

            case R.id.cb_airplane:
                if (checked) {
                    Num++;
                    showCbAttention();
                }
                    //do things when checked
                else {
                    Num--;
                    hideCbAttention();
                }
                // do things when unchecked
                break;

        }
        switch (view.getId()) {

            case R.id.cb_truck:

                if (checked) {
                    Num++;
                    showCbAttention();
                }
                    //do things when checked
                else {
                    Num--;
                    hideCbAttention();
                }
                // do things when unchecked
                break;

        }
        switch (view.getId()) {

            case R.id.cb_bug:

                if (checked) {
                    Num++;
                    showCbAttention();
                }
                    //do things when checked
                else {
                    Num--;
                    hideCbAttention();
                }
                // do things when unchecked
                break;

        }
        switch (view.getId()) {

            case R.id.cb_animal:

                if (checked) {
                    Num++;
                    showCbAttention();
                }
                    //do things when checked
                else {
                    Num--;
                    hideCbAttention();
                }
                // do things when unchecked
                break;

        }

        switch (view.getId()){

            case R.id.cb_attention:

                if (checked)
                    showCbInterest();
                else
                    hideCbInterest();
                break;
        }

    }

    private void showCbAttention(){
        if(Num >= 1) {
            View cbPointShow = findViewById(R.id.cb_attention);
            cbPointShow.setVisibility(View.VISIBLE);
            View tvYq77Show = findViewById(R.id.tv_yq77);
            tvYq77Show.setVisibility(View.VISIBLE);
        }
    }
    private void hideCbAttention(){
        if(Num == 0) {
            View cbPointHide = findViewById(R.id.cb_attention);
            cbPointHide.setVisibility(View.GONE);
            View tvYq77Show = findViewById(R.id.tv_yq77);
            tvYq77Show.setVisibility(View.GONE);
            View cbShowInterest = findViewById(R.id.cb_show_interest);
            cbShowInterest.setVisibility(View.GONE);
            View tvYq72Show = findViewById(R.id.tv_yq72);
            tvYq72Show.setVisibility(View.GONE);
        }
    }
    private void showCbInterest(){
        View cbPointShow = findViewById(R.id.cb_show_interest);
        cbPointShow.setVisibility(View.VISIBLE);
        View tvYq62Show = findViewById(R.id.tv_yq72);
        tvYq62Show.setVisibility(View.VISIBLE);
    }
    private void hideCbInterest(){
        View cbPointHide = findViewById(R.id.cb_show_interest);
        cbPointHide.setVisibility(View.GONE);
        View tvYq72Show = findViewById(R.id.tv_yq72);
        tvYq72Show.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View view) {
        if (view == ivq71){

            rules.setRule7(new Rule7(cbAirplane.isChecked(), cbTruck.isChecked(), cbBug.isChecked(), cbAnimal.isChecked(), cbAttention.isChecked(), cbShowInterest.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());

            Intent intent= new Intent(SeventhQuestionActivity.this, EighthQuestionActivity.class);
            startActivity(intent);
        }
    }
}



