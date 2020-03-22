package com.example.burgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class Grafikekrani extends AppCompatActivity {
    BarChart barChart;
    FoodDatabaseHelper foodDatabaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafikekrani);
        foodDatabaseHelper = new FoodDatabaseHelper(this);
        final List<String> foodData = foodDatabaseHelper.getFoodData();
        int counter = 0;
        int bbqburger_counter = 0;
        int mushroomburger_counter = 0;
        int doublecheeseburger_counter = 0;
        int cheeseburger_counter = 0;
        int chickenburger_counter = 0;
        int classicburger_counter = 0;
        int su_counter = 0;
        int ayran_counter = 0;
        int fanta_counter = 0;
        int kola_counter = 0;
        int sprite_counter = 0;
        int icetea_counter = 0;

        while(foodData.size() > counter){
            if(foodData.get(counter).contentEquals("BBQ Burger")){
                bbqburger_counter += Integer.parseInt(foodData.get(counter+1));
            }
            if(foodData.get(counter).contentEquals("Mushroom Burger")){
                mushroomburger_counter += Integer.parseInt(foodData.get(counter+1));
            }
            if(foodData.get(counter).contentEquals("Double Cheese Burger")){
                doublecheeseburger_counter += Integer.parseInt(foodData.get(counter+1));
            }
            if(foodData.get(counter).contentEquals("Cheese Burger")){
                cheeseburger_counter += Integer.parseInt(foodData.get(counter+1));
            }
            if(foodData.get(counter).contentEquals("Chicken Burger")){
                chickenburger_counter += Integer.parseInt(foodData.get(counter+1));
            }
            if(foodData.get(counter).contentEquals("Classic Burger")){
                classicburger_counter += Integer.parseInt(foodData.get(counter+1));
            }
            if(foodData.get(counter).contentEquals("Su")){
                su_counter += Integer.parseInt(foodData.get(counter+1));
            }
            if(foodData.get(counter).contentEquals("Ayran")){
                ayran_counter += Integer.parseInt(foodData.get(counter+1));
            }
            if(foodData.get(counter).contentEquals("Fanta")){
                fanta_counter += Integer.parseInt(foodData.get(counter+1));
            }
            if(foodData.get(counter).contentEquals("Kola")){
                kola_counter += Integer.parseInt(foodData.get(counter+1));
            }
            if(foodData.get(counter).contentEquals("Sprite")){
                sprite_counter += Integer.parseInt(foodData.get(counter+1));
            }
            if(foodData.get(counter).contentEquals("Icetea")){
                icetea_counter += Integer.parseInt(foodData.get(counter+1));
            }
            counter++;
        }

        barChart = findViewById(R.id.bargraph);
        barChart.setDrawBarShadow(false);
        barChart.setDrawValueAboveBar(true);
        barChart.setMaxVisibleValueCount(100);
        barChart.setPinchZoom(false);
        barChart.setDrawGridBackground(true);



        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(1, bbqburger_counter));
        barEntries.add(new BarEntry(2, mushroomburger_counter));
        barEntries.add(new BarEntry(3, doublecheeseburger_counter));
        barEntries.add(new BarEntry(4, cheeseburger_counter));
        barEntries.add(new BarEntry(5, chickenburger_counter));
        barEntries.add(new BarEntry(6, classicburger_counter));
        barEntries.add(new BarEntry(7, su_counter));
        barEntries.add(new BarEntry(8, ayran_counter));
        barEntries.add(new BarEntry(9, fanta_counter));
        barEntries.add(new BarEntry(10, kola_counter));
        barEntries.add(new BarEntry(11, sprite_counter));
        barEntries.add(new BarEntry(12, icetea_counter));

        BarDataSet barDataSet = new BarDataSet(barEntries, "Food Name");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

//        List<String> labels = new ArrayList<String>();
       // labels.add("BBQ Burger");
       // labels.add("Mushroom Burger");


        BarData data = new BarData(barDataSet);
        data.setBarWidth(0.5f);
        barChart.setData(data);
        barChart.setFitBars(true);


        XAxis xAxis = barChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setAxisMinimum(0);


        YAxis yAxis = barChart.getAxisLeft();
        yAxis.setAxisMinimum(0);
        barChart.getAxisRight().setEnabled(false);



/*
        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);*/


    }



}
