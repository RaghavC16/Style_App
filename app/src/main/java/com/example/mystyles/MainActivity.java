package com.example.mystyles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView text = findViewById(R.id.finaltext);

    public void hitButton(View v){
        // get a reference to the EditText element in the xml page that is connected to this activity.
        // to this activity
        EditText editText1 = findViewById(R.id.name);
        EditText editText2 = findViewById(R.id.day);
        // extract the text
        String input1 = editText1.getText().toString();
        String input2 = editText2.getText().toString();

        String output = "Hi " + input1 + " I hope you have a great " + editText2 + "!";

        // I learned how to use the Double.toString to change the double answer into a string to display on the second screen.
        text.setText(output);
        // launches the new screen and passes the information


    }


}