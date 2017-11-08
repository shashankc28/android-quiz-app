package com.shashankchamoli.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.view.View;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Intent preint=getIntent();
        TextView tv=(TextView)findViewById(R.id.textView5);
        int score=(int)preint.getIntExtra("score",0);
        if(score==6)
        {
            tv.setText("Great you gave all the \nanswers correctly!!");
        }
        if(score>1&& score<6)
        {
            tv.setText("You have scored "+score+"/6");
        }
        if(score<2)
        {
            tv.setText("Go study some books!! \nYou scored "+score+"/6");
        }
    }
    public void dowork(View v)
    {
        finish();

    }


}
