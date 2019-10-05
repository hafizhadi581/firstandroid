package com.example.asdscreening;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.asdscreening.rules.Rules;

public class CalculateScoreActivity extends AppCompatActivity {

    private Rules rules = Rules.getInstance();
    private TextView tvScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_score);

        tvScore = findViewById(R.id.tv_score);

        tvScore.setText(String.valueOf(rules.getScore()));

    }
}
