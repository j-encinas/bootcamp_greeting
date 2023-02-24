package com.github.jencinas.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        String userName = getIntent().getStringExtra("EXTRA_USER_NAME");
        String greeting = "Hello " + userName;
        TextView textView = (TextView) findViewById(R.id.greetingText);
        textView.setText(greeting);
    }
}