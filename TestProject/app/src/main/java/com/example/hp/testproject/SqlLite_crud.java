package com.example.hp.testproject;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SqlLite_crud extends AppCompatActivity {
    SQLiteDatabase db;
    Button b1;
    EditText ex1;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql_lite_crud);
        try {
            db=openOrCreateDatabase("db", Context.MODE_PRIVATE, null);
            db.execSQL("CREATE TABLE IF NOT EXISTS name(id integer primary key, name VARCHAR(255))");
            db.execSQL("insert into name values('1','saurabh')");
            Cursor res = db.rawQuery("select * from name", null);
            if (res.moveToFirst()) {
                do {
                     data = res.getString(res.getColumnIndex("name"));
                    Toast.makeText(getApplicationContext(),data, Toast.LENGTH_LONG).show();
                } while (res.moveToNext());
            }

        }catch(Exception e){e.printStackTrace();}b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = db.rawQuery("select * from name", null);
                if (res.moveToFirst()) {
                    do {
                        data = res.getString(res.getColumnIndex("name"));
                        Toast.makeText(getApplicationContext(),data, Toast.LENGTH_LONG).show();
                    } while (res.moveToNext());
                }
            }
        });


    }
}
