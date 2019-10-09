package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule5;
import com.example.asdscreening.rules.Rules;

public class FifthQuestionActivity extends AppCompatActivity implements View.OnClickListener {


    private Rules rules = Rules.getInstance();
    private ImageView ivQ52;

    private CheckBox cbYq5y1;
    private CheckBox cbYq5y2;
    private CheckBox cbYq5y3;
    private CheckBox cbYq5y4;
    private CheckBox cbYq5y5;
    private CheckBox cbYq5y6;
    private CheckBox cbYq5y7;

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

        ivQ52.setOnClickListener(this); //next page

    }

    @Override
    public void onClick(View v) {
        if (v == ivQ52) {

            rules.setRule5(new Rule5(cbYq5y1.isChecked(),
                    cbYq5y2.isChecked(),
                    cbYq5y3.isChecked(),
                    cbYq5y4.isChecked(),
                    cbYq5y5.isChecked(),
                    cbYq5y6.isChecked(),
                    cbYq5y7.isChecked()));
            Intent intent = new Intent(FifthQuestionActivity.this, CalculateScoreActivity.class);
            startActivity(intent);


        }

    }
}
