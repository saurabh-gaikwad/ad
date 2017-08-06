package com.example.hp.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ContextViewWithImageViewDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_view_with_image_view_demo);
        TextView textStartContextMenu = (TextView)findViewById(R.id.startcontextmenu);
        registerForContextMenu(textStartContextMenu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // TODO Auto-generated method stub

        Toast.makeText(ContextViewWithImageViewDemo.this,
                String.valueOf(item.getItemId()),
                Toast.LENGTH_LONG).show();

        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        // TODO Auto-generated method stub
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, 0, 0, "- A -");
        menu.add(0, 1, 0, "- B -");
        menu.add(0, 2, 0, "- C -");
        menu.add(0, 4, 0, "- D -");
    }
}
