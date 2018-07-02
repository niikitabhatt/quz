package com.example.knbhatt.quz;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    RadioGroup radiogroup,radiogroup1,radiogroup2,radiogroup3;
    RadioButton radiobutton, radiobutton1,radiobutton2,radiobutton3;
    RadioButton r4, r21,r32,r33;
    CheckBox c1,c2,c3;
    Boolean cc1,cc2,cc3;
    EditText e;
    String s;
    int score;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=(CheckBox)findViewById(R.id.c1);
        c2=(CheckBox)findViewById(R.id.c2);
        c3=(CheckBox)findViewById(R.id.c3);

        e=(EditText)findViewById(R.id.e);

        radiogroup = (RadioGroup) findViewById(R.id.rg);
        radiogroup1 = (RadioGroup) findViewById(R.id.rg1);
        radiogroup2 = (RadioGroup) findViewById(R.id.rg2);
        radiogroup3 = (RadioGroup) findViewById(R.id.rg3);

        r4 = (RadioButton) findViewById(R.id.r4);
        r21 = (RadioButton) findViewById(R.id.r21);
        r32 = (RadioButton) findViewById(R.id.r32);
        r33=(RadioButton) findViewById(R.id.r33);





        Button next = (Button) findViewById(R.id.b);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call();
                if (score == 6) {
                    Toast.makeText(MainActivity.this, " kudos,you scored 6/6", Toast.LENGTH_SHORT).show();
                }
                if (score < 6) {
                    Toast.makeText(MainActivity.this, " you scored" + score + "/6", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
public void call(){
    s = e.getText().toString().toLowerCase();
    if (s.equals("android asset packaging tool")) {
        score = score + 1;
    }
    }

//for quetion no 1
    public void Checkbutton(View v) {

        int radioId = radiogroup.getCheckedRadioButtonId();
        radiobutton = (RadioButton) findViewById(radioId);
        if (radiobutton == r4) {
            score = score + 1;
        }
    }
    //for quetion no 2
        public void Checkbutton1(View v) {
        int radioId1 = radiogroup1.getCheckedRadioButtonId();
        radiobutton1 = (RadioButton) findViewById(radioId1);
        if (radiobutton1 == r21) {
            score = score + 1;
        }
    }
    //for quetion no 3
        public void Checkbutton2(View v){
        int radioId2 = radiogroup2.getCheckedRadioButtonId();
        radiobutton2 = (RadioButton)findViewById(radioId2);
        if (radiobutton2 == r32) {
            score = score + 1;
        }}
    //for quetion no 4
        public void Checkbutton3(View v){
        int radioId3 = radiogroup3.getCheckedRadioButtonId();
        radiobutton3 = (RadioButton) findViewById(radioId3);
        if (radiobutton3 == r33) {
            score = score + 1;
        }}
    //for quetion no 5
    public void Checked(View v){
        cc1= c1.isChecked();
        cc2= c2.isChecked();
        cc3=c3.isChecked();
        if(cc1 && cc2 && !cc3){
            score=score+1;
        }
    }


}



