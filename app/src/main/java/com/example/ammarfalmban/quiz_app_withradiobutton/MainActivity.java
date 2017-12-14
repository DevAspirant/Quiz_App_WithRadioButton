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
            }
        }

    }
}
