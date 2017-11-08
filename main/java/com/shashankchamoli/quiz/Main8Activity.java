package com.shashankchamoli.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void dowork(View view){
        Intent preint=getIntent();
        int score=(int)preint.getIntExtra("score",0);
        EditText et=(EditText)findViewById(R.id.editText3);
        String answer=et.getText().toString();
        Intent intent= new Intent(this,Main7Activity.class);
        if(answer.equals("29"))
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
