package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  EditText EnterText;
  Button but;
  TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       EnterText = (EditText) findViewById(R.id.EnterText);
       but = (Button) findViewById(R.id.but);
       textView= (TextView) findViewById(R.id.textView);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(EnterText.getText().toString());

            }
        });

    }
}