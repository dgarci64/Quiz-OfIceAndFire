package com.example.andriod.quizoficeandfire;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int finalscore = 0;
    String answer_Q1 = "winter";
    String answer_Q5a = "fire";
    String answer_Q5b = "blood";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method is called when the submit button is clicked, calculates the users score, displays it as a toast and then resets the score.
    public int submitAnswers(View view) {
        //this section calls the methods that check each individual questions.
        qCheck_1();
        qCheck_2();
        qCheck_3();
        qCheck_4();
        qCheck_5();
        qCheck_6();
        qCheck_7();
        qCheck_8();
        qCheck_9();
    //This section creates a toast message, whc will display how many points the user was granted according to their correct answers
        Toast.makeText(this, "Quiz submitted, you answered " + finalscore + " questions correctly out of 9!", Toast.LENGTH_SHORT).show();
        return finalscore = 0;
    }

    //this section checks the edit text question field and adds a point if they match the declared string value
    public void qCheck_1() {
        EditText inputField_1 = findViewById(R.id.entry1_q1);
        String questionAnswer_1 = inputField_1.getText().toString();
        if (answer_Q1.compareToIgnoreCase(questionAnswer_1) == 0) {
            finalscore++;
        }
    }

    //this method adds a point if the correct radio button is selected for question 2
    public void qCheck_2() {
        RadioButton q2c = findViewById(R.id.correctAnswer_q2);

        if (q2c.isChecked())
            finalscore++;
    }

    //this method adds a point if the correct radio button is selected for question 3
    public void qCheck_3() {
        RadioButton q3c = findViewById(R.id.correctAnswer_q3);

        if (q3c.isChecked())
            finalscore++;
    }

    //this method adds a point if the correct radio button is selected for question 4
    public void qCheck_4() {
        RadioButton q2c = findViewById(R.id.correctAnswer_q4);

        if (q2c.isChecked())
            finalscore++;
    }

    //this method adds a point if the correct checkboxes are checked only
    public void qCheck_5() {
        CheckBox checkBox_1 =  findViewById(R.id.checkbox1_q5);
        CheckBox checkBox_2 =  findViewById(R.id.checkbox2_q5);
        CheckBox checkBox_3 =  findViewById(R.id.checkbox3_q5);
        if (checkBox_1.isChecked() && checkBox_2.isChecked() && !checkBox_3.isChecked()) {
            finalscore++;
        }
    }

    //this method adds a point if the correct radio button is selected for question 6
    public void qCheck_6() {
        RadioButton q2c = findViewById(R.id.correctAnswer_q6);

        if (q2c.isChecked())
            finalscore++;
    }

    //this method adds a point if the correct radio button is selected for question 7
    public void qCheck_7() {
        RadioButton q2c = findViewById(R.id.correctAnswer_q7);

        if (q2c.isChecked())
            finalscore++;
    }

    //this method adds a point if the correct radio button is selected for question 8
    public void qCheck_8() {
        RadioButton q2c = findViewById(R.id.correctAnswer_q8);

        if (q2c.isChecked())
            finalscore++;
    }

    //this method adds a point if the correct checkboxes are checked only
    public void qCheck_9() {
        CheckBox checkBox_1 =  findViewById(R.id.checkbox1_q9);
        CheckBox checkBox_2 =  findViewById(R.id.checkbox2_q9);
        CheckBox checkBox_3 =  findViewById(R.id.checkbox3_q9);
        if (checkBox_1.isChecked() && checkBox_2.isChecked() && !checkBox_3.isChecked()) {
            finalscore++;
        }
    }
}