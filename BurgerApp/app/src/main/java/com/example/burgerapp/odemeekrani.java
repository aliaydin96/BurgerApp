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

                Toast.makeText(getApplicationContext(),"Odeme islemi tamamlandi.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
