package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {
    private Button button1 = findViewById(R.id.button1);
    private TextView button1text;
    private EditText editText5;
    private Button button2 = findViewById(R.id.button2);
    private TextView button2text;
    private Button button3 = findViewById(R.id.button3);
    private TextView button3text;
    private EditText editText3;
    private Button button4 = findViewById (R.id.button4);
    private TextView button4text;
    private Button button5 = findViewById(R.id.button5);
    private TextView button5text;
    private Button button6 = findViewById(R.id.button6);
    private TextView button6text;
    private Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        button1text = findViewById(R.id.button1text);
        editText5 = findViewById(R.id.editText5);
        button2text=findViewById(R.id.button2text);
        button3text = findViewById(R.id.button3text);
        editText3 = findViewById(R.id.editText3);
        button4text = findViewById(R.id.button4text);
        button5text = findViewById(R.id.button5text);
        button6text = findViewById(R.id.button6text);
        btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(myInt);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Page2.this, "Hi click listener worked", Toast.LENGTH_SHORT).show();
                String k=editText5.getText().toString();
                int kg = Integer.parseInt(k);
                double pound = 2.205 * kg;
                button1text.setText("Ans =" + pound );
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Toast.makeText(Page2.this, "Click Listener worked", Toast.LENGTH_SHORT).show();
                                        String k=editText5.getText().toString();
                                        int kg = Integer.parseInt(k);
                                        int Gram = 1000 * kg;
                                        button2text.setText("Ans = " + Gram );

                                    }
                                }
        );
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Page2.this, "Click Listener worked", Toast.LENGTH_SHORT).show();
                String m=editText5.getText().toString();
                int kg = Integer.parseInt(m);
                double Ton = 0.0011 *  kg;
                button3text.setText("Ans =" + Ton);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Page2.this, "Click listener worked", Toast.LENGTH_SHORT).show();
                String m = editText3.getText().toString();
                int Rs = Integer.parseInt(m);
                double Dollar = 0.012 * Rs;
                button4text.setText("Ans =" + Dollar);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Page2.this, "Click listener worked", Toast.LENGTH_SHORT).show();
                String m = editText3.getText().toString();
                int Rs = Integer.parseInt(m);
                double Euro = 0.011 * Rs;
                button5text.setText("Ans =" + Euro);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Page2.this, "Click listener worked", Toast.LENGTH_SHORT).show();
                String m = editText3.getText().toString();
                int Rs = Integer.parseInt(m);
                double Yen = 1.61 * Rs;
                button6text.setText("Ans =" + Yen);
            }
        });
    }

}