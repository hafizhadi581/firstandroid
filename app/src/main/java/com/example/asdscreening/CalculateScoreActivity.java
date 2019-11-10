package com.example.asdscreening;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.asdscreening.rules.Rules;

import org.w3c.dom.Text;

public class CalculateScoreActivity extends AppCompatActivity {

    private Rules rules = Rules.getInstance();
    private TextView tvScore;
    private TextView tvRisk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_score);

        tvScore = findViewById(R.id.tv_score);
        tvRisk = findViewById(R.id.tv_risk);

        tvRisk.setText(String.valueOf(rules.getRisk()));
        tvScore.setText(String.valueOf(rules.getScore()));


    }
}
