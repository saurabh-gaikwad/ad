package com.example.hp.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=(TextView) findViewById(R.id.textView);
        //Setting OnTouchListener on btn1
        textView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //Incrementing the variable count by 1 on every Touch
                count++;
                Toast.makeText(MainActivity.this,
                        "The button has been touched " + count  + " times",Toast.LENGTH_SHORT).show();

                return false;
            }

        });
    }
}
