package com.example.asdscreening;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class FirstQuestionActivity extends AppCompatActivity implements View.OnClickListener {

   private ImageView ivQ11;
   private TextView testresult;
 private    RadioButton rbq11;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        ivQ11 = findViewById(R.id.iv_q11); //next button
//        testresult = findViewById(R.id.tv_t); //textView test result
//        rbq11 = findViewById(R.id.rbq11);  //radiobutton question 1 , 1


        ivQ11.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v == ivQ11){
            Intent intent= new Intent(FirstQuestionActivity.this, SecondQuestionActivity.class); //go to page 2
            startActivity(intent);
        }

    }
}
