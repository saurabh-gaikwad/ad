package com.example.hp.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InvokeBuiltInApplications extends AppCompatActivity {

    Button openCallLogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoke_built_in_applications);
        openCallLogButton=(Button) findViewById(R.id.openCallLog);

        openCallLogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent myIntent = new Intent();
                myIntent.setAction(Intent.ACTION_CALL_BUTTON);//ACTION_ALL_APPS ACTION_CALL_BUTTON
                startActivity(myIntent);
            }
        });
    }
}
