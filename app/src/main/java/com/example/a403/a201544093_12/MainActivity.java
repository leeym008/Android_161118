package com.example.a403.a201544093_12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2;
    Button b1,b2,b3,b4,b5;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText)findViewById(R.id.editText1);
        input2 = (EditText)findViewById(R.id.editText2);
        b1 =  (Button)findViewById(R.id.button1);
        b2 =  (Button)findViewById(R.id.button2);
        b3 =  (Button)findViewById(R.id.button3);
        b4 =  (Button)findViewById(R.id.button4);
        b5 =  (Button)findViewById(R.id.button5);
        t1 = (TextView)findViewById(R.id.textView1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(input1.getText().toString());
                double num2 = Double.parseDouble(input2.getText().toString());
                double result = num1 + num2;
                t1.setText(result+"");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(input1.getText().toString());
                double num2 = Double.parseDouble(input2.getText().toString());
                double result = num1 - num2;
                t1.setText(result+"");
            }
        });

        b3.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(input1.getText().toString());
                double num2 = Double.parseDouble(input2.getText().toString());
                double result = num1 * num2;
                t1.setText(result+"");
            }
        }));

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(input1.getText().toString());
                double num2 = Double.parseDouble(input2.getText().toString());
                double result = num1 / num2;
                t1.setText(result+"");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(input1.getText().toString());
                double num2 = Double.parseDouble(input2.getText().toString());
                double result = num1 % num2;
                t1.setText(result+"");
            }
        });

    }

}
