package com.example.burgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

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
                String masaNo = spinner.getSelectedItem().toString();
                int counter = 0;
                boolean bbqburger_existence = false;
                boolean mushroomburger_existence = false;
                while (foodData.size() > counter){
                    if((bbqburger_counter > 0) & (foodData.get(counter).contentEquals("BBQ Burger"))){
                        bbqburger_existence = true;
                        int number = Integer.parseInt(foodData.get(counter+1)) + bbqburger_counter;
                        foodDatabaseHelper.addFoodData(masaNo,"BBQ Burger", number);
                    }
                    if((mushroomburger_counter > 0) & (foodData.get(counter).contentEquals("Mushroom Burger"))){
                        mushroomburger_existence = true;
                        int number = Integer.parseInt(foodData.get(counter+1)) + mushroomburger_counter;
                        foodDatabaseHelper.addFoodData(masaNo,"Mushroom Burger", number);
                    }
                    counter++;
                }
                if((bbqburger_existence == false) & (bbqburger_counter > 0)){
                    foodDatabaseHelper.addFoodData(masaNo,"BBQ Burger", bbqburger_counter);
                }
                if((mushroomburger_existence == false) & (mushroomburger_counter > 0)){
                    foodDatabaseHelper.addFoodData(masaNo,"Mushroom Burger", mushroomburger_counter);
                }
                Toast.makeText(getApplicationContext(),"Odeme islemi tamamlandi.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
