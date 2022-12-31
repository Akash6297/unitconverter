package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button pound;
    private TextView textView;
    private EditText editText;
    private Button gram;
    private TextView Text;
    private Button ton;
    private TextView text3;
    private EditText editText2;
    private Button dollar;
    private TextView dollartext;
    private Button euro;
    private TextView eurotext;
    private Button yen;
    private TextView yentext;
    private Button btnchange;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pound = findViewById(R.id.pound);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        gram = findViewById(R.id.gram);
        Text = findViewById(R.id.Text);
        ton = findViewById(R.id.ton);
        text3 = findViewById(R.id.text3);
        editText2 = findViewById(R.id.editText2);
        dollar = findViewById(R.id.dollar);
        dollartext = findViewById(R.id.dollartext);
        euro = findViewById(R.id.euro);
        eurotext = findViewById(R.id.eurotext);
        yen = findViewById(R.id.yen);
        yentext = findViewById(R.id.yentext);
        btnchange = findViewById(R.id.btnchange);
        btnchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(),Page2.class);
                startActivity(myInt);
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String k = editText.getText().toString();
                if (k.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    int kg = Integer.parseInt(k);
                    double pound = 2.205 * kg;
                    textView.setText("Ans =" + pound);
                    Toast.makeText(MainActivity.this, "Hi click listener worked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        gram.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        String k = editText.getText().toString();
                                        if (k.isEmpty())
                                        {
                                            Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                                        }
                                        else {
                                            int kg = Integer.parseInt(k);
                                            int Gram = 1000 * kg;
                                            Text.setText("Ans = " + Gram);
                                            Toast.makeText(MainActivity.this, "Click Listener worked", Toast.LENGTH_SHORT).show();
                                        }

                                    }
                                }
        );
        ton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String m = editText.getText().toString();
                if (m.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    int kg = Integer.parseInt(m);
                    double Ton = 0.0011 * kg;
                    text3.setText("Ans =" + Ton);
                    Toast.makeText(MainActivity.this, "Click Listener worked", Toast.LENGTH_SHORT).show();
                }

            }
        });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String m = editText2.getText().toString();
                if (m.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    int Rs = Integer.parseInt(m);
                    double Dollar = 0.012 * Rs;
                    dollartext.setText("Ans =" + Dollar);
                    Toast.makeText(MainActivity.this, "Click listener worked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Click listener worked", Toast.LENGTH_SHORT).show();
                String m = editText2.getText().toString();
                if (m.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    int Rs = Integer.parseInt(m);
                    double Euro = 0.011 * Rs;
                    eurotext.setText("Ans =" + Euro);
                    Toast.makeText(MainActivity.this, "Click listener worked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String m = editText2.getText().toString();
                if (m.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }
                else {
                    int Rs = Integer.parseInt(m);
                    double Yen = 1.61 * Rs;
                    yentext.setText("Ans =" + Yen);
                    Toast.makeText(MainActivity.this, "Click listener worked", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}