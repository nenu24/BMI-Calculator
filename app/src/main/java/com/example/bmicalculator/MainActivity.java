package com.example.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button calculate;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        calculate = findViewById(R.id.caculate);
        display = findViewById(R.id.display);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Float h = Float.parseFloat(et1.getText().toString());
                Float w = Float.parseFloat(et2.getText().toString());

                display.setText("Ans = "+w/((h/100)*(h/100)));
            }
        });
    }
}