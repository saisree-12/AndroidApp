package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity<b1> extends AppCompatActivity {
    public TextView t1;
    public TextView t3;
    public EditText t2;
    public EditText t4;
    public TextView t7;
    public Button b1;
    public Button b2 ;
    public Button b3 ;
    public Button b4 ;
    public TextView t5;
    public EditText t6;
    public String res;
    public double r1;
    public double r2;
    public double r3;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.img);
        imageView.setVisibility(View.VISIBLE);
        t1=(TextView) findViewById(R.id.t1);
        t2=(EditText) findViewById(R.id.t2);
        t3=(TextView) findViewById(R.id.t3);
        t4=(EditText) findViewById(R.id.t4);
        t5=(TextView) findViewById(R.id.t5);
        t6=(EditText) findViewById(R.id.t6);
        t7=(TextView) findViewById(R.id.t7);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1=Double.parseDouble(t2.getText().toString());
                r2=Double.parseDouble(t4.getText().toString());
                r3= r1 + r2;
                res=String.valueOf(r3);
                t6.setText(res);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1=Double.parseDouble(t2.getText().toString());
                r2=Double.parseDouble(t4.getText().toString());
                r3= r1 - r2;
                res=String.valueOf(r3);
                t6.setText(res);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1=Double.parseDouble(t2.getText().toString());
                r2=Double.parseDouble(t4.getText().toString());
                r3= r1 * r2;
                res=String.valueOf(r3);
                t6.setText(res);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r1=Double.parseDouble(t2.getText().toString());
                r2=Double.parseDouble(t4.getText().toString());
                r3= r1 / r2;
                res=String.valueOf(r3);
                t6.setText(res);
            }
        });
    }
}