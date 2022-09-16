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


    public void switchScreens(View v){
        // get a reference to the EditText element in the xml page that is connected to this activity.
        // to this activity
        EditText editText1 = findViewById(R.id.name);
        EditText editText2 = findViewById(R.id.day);
        // extract the text
        String name = editText1.getText().toString();
        String day = editText2.getText().toString();

        String nameAndDay = "Hi " + name + ", I hope you have a great " +  day + "!";

        /*
        Create an intent (envelope) by telling Android who the sender and receiver is
        then we need to fill teh intent and lastly we need to start the intent.
         */

        Intent intent = new Intent(this, NameAndDay.class);
        // first param is the sender of the intent, which is this Activity
        // second param is the receiver, which is SecondActivity

        // we need to label everything we put into the intent so that it can be extracted
        // when the intent is opened in the other activity
        intent.putExtra("message", nameAndDay);
        // launches the new screen and passes the information
        startActivity(intent);

    }

}





