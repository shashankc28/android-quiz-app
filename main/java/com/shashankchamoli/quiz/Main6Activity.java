package com.shashankchamoli.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void dowork(View view){
        Intent preint=getIntent();
        int score=(int)preint.getIntExtra("score",0);
        RadioButton radioButton;
        RadioGroup radioGroup;
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton)findViewById(selectedId);
        String answer = (String) radioButton.getText();
        Intent intent= new Intent(this,Main8Activity.class);
        if(answer.equals("James Gosling"))
        {
            intent.putExtra("score",score+1);
        }
        else
        {
            intent.putExtra("score",score);
        }
        startActivity(intent);
        finish();
    }
}
