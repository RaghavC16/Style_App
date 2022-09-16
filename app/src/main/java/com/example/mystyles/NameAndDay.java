package com.example.mystyles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NameAndDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_and_day);

        // after the basic xml for the pade is set up, this is where we can do
        // other set up we need such as getting an intent

        Intent intent = getIntent();
        String nameToShow  = intent.getStringExtra("message");



        // Get a reference to the TextView for the xml for THIS page
        // then I can set text for this TextView

        TextView textView = findViewById(R.id.messageBox);
        textView.setText(nameToShow);
    }
}