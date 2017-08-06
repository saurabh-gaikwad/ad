package com.example.hp.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class PassedDataThroughIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passed_data_through_intent);
        String message= getIntent().getStringExtra("Message");
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
