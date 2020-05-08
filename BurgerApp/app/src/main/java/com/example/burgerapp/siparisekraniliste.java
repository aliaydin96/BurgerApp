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
    int doublecheeseburger_fiyat = 35;
    int cheeseburger_fiyat = 30;
    int chickenburger_fiyat = 22;
    int classicburger_fiyat = 25;
    int soganhalkasi_fiyat = 8;
    int elmadilim_fiyat = 7;
    int tirtiklipatates_fiyat = 7;
    int nugget_fiyat = 10;
    int su_fiyat = 2;
    int ayran_fiyat = 3;
    int fanta_fiyat = 6;
    int kola_fiyat = 6;
    int sprite_fiyat = 5;
    int icetea_fiyat = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siparisekraniliste);
        odemeyap = findViewById(R.id.odemeyap);

        Bundle gelenveri = getIntent().getExtras();
        final int bbqburger_counter = gelenveri.getInt("bbqburger");
        final int mushroomburger_counter = gelenveri.getInt("mushroomburger");
        final int doublecheeseburger_counter = gelenveri.getInt("doublecheeseburger");
        final int cheeseburger_counter = gelenveri.getInt("cheeseburger");
        final int chickenburger_counter = gelenveri.getInt("chickenburger");
        final int classicburger_counter = gelenveri.getInt("classicburger");
        final int elmadilim_counter = gelenveri.getInt("elmadilim");
        final int nugget_counter = gelenveri.getInt("nugget");
        final int soganhalkasi_counter = gelenveri.getInt("soganhalkasi");
        final int tirtiklipatates_counter = gelenveri.getInt("tirtiklipatates");
        final int su_counter = gelenveri.getInt("su");
        final int ayran_counter = gelenveri.getInt("ayran");
        final int fanta_counter = gelenveri.getInt("fanta");
        final int kola_counter = gelenveri.getInt("kola");
        final int sprite_counter = gelenveri.getInt("sprite");
        final int icetea_counter = gelenveri.getInt("icetea");
        bbqburger_fiyat = bbqburger_counter * bbqburger_fiyat;
        mushroomburger_fiyat = mushroomburger_fiyat * mushroomburger_counter;
        doublecheeseburger_fiyat = doublecheeseburger_fiyat * doublecheeseburger_counter;
        cheeseburger_fiyat = cheeseburger_fiyat * cheeseburger_counter;
        classicburger_fiyat = classicburger_fiyat * classicburger_counter;
        chickenburger_fiyat = chickenburger_fiyat * chickenburger_counter;
        elmadilim_fiyat = elmadilim_fiyat * elmadilim_counter;
        nugget_fiyat = nugget_fiyat * nugget_counter;
        tirtiklipatates_fiyat = tirtiklipatates_fiyat * tirtiklipatates_counter;
        soganhalkasi_fiyat = soganhalkasi_fiyat * soganhalkasi_counter;
        su_fiyat = su_fiyat * su_counter;
        ayran_fiyat = ayran_fiyat * ayran_counter;
        kola_fiyat = kola_fiyat * kola_counter;
        fanta_fiyat = fanta_fiyat * fanta_counter;
        sprite_fiyat = sprite_fiyat * sprite_counter;
        icetea_fiyat = icetea_fiyat * icetea_counter;
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
        if(doublecheeseburger_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(doublecheeseburger_counter + " X Double Cheese Burger " + doublecheeseburger_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(cheeseburger_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(cheeseburger_counter + " X Cheese Burger " + cheeseburger_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(classicburger_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(classicburger_counter + " X Classic Burger " + classicburger_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(elmadilim_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(elmadilim_counter + " X Elma Dilim Patates " + elmadilim_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(chickenburger_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(chickenburger_counter + " X Chicken Burger " + chickenburger_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(tirtiklipatates_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(tirtiklipatates_counter + " X Tirtikli Patates " + tirtiklipatates_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(nugget_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(nugget_counter + " X Nugget " + nugget_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(soganhalkasi_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(soganhalkasi_counter + " X Sogan Halkasi " + soganhalkasi_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(su_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(su_counter + " X Su " + su_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(ayran_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(ayran_counter + " X Ayran " + ayran_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(fanta_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(fanta_counter + " X Fanta " + fanta_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(kola_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(kola_counter + " X kola " + kola_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(icetea_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(icetea_counter + " X Icetea " + icetea_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }
        if(sprite_counter > 0){
            TextView tv = new TextView(getApplicationContext());
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                    RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
            tv.setTextSize(22);
            tv.setLayoutParams(lp);
            tv.setText(sprite_counter + " X Sprite " + sprite_fiyat + " TL");
            tv.setTextColor(Color.parseColor("#000000"));
            linearLayout.addView(tv);
        }

        int ToplamFiyat = bbqburger_fiyat + mushroomburger_fiyat + doublecheeseburger_fiyat + cheeseburger_fiyat + chickenburger_fiyat + classicburger_fiyat + nugget_fiyat + tirtiklipatates_fiyat + elmadilim_fiyat + soganhalkasi_fiyat +  su_fiyat + ayran_fiyat + kola_fiyat + fanta_fiyat + icetea_fiyat + sprite_fiyat;

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
                intent.putExtra("doublecheeseburger", doublecheeseburger_counter);
                intent.putExtra("cheeseburger", cheeseburger_counter);
                intent.putExtra("classicburger", classicburger_counter);
                intent.putExtra("chickenburger", chickenburger_counter);
                intent.putExtra("elmadilim", elmadilim_counter);
                intent.putExtra("soganhalkasi", soganhalkasi_counter);
                intent.putExtra("nugget", nugget_counter);
                intent.putExtra("tirtiklipatates", tirtiklipatates_counter);
                intent.putExtra("su", su_counter);
                intent.putExtra("ayran", ayran_counter);
                intent.putExtra("kola", kola_counter);
                intent.putExtra("fanta", fanta_counter);
                intent.putExtra("icetea", icetea_counter);
                intent.putExtra("sprite", sprite_counter);
                startActivity(intent);
            }
        });


    }
}
