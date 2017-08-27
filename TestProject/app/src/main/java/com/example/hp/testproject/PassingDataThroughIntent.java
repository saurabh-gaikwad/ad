package com.example.hp.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PassingDataThroughIntent extends AppCompatActivity {
Button sendDAtaButton;
TextView mesasge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_data_through_intent);

        sendDAtaButton =(Button)findViewById(R.id.sendDataButton);
        sendDAtaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesasge=(EditText)findViewById(R.id.message);
                String messageString=mesasge.getText().toString();
                Intent intent = new Intent(PassingDataThroughIntent.this,PassedDataThroughIntent.class);
                intent.putExtra("Message",messageString);
                PassingDataThroughIntent.this.finish();
                startActivity(intent);

            }
        });
    }

}
