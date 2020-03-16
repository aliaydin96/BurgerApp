package com.example.burgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class uyelistesi extends AppCompatActivity {
    DatabaseHelper mDatabaseHelper;
    List<String> username;
    List<String> password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyelistesi);


        mDatabaseHelper = new DatabaseHelper(this);
        username = mDatabaseHelper.getItemUsername();
        password = mDatabaseHelper.getItemPassword();
        LinearLayout linearLayout =  findViewById(R.id.linearLayout);
        int counter = 0;
        while (username.size()> counter){
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
}
