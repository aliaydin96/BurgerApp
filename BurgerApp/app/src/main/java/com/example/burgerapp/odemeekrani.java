package com.example.burgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class odemeekrani extends AppCompatActivity {
    FoodDatabaseHelper foodDatabaseHelper;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odemeekrani);
        foodDatabaseHelper = new FoodDatabaseHelper(this);
        spinner = findViewById(R.id.spinner);

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
        final List<String> foodData = foodDatabaseHelper.getFoodData();

        Button odemeyap = findViewById(R.id.odemeyap);
        odemeyap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
                String masaNo = spinner.getSelectedItem().toString();
                if(bbqburger_counter > 0){

                    foodDatabaseHelper.addFoodData(masaNo,"BBQ Burger", bbqburger_counter, date);
                }
                if(mushroomburger_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Mushroom Burger", mushroomburger_counter, date);
                }
                if(doublecheeseburger_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Double Cheese Burger", doublecheeseburger_counter, date);
                }
                if(cheeseburger_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Cheese Burger", cheeseburger_counter, date);
                }
                if(chickenburger_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Chicken Burger", chickenburger_counter, date);
                }
                if(classicburger_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Classic Burger", classicburger_counter, date);
                }
                if(elmadilim_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Elma Dilim Patates", elmadilim_counter, date);
                }
                if(tirtiklipatates_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Tırtıklı Patates", tirtiklipatates_counter, date);
                }
                if(nugget_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Nugget", nugget_counter, date);
                }
                if(soganhalkasi_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Soğan Halkası", soganhalkasi_counter, date);
                }
                if(su_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Su", su_counter, date);
                }
                if(ayran_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Ayran", ayran_counter, date);
                }
                if(fanta_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Fanta", fanta_counter, date);
                }
                if(kola_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Kola", kola_counter, date);
                }
                if(sprite_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Sprite", sprite_counter, date);
                }
                if(icetea_counter > 0){
                    foodDatabaseHelper.addFoodData(masaNo,"Icetea", icetea_counter, date);
                }
                Toast.makeText(getApplicationContext(),"Odeme islemi tamamlandi.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
