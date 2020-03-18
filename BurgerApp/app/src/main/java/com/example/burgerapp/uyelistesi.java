package com.example.burgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class uyelistesi extends AppCompatActivity {
    DatabaseHelper mDatabaseHelper;
    Button hepsiniSil_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyelistesi);
        mDatabaseHelper = new DatabaseHelper(this);
        hepsiniSil_button = findViewById(R.id.hepsiniSilYonetici_button);
        final List<String> username = mDatabaseHelper.getUsername();
        List<String> password = mDatabaseHelper.getPassword();
        LinearLayout linearLayout =  findViewById(R.id.linearLayout);
        int counter = 0;
        while ( username.size()> counter){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText((counter+1) + " " + username.get(counter) + " " + password.get(counter));
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
            counter++;
        }

        hepsiniSil_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int counter = 0;
                while (username.size()> counter) {
                    mDatabaseHelper.deleteAllName(counter);
                    counter++;
                }
                Toast.makeText(getApplicationContext(), "Silme islemi tamamlandi.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), yoneticiekrani.class);
                startActivity(intent);
            }
        });

    }
}
