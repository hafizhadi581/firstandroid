package com.example.asdscreening;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class First_Question extends AppCompatActivity {

    ImageView btnq11;
    TextView testresult;
    RadioButton rbq11;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        btnq11 = findViewById(R.id.btnq11); //next button
        testresult = findViewById(R.id.testresult); //textView test result
        rbq11 = findViewById(R.id.rbq11);  //radiobutton question 1 , 1


        btnq11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent= new Intent(First_Question.this,Second_Question.class); //go to page 2
                startActivity(intent);
            }
        });



    }
}
