package com.example.asdscreening;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.asdscreening.rules.Rule11;
import com.example.asdscreening.rules.Rules;

public class EleventhQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = EleventhQuestionActivity.class.getSimpleName();
    private Rules rules = Rules.getInstance();

    private CheckBox cbSmileBack;
    private CheckBox cbSmileSmile;
    private CheckBox cbSmileEnter;
    private CheckBox cbSmileReturn;
    private CheckBox cbAlwaysSmile;
    private CheckBox cbBringBlock;
    private CheckBox cbSmileRandom;
    private ImageView ivQ111;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh_question);

        cbSmileBack = findViewById(R.id.cb_smile_back);
        cbSmileSmile = findViewById(R.id.cb_smile_smile);
        cbSmileEnter = findViewById(R.id.cb_smile_enter);
        cbSmileReturn = findViewById(R.id.cb_smile_return);
        cbAlwaysSmile = findViewById(R.id.cb_always_smile);
        cbBringBlock = findViewById(R.id.cb_bring_block);
        cbSmileRandom = findViewById(R.id.cb_smile_random);
        ivQ111 = findViewById(R.id.iv_q111);

        ivQ111.setOnClickListener(this);
//        btnq111.setOnClickListener(new View.OnClickListener(){

    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {

            case R.id.cb_smile_back:

                if (checked)
                    hideCbSmileBack();
                    //do things when checked
                else
                    showCbSmileBack();
                // do things when unchecked
                break;

        }
    }

    private void hideCbSmileBack(){

        View tvYq111Hide = findViewById(R.id.tv_yq111);
        tvYq111Hide.setVisibility(View.GONE);

        View cbSmileSmileHide = findViewById(R.id.cb_smile_smile);
        cbSmileSmileHide.setVisibility(View.GONE);
        View tvYq112Hide = findViewById(R.id.tv_yq112);
        tvYq112Hide.setVisibility(View.GONE);

        View cbSmileEnterHide = findViewById(R.id.cb_smile_enter);
        cbSmileEnterHide.setVisibility(View.GONE);
        View tvYq113Hide = findViewById(R.id.tv_yq113);
        tvYq113Hide.setVisibility(View.GONE);

        View cbSmileReturnHide = findViewById(R.id.cb_smile_return);
        cbSmileReturnHide.setVisibility(View.GONE);
        View tvYq114Hide = findViewById(R.id.tv_yq114);
        tvYq114Hide.setVisibility(View.GONE);

        View cbAlwaysSmileHide = findViewById(R.id.cb_always_smile);
        cbAlwaysSmileHide.setVisibility(View.GONE);
        View tvYq115Hide = findViewById(R.id.tv_yq115);
        tvYq115Hide.setVisibility(View.GONE);

        View cbBringBlockHide = findViewById(R.id.cb_bring_block);
        cbBringBlockHide.setVisibility(View.GONE);
        View tvYq116Hide = findViewById(R.id.tv_yq116);
        tvYq116Hide.setVisibility(View.GONE);

        View cbSmileRandomHide = findViewById(R.id.cb_smile_random);
        cbSmileRandomHide.setVisibility(View.GONE);
        View tvYq117Hide = findViewById(R.id.tv_yq117);
        tvYq117Hide.setVisibility(View.GONE);

    }
    private void showCbSmileBack(){

        View tvYq111Show = findViewById(R.id.tv_yq111);
        tvYq111Show.setVisibility(View.VISIBLE);

        View cbSmileSmileShow = findViewById(R.id.cb_smile_smile);
        cbSmileSmileShow.setVisibility(View.VISIBLE);
        View tvYq112Show = findViewById(R.id.tv_yq112);
        tvYq112Show.setVisibility(View.VISIBLE);

        View cbSmileEnterShow = findViewById(R.id.cb_smile_enter);
        cbSmileEnterShow.setVisibility(View.VISIBLE);
        View tvYq113Show = findViewById(R.id.tv_yq113);
        tvYq113Show.setVisibility(View.VISIBLE);

        View cbSmileReturnShow = findViewById(R.id.cb_smile_return);
        cbSmileReturnShow.setVisibility(View.VISIBLE);
        View tvYq114Show = findViewById(R.id.tv_yq114);
        tvYq114Show.setVisibility(View.VISIBLE);

        View cbAlwaysSmileShow = findViewById(R.id.cb_always_smile);
        cbAlwaysSmileShow.setVisibility(View.VISIBLE);
        View tvYq115Show = findViewById(R.id.tv_yq115);
        tvYq115Show.setVisibility(View.VISIBLE);

        View cbBringBlockShow = findViewById(R.id.cb_bring_block);
        cbBringBlockShow.setVisibility(View.VISIBLE);
        View tvYq116Show = findViewById(R.id.tv_yq116);
        tvYq116Show.setVisibility(View.VISIBLE);

        View cbSmileRandomShow = findViewById(R.id.cb_smile_random);
        cbSmileRandomShow.setVisibility(View.VISIBLE);
        View tvYq117Show = findViewById(R.id.tv_yq117);
        tvYq117Show.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View v) {
        if (v == ivQ111) {

            rules.setRule11(new Rule11(cbSmileBack.isChecked(), cbSmileSmile.isChecked(), cbSmileEnter.isChecked(), cbSmileReturn.isChecked(),
            cbAlwaysSmile.isChecked(), cbBringBlock.isChecked(), cbSmileRandom.isChecked()));


            Log.d(TAG, "current score: " + rules.getScore());
            Intent intent = new Intent(EleventhQuestionActivity.this, TwelvethQuestionActivity.class);
            startActivity(intent);
        }
    }
}
