package com.shashankchamoli.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void dowork(View view){
        Intent preint=getIntent();
        int score=(int)preint.getIntExtra("score",0);
        CheckBox cb1=(CheckBox)findViewById(R.id.checkBox);
        CheckBox cb2=(CheckBox)findViewById(R.id.checkBox2);
        CheckBox cb3=(CheckBox)findViewById(R.id.checkBox3);
        CheckBox cb4=(CheckBox)findViewById(R.id.checkBox4);
        Intent intent= new Intent(this,Main5Activity.class);
        if(cb1.isChecked() && cb2.isChecked() && !cb3.isChecked() && !cb4.isChecked() )
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
