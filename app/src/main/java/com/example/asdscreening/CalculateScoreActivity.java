package com.example.asdscreening;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.asdscreening.rules.Rules;

import org.w3c.dom.Text;

public class CalculateScoreActivity extends AppCompatActivity implements View.OnClickListener{

    private Rules rules = Rules.getInstance();
    private TextView tvScore;
    private TextView tvRisk;
    private TextView tvDescription;
    private Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_score);


        tvScore = findViewById(R.id.tv_score);
        tvRisk = findViewById(R.id.tv_risk);
        tvDescription = findViewById(R.id.tv_description);
        btnReturn = findViewById(R.id.btn_return);

        btnReturn.setOnClickListener(this);

        tvRisk.setText(String.valueOf(rules.getRisk()));
        tvScore.setText(String.valueOf(rules.getScore()));
        tvDescription.setText((String.valueOf(rules.getDescription())));

    }

    @Override
    public void onClick(View v) {

        if(v ==  btnReturn){
            Intent intent = new Intent (CalculateScoreActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
