package com.example.hanan.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox Q1_answer1, Q1_answer2, Q1_answer3,Q1_answer4;
    RadioGroup group;
    RadioButton rd_Btn;


    int yourScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void Result_Q1()
    {
        TextView msg_Q1= (TextView) findViewById(R.id.tv_above_q1);
        msg_Q1.setText("");

        // check whether user selected all right answers or not
        Q1_answer1 = (CheckBox) findViewById(R.id.Poirot_ChB);
        Q1_answer2 = (CheckBox) findViewById(R.id.Marple_ChB);
        Q1_answer3 = (CheckBox) findViewById(R.id.Lupin_ChB);
        Q1_answer4 = (CheckBox) findViewById(R.id.watson_ChB);

        if(Q1_answer1.isChecked()&&Q1_answer2.isChecked()&&!Q1_answer3.isChecked()&&!Q1_answer4.isChecked())
        {
            yourScore++;
            Q1_answer1.setBackgroundColor(Color.GREEN);
            Q1_answer2.setBackgroundColor(Color.GREEN);
        }
        else if((Q1_answer1.isChecked()&&!Q1_answer2.isChecked())||
        (!Q1_answer1.isChecked()&&Q1_answer2.isChecked())) {
            msg_Q1.setText("You must choose all right answers ");
            msg_Q1.setTextColor(Color.RED);
        }
        // check whether user selected answer 3 or not

        if(Q1_answer3.isChecked())
        {
            Q1_answer3.setBackgroundColor(Color.RED);
        }

        // check whether user selected answer 4 or not

        if(Q1_answer4.isChecked())
        {
            Q1_answer4.setBackgroundColor(Color.RED);
        }
     if(!Q1_answer1.isChecked()&&!Q1_answer2.isChecked()&&!Q1_answer3.isChecked()&&!Q1_answer4.isChecked())
     {
         msg_Q1.setText( "You didn't choose answer for Question 1 ");
        msg_Q1.setTextColor(Color.RED);
     }

    }
    void Result_Q2()
    {
        TextView msg_Q2= (TextView) findViewById(R.id.tv_above_q2);
        msg_Q2.setText("");
        //check whether user selected the right answer or not
        group = (RadioGroup) findViewById(R.id.radio_gp2);
        rd_Btn = (RadioButton) findViewById(R.id.Right_Answer_Q2);

        if(group.getCheckedRadioButtonId() == R.id.Right_Answer_Q2)
        {
            yourScore++;
            rd_Btn.setBackgroundColor(Color.GREEN);
        }
        else if(group.getCheckedRadioButtonId() == -1) {
            msg_Q2.setText("You didn't choose answer for Question 2 ");
            msg_Q2.setTextColor(Color.RED);
        }
        else
        {
            rd_Btn= (RadioButton) findViewById(group.getCheckedRadioButtonId());
            rd_Btn.setBackgroundColor(Color.RED);
        }

    }
   void Result_Q3()
    {
        TextView msg_Q3= (TextView)  findViewById(R.id.tv_above_q3);
        msg_Q3.setText("");
        //check whether user selected the right answer or not
        group = (RadioGroup) findViewById(R.id.radio_gp3);
        rd_Btn = (RadioButton) findViewById(R.id.Right_Answer_Q3);

        if(group.getCheckedRadioButtonId() == R.id.Right_Answer_Q3)
        {
            yourScore++;
            rd_Btn.setBackgroundColor(Color.GREEN);
        }
        else if(group.getCheckedRadioButtonId() == -1) {
            msg_Q3.setText("You didn't choose answer for Question 3 ");
            msg_Q3.setTextColor(Color.RED);
        }
        else
        {
            rd_Btn= (RadioButton) findViewById(group.getCheckedRadioButtonId());
            rd_Btn.setBackgroundColor(Color.RED);
        }

    }
    void Result_Q4()
    {
        TextView msg_Q4 = (TextView) findViewById(R.id.tv_above_q4);
        msg_Q4.setText("");
        //check whether user selected the right answer or not
        group = (RadioGroup) findViewById(R.id.radio_gp4);
        rd_Btn = (RadioButton) findViewById(R.id.Right_Answer_Q4);

        if(group.getCheckedRadioButtonId() == R.id.Right_Answer_Q4)
        {
            yourScore++;
            rd_Btn.setBackgroundColor(Color.GREEN);
        }
        else if(group.getCheckedRadioButtonId() == -1) {
            msg_Q4.setText("You didn't choose answer for Question 4 ");
            msg_Q4.setTextColor(Color.RED);
        }
        else
        {
            rd_Btn= (RadioButton) findViewById(group.getCheckedRadioButtonId());
            rd_Btn.setBackgroundColor(Color.RED);
        }

    }
    void Result_Q5()
    {
        TextView msg_Q5=(TextView) findViewById(R.id.tv_above_q5);
        msg_Q5.setText("");
        //check whether user selected the right answer or not
        group = (RadioGroup) findViewById(R.id.radio_gp5);
        rd_Btn = (RadioButton) findViewById(R.id.Right_Answer_Q5);

        if(group.getCheckedRadioButtonId() == R.id.Right_Answer_Q5)
        {
            yourScore++;
            rd_Btn.setBackgroundColor(Color.GREEN);
        }
        else if(group.getCheckedRadioButtonId() == -1) {
            msg_Q5.setText("You didn't choose answer for Question 5 ");
            msg_Q5.setTextColor(Color.RED);
        }
        else
        {
            rd_Btn= (RadioButton) findViewById(group.getCheckedRadioButtonId());
            rd_Btn.setBackgroundColor(Color.RED);
        }

    }
   void Result_Q6()
    {
        TextView msg_Q6 = (TextView) findViewById(R.id.tv_above_q6);
        msg_Q6.setText("");
        //check whether user selected the right answer or not
        group = (RadioGroup) findViewById(R.id.radio_gp6);
        rd_Btn = (RadioButton) findViewById(R.id.Right_Answer_Q6);

        if(group.getCheckedRadioButtonId() == R.id.Right_Answer_Q6)
        {
            yourScore++;
            rd_Btn.setBackgroundColor(Color.GREEN);
        }
        else if(group.getCheckedRadioButtonId() == -1) {
            msg_Q6.setText("You didn't choose answer for Question 6 ");
            msg_Q6.setTextColor(Color.RED);
        }
        else
        {
            rd_Btn= (RadioButton) findViewById(group.getCheckedRadioButtonId());
            rd_Btn.setBackgroundColor(Color.RED);
        }

    }

    void Result_Q7()
    {
        EditText AnswerOfQ7 = (EditText) findViewById(R.id.Question7_Answer);
        TextView msg_Q7 = (TextView) findViewById(R.id.tv_above_q7);
        msg_Q7.setText("");

        if(AnswerOfQ7.getText().toString().equals("Professor Moriarty")||AnswerOfQ7.getText().toString().equals("Moriarty")) {
            yourScore++;
            AnswerOfQ7.setTextColor(Color.GREEN);
        }
        else if(AnswerOfQ7.getText().toString().equals("")) {
            msg_Q7.setText("You didn't give an answer for Question 7 ");
            msg_Q7.setTextColor(Color.RED);
        }
        else {
            msg_Q7.setText("Wrong Answer!");
            msg_Q7.setTextColor(Color.RED);
            AnswerOfQ7.setTextColor(Color.RED);
        }

    }
    void Submit (View v){
        EditText name_tv = (EditText) findViewById(R.id.name_tv);
        TextView result_tv = (TextView) findViewById(R.id.Quiz_result); //tv short for textview
        Result_Q1(); Result_Q2(); Result_Q3(); Result_Q4(); Result_Q5(); Result_Q6(); Result_Q7();
        if(yourScore<=4)
        {
            result_tv.setText("Detective "+ name_tv.getText().toString()+" needs to read more!");
            result_tv.setTextColor(Color.RED);
        }
        else
        {
            result_tv.setText("Congratulations Detective "+ name_tv.getText().toString()+", you are a real fan!");
            result_tv.setTextColor(Color.GREEN);
        }

        Toast.makeText(this, "your score is: "+ yourScore+" out of 7", Toast.LENGTH_SHORT).show();
       yourScore=0;
    }
    void Reset(View v)
    {
        // I made this because I didn't want to make a variable for every answer,and then clear check.
        // that's a lot of variables and a waste of memory!
        //and also I'd empty all text messages above every question, a lot of hassle!
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
}
