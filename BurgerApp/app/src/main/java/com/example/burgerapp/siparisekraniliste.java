package com.example.burgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
public class siparisekraniliste extends AppCompatActivity {
//////////////////////////////////////////////////////////
////////        FIYAT LISTESI
/////////////////////////////////////////////////////////
    Button odemeyap;
    int bbqburger_fiyat = 27;
    int mushroomburger_fiyat = 28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siparisekraniliste);
        odemeyap = findViewById(R.id.odemeyap);

        Bundle gelenveri = getIntent().getExtras();
        final int bbqburger_counter = gelenveri.getInt("bbqburger");
        final int mushroomburger_counter = gelenveri.getInt("mushroomburger");
        bbqburger_fiyat = bbqburger_counter * bbqburger_fiyat;
        mushroomburger_fiyat = mushroomburger_fiyat * mushroomburger_counter;
        // Get the widgets reference from XML layout
        LinearLayout linearLayout =  findViewById(R.id.linearLayoutUyelistesi);

        if(bbqburger_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(bbqburger_counter + " X BBQ Burger " + bbqburger_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(mushroomburger_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(mushroomburger_counter + " X Mushroom Burger " + mushroomburger_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }


        int ToplamFiyat = bbqburger_fiyat + mushroomburger_fiyat;

        TextView tv = new TextView(getApplicationContext());
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
        tv.setTextSize(28);
        tv.setLayoutParams(lp);
        tv.setText("Toplam Fiyat: " + ToplamFiyat + " TL");
        tv.setTextColor(Color.parseColor("#ff0000"));
        linearLayout.addView(tv);


        odemeyap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), odemeekrani.class);
                intent.putExtra("bbqburger", bbqburger_counter);
                intent.putExtra("mushroomburger", mushroomburger_counter);
                startActivity(intent);
            }
        });


    }
}
