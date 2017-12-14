package com.example.ammarfalmban.quiz_app_withradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    // this is the global varaible
    int q, s;
    // define the
    private EditText ed1;
    private TextView tv1, tv2, tv3;
    private RadioButton a, b, c, d;
    private Button bt;
    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.name);

        tv1 = findViewById(R.id.ques);
        tv2 = findViewById(R.id.response);
        tv3 = findViewById(R.id.score);

        rg = findViewById(R.id.optionGroup);
        a = findViewById(R.id.option1);
        b = findViewById(R.id.option2);
        c = findViewById(R.id.option3);
        d = findViewById(R.id.option4);

        bt = findViewById(R.id.next);

        q = 0;
        s = 0;
    }

    public void quiz(View v) {


        switch (q) {
            case 0: {
                rg.setVisibility(View.VISIBLE);
//                Radio Button value
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                tv2.setText("");
                tv3.setText("");
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                ed1.setEnabled(true);
                bt.setText("Next");
                s = 0;

                // That is the First Question view will shown to the user
                ed1.setEnabled(false);
                tv1.setText("1.When did India its independece?");
                a.setText("1847");
                b.setText("1947");
                c.setText("1850");
                d.setText("1950");
                q = 1;

                break;

            }
            // That is the Second Question view will shown to the user
            case 1: {

                if (b.isChecked()) {
//                    tv2.setText("Right Answer");
                    s = s + 10;
                } else {
//                    tv2.setText("Wrong Answer   B was Right Answer");
                }

                ed1.setEnabled(false);
                tv1.setText("2.Who is India's father of nation?");
                a.setText("Mahatma Gandhi");
                b.setText("Lal Bahadur Shashtri");
                c.setText("Jawaharlal Nehru");
                d.setText("Subhash Chandra Bose");


                q = 2;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 2: {
                tv1.setText("3.Who was the first lady CM of Uttar Pradesh?");
                a.setText("Pratibha Singh Patil");
                b.setText("Indira Gandhi");
                c.setText("Sucheta Kriplani");
                d.setText("Mayawati");
                if (a.isChecked()) {
                    s = s + 10;
                    tv2.setText("Right Answer");

                } else {
                    tv2.setText("Wrong Answer   A was Right Answer");
                }
                q = 3;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 3: {

                tv1.setText("4.Who was first Indian lady to go in space?");
                a.setText("Mayawati");
                b.setText("Kalpana Chawla");
                c.setText("Kiran Bedi");
                d.setText("Sunita Williams");
                if (c.isChecked()) {
                    s = s + 10;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText("Wrong Answer  C was Right Answer");
                }
                q = 4;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 4: {
                tv1.setText("5.Who designed India's national flag?");
                a.setText("Rahul Gandhi");
                b.setText("Bankim Chandra Chatterjee");
                c.setText("Ishwar Chandra Vidyasagar");
                d.setText("Pingali Venkayya");
                if (b.isChecked()) {
                    s = s + 10;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText("Wrong Answer  B was Right Answer");
                }
                q = 5;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                bt.setText("Finish");
                break;
            }
            case 5: {
                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                if (d.isChecked()) {
                    s = s + 10;
                    tv2.setText("Right Answer");
                } else {
                    tv2.setText("Wrong Answer  D was Right Answer");
                }
                tv3.setText(ed1.getText() + "'s final score is " + s);
                bt.setText("Restart");
                q = 0;
                break;
            }
        }
    }
}
