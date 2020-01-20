package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule5;
import com.example.asdscreening.rules.Rules;

public class FifthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "Activity 5: ";
    private Rules rules = Rules.getInstance();

    private ImageView ivQ52;
    private CheckBox cbYq5y1;
    private CheckBox cbYq5y2;
    private CheckBox cbYq5y3;
    private CheckBox cbYq5y4;
    private CheckBox cbYq5y5;
    private CheckBox cbYq5y6;
    private CheckBox cbYq5y7;
    private CheckBox cbYq5y8;
    private int Num = 0;
    private int Num2 = 0;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_question);

        ivQ52 = findViewById(R.id.iv_q52);
        cbYq5y1 = findViewById(R.id.cb_yq5y1);
        cbYq5y2 = findViewById(R.id.cb_yq5y2);
        cbYq5y3 = findViewById(R.id.cb_yq5y3);
        cbYq5y4 = findViewById(R.id.cb_yq5y4);
        cbYq5y5 = findViewById(R.id.cb_yq5y5);
        cbYq5y6 = findViewById(R.id.cb_yq5y6);
        cbYq5y7 = findViewById(R.id.cb_yq5y7);
        cbYq5y8 = findViewById(R.id.cb_yq5y8);

        ivQ52.setOnClickListener(this); //next page

    }

    @Override
    public void onClick(View v) {
        if (v == ivQ52) {

            rules.setRule5(new Rule5(cbYq5y8.isChecked(), cbYq5y1.isChecked(),
                    cbYq5y2.isChecked(),
                    cbYq5y3.isChecked(),
                    cbYq5y4.isChecked(),
                    cbYq5y5.isChecked(),
                    cbYq5y6.isChecked(),
                    cbYq5y7.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());
            Intent intent = new Intent(FifthQuestionActivity.this, SixthQuestionActivity.class);
            startActivity(intent);


        }

    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {

            case R.id.cb_yq5y8:

                if (checked)
                    showCbYq5y8();
                    //do things when checked
                else
                    hideCbYq5y8();
                // do things when unchecked
                break;

        }
        switch (view.getId()) {

            case R.id.cb_yq5y1:
                if (checked) {
                    Num2++;
                    hideCbYq5y3();
                }
                //do things when checked
                else {
                    Num2--;
                    showCbYq5y3();
                }
                // do things when unchecked
                break;

        }
        switch (view.getId()) {

            case R.id.cb_yq5y2:

                if (checked) {
                    Num2++;
                    hideCbYq5y3();
                }
                //do things when checked
                else {
                    Num2--;
                    showCbYq5y3();
                }
                // do things when unchecked
                break;

        }
//
        switch (view.getId()) {

            case R.id.cb_yq5y3:
                if (checked) {
                    Num++;
                    showCbWeek();
                }
                //do things when checked
                else {
                    Num--;
                    hideCbWeek();
                }
                // do things when unchecked
                break;

        }
        switch (view.getId()) {

            case R.id.cb_yq5y4:
                if (checked) {
                    Num++;
                    showCbWeek();
                }
                //do things when checked
                else {
                    Num--;
                    hideCbWeek();
                }
                // do things when unchecked
                break;

        }
        switch (view.getId()) {

            case R.id.cb_yq5y5:
                if (checked) {
                    Num++;
                    showCbWeek();
                }
                //do things when checked
                else {
                    Num--;
                    hideCbWeek();
                }
                // do things when unchecked
                break;

        }
        switch (view.getId()) {

            case R.id.cb_yq5y6:
                if (checked) {
                    Num++;
                    showCbWeek();
                }
                //do things when checked
                else {
                    Num--;
                    hideCbWeek();
                }
                // do things when unchecked
                break;

        }

    }

    public void hideCbYq5y3() {
        if (Num2 >= 1) {
            View cbYq5Y3Show = findViewById(R.id.cb_yq5y3);
            cbYq5Y3Show.setVisibility(View.GONE);
            View tvYq55Show = findViewById(R.id.tv_yq55);
            tvYq55Show.setVisibility(View.GONE);
            View cbYq5Y4Show = findViewById(R.id.cb_yq5y4);
            cbYq5Y4Show.setVisibility(View.GONE);
            View tvYq56Show = findViewById(R.id.tv_yq56);
            tvYq56Show.setVisibility(View.GONE);
            View cbYq5Y5Show = findViewById(R.id.cb_yq5y5);
            cbYq5Y5Show.setVisibility(View.GONE);
            View tvYq57Show = findViewById(R.id.tv_yq57);
            tvYq57Show.setVisibility(View.GONE);
            View cbYq5Y6Show = findViewById(R.id.cb_yq5y6);
            cbYq5Y6Show.setVisibility(View.GONE);
            View tvYq58Show = findViewById(R.id.tv_yq58);
            tvYq58Show.setVisibility(View.GONE);
            View cbYq5Y7Hide = findViewById(R.id.cb_yq5y7);
            cbYq5Y7Hide.setVisibility(View.GONE);
            View tvYq59Hide = findViewById(R.id.tv_yq59);
            tvYq59Hide.setVisibility(View.GONE);
        }
    }

    public void showCbYq5y3() {
        if (Num2 == 0) {
            View cbYq5Y3Show = findViewById(R.id.cb_yq5y3);
            cbYq5Y3Show.setVisibility(View.VISIBLE);
            View tvYq55Show = findViewById(R.id.tv_yq55);
            tvYq55Show.setVisibility(View.VISIBLE);
            View cbYq5Y4Show = findViewById(R.id.cb_yq5y4);
            cbYq5Y4Show.setVisibility(View.VISIBLE);
            View tvYq56Show = findViewById(R.id.tv_yq56);
            tvYq56Show.setVisibility(View.VISIBLE);
            View cbYq5Y5Show = findViewById(R.id.cb_yq5y5);
            cbYq5Y5Show.setVisibility(View.VISIBLE);
            View tvYq57Show = findViewById(R.id.tv_yq57);
            tvYq57Show.setVisibility(View.VISIBLE);
            View cbYq5Y6Show = findViewById(R.id.cb_yq5y6);
            cbYq5Y6Show.setVisibility(View.VISIBLE);
            View tvYq58Show = findViewById(R.id.tv_yq58);
            tvYq58Show.setVisibility(View.VISIBLE);

        }
    }

    public void showCbWeek() {
        if (Num >= 1) {
            View cbYq5Y1Show = findViewById(R.id.cb_yq5y7);
            cbYq5Y1Show.setVisibility(View.VISIBLE);
            View tvYq53Show = findViewById(R.id.tv_yq59);
            tvYq53Show.setVisibility(View.VISIBLE);
        }
    }

    public void hideCbWeek() {
        if (Num == 0) {

            View cbYq5Y1Hide = findViewById(R.id.cb_yq5y7);
            cbYq5Y1Hide.setVisibility(View.GONE);
            View tvYq53Hide = findViewById(R.id.tv_yq59);
            tvYq53Hide.setVisibility(View.GONE);
        }
    }

    public void hideCbYq5y8() {
        View tvYq51Hide = findViewById(R.id.tv_yq51);
        tvYq51Hide.setVisibility(View.GONE);

        View cbYq5Y1Hide = findViewById(R.id.cb_yq5y1);
        cbYq5Y1Hide.setVisibility(View.GONE);
        View tvYq53Hide = findViewById(R.id.tv_yq53);
        tvYq53Hide.setVisibility(View.GONE);

        View cbYq5Y2Hide = findViewById(R.id.cb_yq5y2);
        cbYq5Y2Hide.setVisibility(View.GONE);
        View tvYq54Hide = findViewById(R.id.tv_yq54);
        tvYq54Hide.setVisibility(View.GONE);

        View cbYq5Y3Hide = findViewById(R.id.cb_yq5y3);
        cbYq5Y3Hide.setVisibility(View.GONE);
        View tvYq55Hide = findViewById(R.id.tv_yq55);
        tvYq55Hide.setVisibility(View.GONE);

        View cbYq5Y4Hide = findViewById(R.id.cb_yq5y4);
        cbYq5Y4Hide.setVisibility(View.GONE);
        View tvYq56Hide = findViewById(R.id.tv_yq56);
        tvYq56Hide.setVisibility(View.GONE);

        View cbYq5Y5Hide = findViewById(R.id.cb_yq5y5);
        cbYq5Y5Hide.setVisibility(View.GONE);
        View tvYq57Hide = findViewById(R.id.tv_yq57);
        tvYq57Hide.setVisibility(View.GONE);

        View cbYq5Y6Hide = findViewById(R.id.cb_yq5y6);
        cbYq5Y6Hide.setVisibility(View.GONE);
        View tvYq58Hide = findViewById(R.id.tv_yq58);
        tvYq58Hide.setVisibility(View.GONE);

        View cbYq5Y7Hide = findViewById(R.id.cb_yq5y7);
        cbYq5Y7Hide.setVisibility(View.GONE);
        View tvYq59Hide = findViewById(R.id.tv_yq59);
        tvYq59Hide.setVisibility(View.GONE);
    }

    public void showCbYq5y8() {
        View tvYq51Show = findViewById(R.id.tv_yq51);
        tvYq51Show.setVisibility(View.VISIBLE);

        View cbYq5Y1Show = findViewById(R.id.cb_yq5y1);
        cbYq5Y1Show.setVisibility(View.VISIBLE);
        View tvYq53Show = findViewById(R.id.tv_yq53);
        tvYq53Show.setVisibility(View.VISIBLE);

        View cbYq5Y2Show = findViewById(R.id.cb_yq5y2);
        cbYq5Y2Show.setVisibility(View.VISIBLE);
        View tvYq54Show = findViewById(R.id.tv_yq54);
        tvYq54Show.setVisibility(View.VISIBLE);

        View cbYq5Y3Show = findViewById(R.id.cb_yq5y3);
        cbYq5Y3Show.setVisibility(View.VISIBLE);
        View tvYq55Show = findViewById(R.id.tv_yq55);
        tvYq55Show.setVisibility(View.VISIBLE);

        View cbYq5Y4Show = findViewById(R.id.cb_yq5y4);
        cbYq5Y4Show.setVisibility(View.VISIBLE);
        View tvYq56Show = findViewById(R.id.tv_yq56);
        tvYq56Show.setVisibility(View.VISIBLE);

        View cbYq5Y5Show = findViewById(R.id.cb_yq5y5);
        cbYq5Y5Show.setVisibility(View.VISIBLE);
        View tvYq57Show = findViewById(R.id.tv_yq57);
        tvYq57Show.setVisibility(View.VISIBLE);

        View cbYq5Y6Show = findViewById(R.id.cb_yq5y6);
        cbYq5Y6Show.setVisibility(View.VISIBLE);
        View tvYq58Show = findViewById(R.id.tv_yq58);
        tvYq58Show.setVisibility(View.VISIBLE);

    }
}
