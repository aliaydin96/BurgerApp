package com.example.burgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class siparisekraniliste extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siparisekraniliste);

        Bundle gelenveri = getIntent().getExtras();
        int bbqburger_counter = gelenveri.getInt("bbqburger");
        int mushroomburger_counter = gelenveri.getInt("mushroomburger");

        // Get the widgets reference from XML layout
        LinearLayout linearLayout =  findViewById(R.id.linearLayout);

        if(bbqburger_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            String counter = Integer.toString(bbqburger_counter);
            tv.setText(counter + " X BBQ Burger");
            tv.setTextColor(Color.parseColor("#ff0000"));
            linearLayout.addView(tv);
        }
        if(mushroomburger_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            String counter = Integer.toString(mushroomburger_counter);
            tv.setText(counter + " X Mushroom Burger");
            tv.setTextColor(Color.parseColor("#ff0000"));
            linearLayout.addView(tv);
        }
    }
}
