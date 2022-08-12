package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {
    EditText no1,no2,no3;
    Button btadd,btsub,btmul,btdiv;
    double n1,n2,n3;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1=findViewById(R.id.num1);
        no2=findViewById(R.id.num2);
        no3=findViewById(R.id.num3);
        btadd=findViewById(R.id.btnadd);
        btsub=findViewById(R.id.btnsub);
        btmul=findViewById(R.id.mulbtn);
        btdiv=findViewById(R.id.divbtn);





        btadd.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(no1.getText().toString());
                n2=Double.parseDouble(no2.getText().toString());
                n3=n1+n2;
                no3.setText(String.valueOf(n3));
            }
        });
        btsub.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(no1.getText().toString());
                n2=Double.parseDouble(no2.getText().toString());
                n3=n1-n2;
                no3.setText(String.valueOf(n3));
            }
        });
        btmul.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(no1.getText().toString());
                n2=Double.parseDouble(no2.getText().toString());
                n3=n1*n2;
                no3.setText(String.valueOf(n3));
            }
        });
        btdiv.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(no1.getText().toString());
                n2=Double.parseDouble(no2.getText().toString());
                n3=n1/n2;
                no3.setText(String.valueOf(n3));
            }
        });
    }
}
