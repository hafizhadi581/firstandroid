package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule2;
import com.example.asdscreening.rules.Rules;

public class SecondQuestionActivity extends AppCompatActivity implements View.OnClickListener {
    private final String TAG = SecondQuestionActivity.class.getSimpleName();
    private Rules rules = Rules.getInstance();

    private ImageView ivq21;

    private CheckBox cbyq2y1;
    private CheckBox cbyq2y2;

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);

        ivq21 = findViewById(R.id.iv_q21);

        cbyq2y1 = findViewById(R.id.cb_yq2y1);
        cbyq2y2 = findViewById(R.id.cb_yq2y2);

        ivq21.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view == ivq21) {
            rules.setRule2(new Rule2(cbyq2y1.isChecked(),cbyq2y2.isChecked()));
            Log.d(TAG, "current score: " + rules.getScore());

            Intent intent = new Intent(SecondQuestionActivity.this, ThirdQuestionActivity.class);
//            Intent intent = new Intent(SecondQuestionActivity.this, CalculateScoreActivity.class);
            startActivity(intent);

        }

    }
}
