package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule18;
import com.example.asdscreening.rules.Rules;

public class EighteenthQuestionActivity extends AppCompatActivity implements View.OnClickListener {


    private Rules rules = Rules.getInstance();
    private final String TAG = "Activity 18: ";

    private CheckBox cbCommand;
    private CheckBox cbSituation;
    private CheckBox cbDinnerTime;
    private CheckBox cbBlanket;
    private CheckBox cbBook;

    private ImageView ivQ181;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteenth_question);

        cbCommand = findViewById(R.id.cb_command);
        cbSituation = findViewById(R.id.cb_situation);
        cbDinnerTime = findViewById(R.id.cb_dinnertime);
        cbBlanket = findViewById(R.id.cb_blanket);
        cbBook = findViewById(R.id.cb_book);

        ivQ181 = findViewById(R.id.iv_q181);
        ivQ181.setOnClickListener(this);

    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {

            case R.id.cb_command:

                if (checked)
                    showCbCommand();
                    //do things when checked
                else
                    hideCbCommand();
                // do things when unchecked
                break;

        }
        switch (view.getId()) {

            case R.id.cb_dinnertime:

                if (checked)
                    showDinnerTime();
                    //do things when checked
                else
                    hideDinnerTime();
                // do things when unchecked
                break;

        }
    }


    private void showCbCommand(){

        View cbDinnerTimeShow = findViewById(R.id.cb_dinnertime);
        cbDinnerTimeShow.setVisibility(View.GONE);
        View tvYq186Show = findViewById(R.id.tv_yq186);
        tvYq186Show.setVisibility(View.GONE);

        View tvYq187Hide = findViewById(R.id.tv_yq187);
        tvYq187Hide.setVisibility(View.VISIBLE);

        View cbSituationHide = findViewById(R.id.cb_situation);
        cbSituationHide.setVisibility(View.VISIBLE);
        View tvYq97Hide = findViewById(R.id.tv_yq182);
        tvYq97Hide.setVisibility(View.VISIBLE);

        View cbBlanketHide = findViewById(R.id.cb_blanket);
        cbBlanketHide.setVisibility(View.VISIBLE);
        View tvYq184Hide = findViewById(R.id.tv_yq184);
        tvYq184Hide.setVisibility(View.VISIBLE);

        View cbBookHide = findViewById(R.id.cb_book);
        cbBookHide.setVisibility(View.VISIBLE);
        View tvYq185Hide = findViewById(R.id.tv_yq185);
        tvYq185Hide.setVisibility(View.VISIBLE);
    }
    private void hideCbCommand(){

        View cbDinnerTimeShow = findViewById(R.id.cb_dinnertime);
        cbDinnerTimeShow.setVisibility(View.VISIBLE);
        View tvYq186Show = findViewById(R.id.tv_yq186);
        tvYq186Show.setVisibility(View.VISIBLE);

        View tvYq187Hide = findViewById(R.id.tv_yq187);
        tvYq187Hide.setVisibility(View.GONE);

        View cbSituationHide = findViewById(R.id.cb_situation);
        cbSituationHide.setVisibility(View.GONE);
        View tvYq97Hide = findViewById(R.id.tv_yq182);
        tvYq97Hide.setVisibility(View.GONE);

        View cbBlanketHide = findViewById(R.id.cb_blanket);
        cbBlanketHide.setVisibility(View.GONE);
        View tvYq184Hide = findViewById(R.id.tv_yq184);
        tvYq184Hide.setVisibility(View.GONE);

        View cbBookHide = findViewById(R.id.cb_book);
        cbBookHide.setVisibility(View.GONE);
        View tvYq185Hide = findViewById(R.id.tv_yq185);
        tvYq185Hide.setVisibility(View.GONE);
    }

    private void showDinnerTime(){

        View tvYq187Hide = findViewById(R.id.tv_yq187);
        tvYq187Hide.setVisibility(View.VISIBLE);

        View cbSituationHide = findViewById(R.id.cb_situation);
        cbSituationHide.setVisibility(View.VISIBLE);
        View tvYq97Hide = findViewById(R.id.tv_yq182);
        tvYq97Hide.setVisibility(View.VISIBLE);

        View cbBlanketHide = findViewById(R.id.cb_blanket);
        cbBlanketHide.setVisibility(View.VISIBLE);
        View tvYq184Hide = findViewById(R.id.tv_yq184);
        tvYq184Hide.setVisibility(View.VISIBLE);

        View cbBookHide = findViewById(R.id.cb_book);
        cbBookHide.setVisibility(View.VISIBLE);
        View tvYq185Hide = findViewById(R.id.tv_yq185);
        tvYq185Hide.setVisibility(View.VISIBLE);
    }

    private void hideDinnerTime(){

        View tvYq187Hide = findViewById(R.id.tv_yq187);
        tvYq187Hide.setVisibility(View.GONE);

        View cbSituationHide = findViewById(R.id.cb_situation);
        cbSituationHide.setVisibility(View.GONE);
        View tvYq97Hide = findViewById(R.id.tv_yq182);
        tvYq97Hide.setVisibility(View.GONE);

        View cbBlanketHide = findViewById(R.id.cb_blanket);
        cbBlanketHide.setVisibility(View.GONE);
        View tvYq184Hide = findViewById(R.id.tv_yq184);
        tvYq184Hide.setVisibility(View.GONE);

        View cbBookHide = findViewById(R.id.cb_book);
        cbBookHide.setVisibility(View.GONE);
        View tvYq185Hide = findViewById(R.id.tv_yq185);
        tvYq185Hide.setVisibility(View.GONE);
    }


    @Override
    public void onClick(View v) {

        if(v == ivQ181){
            rules.setRule18(new Rule18(cbCommand.isChecked(), cbSituation.isChecked(), cbDinnerTime.isChecked(), cbBlanket.isChecked(), cbBook.isChecked()));

            Log.d(TAG, "current score: " + rules.getScore());

            Intent intent = new Intent(EighteenthQuestionActivity.this, NineteenthQuestionActivity.class);
            startActivity(intent);
        }

    }
}
