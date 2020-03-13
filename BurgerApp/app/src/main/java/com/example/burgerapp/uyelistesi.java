package com.example.burgerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class uyelistesi extends AppCompatActivity {
    DatabaseHelper mDatabaseHelper;
    List<String> username;
    List<String> password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyelistesi);
        /*
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        mDatabaseHelper = new DatabaseHelper(this);
        // tv = findViewById(R.id.textView46);

        username = mDatabaseHelper.getItemUsername();
        password = mDatabaseHelper.getItemPassword();
        LinearLayout linearLayout =  findViewById(R.id.linearLayoutUyelistesi);
        int counter = 0;
        while ( username.size()> counter){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(counter);
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
            counter++;
        }
    }
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.delete_member) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
