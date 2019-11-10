package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule3;
import com.example.asdscreening.rules.Rules;

public class ThirdQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private  final String TAG = ThirdQuestionActivity.class.getSimpleName() ;
    private ImageView ivQ31;
    private Rules rules = Rules.getInstance();

    private CheckBox cbYq3y1;
    private CheckBox cbYq3y2;
    private CheckBox cbYq3y3;
    private CheckBox cbYq3y4;
    private CheckBox cbYq3y5;
    private CheckBox cbYq3y6;
    private CheckBox cbYq3y7;
    private CheckBox cbYq3y8;
    private CheckBox cbYq3y9;
    private CheckBox cbYq3y10;
    private CheckBox cbYq3y11;


    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);


        ivQ31 = findViewById(R.id.iv_q31);

        cbYq3y1 = findViewById(R.id.cb_yq3y1);
        cbYq3y2 = findViewById(R.id.cb_yq3y2);
        cbYq3y3 = findViewById(R.id.cb_yq3y3);
        cbYq3y4 = findViewById(R.id.cb_yq3y4);
        cbYq3y5 = findViewById(R.id.cb_yq3y5);
        cbYq3y6 = findViewById(R.id.cb_yq3y6);
        cbYq3y7 = findViewById(R.id.cb_yq3y7);
        cbYq3y8 = findViewById(R.id.cb_yq3y8);
        cbYq3y9 = findViewById(R.id.cb_yq3y9);
        cbYq3y10 = findViewById(R.id.cb_yq3y10);

        ivQ31.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == ivQ31) {

            rules.setRule3(new Rule3(cbYq3y1.isChecked(),
                    cbYq3y2.isChecked(),
                    cbYq3y3.isChecked(),
                    cbYq3y4.isChecked(),
                    cbYq3y5.isChecked(),
                    cbYq3y6.isChecked(),
                    cbYq3y7.isChecked(),
                    cbYq3y8.isChecked(),
                    cbYq3y9.isChecked(),
                    cbYq3y10.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());

            Intent intent = new Intent(ThirdQuestionActivity.this, FourthQuestionActivity.class);
//            Intent intent = new Intent(ThirdQuestionActivity.this, CalculateScoreActivity.class);
            startActivity(intent);
        }
    }
}
