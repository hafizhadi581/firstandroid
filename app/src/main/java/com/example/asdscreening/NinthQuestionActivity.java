package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class NinthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivq91;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth_question);

        ivq91 = findViewById(R.id.iv_q91);
        ivq91.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view == ivq91) {
            Intent intent = new Intent(NinthQuestionActivity.this, TenthQuestionActivity.class);
            startActivity(intent);
        }
    }
}
