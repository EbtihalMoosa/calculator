package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0;
    TextView txt1;
    boolean Addition, Subtract, Multiplication, Division, decimal;
    Button buton0, buton1, buton2, buton3, buton4, buton5, buton6, buton7, buton8, buton9, butonplus, butonmin,
            butonmul, butondiv, butoneq, butondec, butonac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buton0 = (Button) findViewById(R.id.btn0);
        buton1 = (Button) findViewById(R.id.btn1);
        buton2 = (Button) findViewById(R.id.btn2);
        buton3 = (Button) findViewById(R.id.btn3);
        buton4 = (Button) findViewById(R.id.btn4);
        buton5 = (Button) findViewById(R.id.btn5);
        buton6 = (Button) findViewById(R.id.btn6);
        buton7 = (Button) findViewById(R.id.btn7);
        buton8 = (Button) findViewById(R.id.btn8);
        buton9 = (Button) findViewById(R.id.btn9);
        butondec = (Button) findViewById(R.id.btndec);
        butondiv = (Button) findViewById(R.id.btndiv);
        butonmul = (Button) findViewById(R.id.btnmul);
        butonplus = (Button) findViewById(R.id.btnplus);
        butonmin = (Button) findViewById(R.id.btnmin);
        butonac = (Button) findViewById(R.id.btnac);
        butoneq = (Button) findViewById(R.id.btneq);
        txt1 = (TextView) findViewById(R.id.txt1);

        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+ "1");
            }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"2");
            }
        });
        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"3");
            }
        });
        buton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"4");
            }
        });
        buton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"5");
            }
        });
        buton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"6");
            }
        });
        buton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"7");
            }
        });
        buton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"8");
            }
        });
        buton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"9");
            }
        });
        buton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(txt1.getText()+"0");
            }
        });

        butonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1.getText().length() != 0){
                    input1 = Float.parseFloat(txt1.getText()+ "");
                    Addition = true;
                    decimal = false;
                    txt1.setText(null);
                }
            }
        });
        butonmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1.getText().length() != 0){
                    input1 = Float.parseFloat(txt1.getText() + "");
                    Subtract = true;
                    decimal = false;
                    txt1.setText(null);
                }
            }
        });
        butonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1.getText().length() != 0){
                    input1 = Float.parseFloat(txt1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    txt1.setText(null);
                }
            }
        });
        butondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt1.getText().length() != 0) {
                    input1 = Float.parseFloat(txt1.getText() + "");
                    Division = true;
                    decimal = false;
                    txt1.setText(null);
                }
            }
        });
        butoneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Addition || Subtract || Multiplication || Division ) {
                    input2 = Float.parseFloat(txt1.getText() + "");
                }
                if (Addition) {
                    txt1.setText(input1 + input2 + "");
                    Addition = false;
                }
                if (Subtract) {
                    txt1.setText(input1 - input2 + "");
                    Subtract = false;
                }
                if (Multiplication) {
                    txt1.setText(input1 * input2 + "");
                    Multiplication = false;
                }
                if (Division) {
                    txt1.setText(input1 / input2 + "");
                    Division = false;
                }
                butonac.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        txt1.setText("");
                        input1 = 0.0;
                        input2 = 0.0;
                    }
                });
            }
        });
    }
}