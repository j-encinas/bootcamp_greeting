package com.github.jencinas.bootcamp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greetUser() {
        TextView usernameTextView = (TextView) findViewById(R.id.mainUserName);
        String userName = usernameTextView.getText().toString();
        Intent intent = new Intent(this, GreetingActivity.class);
        intent.putExtra("EXTRA_USER_NAME", userName);
        startActivity(intent);
    }
}