package com.shashankchamoli.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    public void dowork(View view){

        RadioButton radioButton;
        RadioGroup radioGroup;
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        int selectedId = (int)radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton)findViewById(selectedId);
        String answer = (String) radioButton.getText();
        Intent intent= new Intent(this,Main3Activity.class);
        if(answer.equals("Charles Babbej"))
        {
            intent.putExtra("score",1);
        }
        else
        {
            intent.putExtra("score",0);
        }

        startActivity(intent);
        finish();
    }
}
