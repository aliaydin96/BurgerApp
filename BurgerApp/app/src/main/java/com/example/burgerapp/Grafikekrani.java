package com.example.burgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
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
        int bbqburger_number = 0;
        int mushroomburger_number = 0;
        while(foodData.size() > counter){
            if(foodData.get(counter) == "BBQ Burger"){
                bbqburger_number += Integer.parseInt(foodData.get(counter+1));
            }
            if(foodData.get(counter) == "Mushroom Burger"){
                mushroomburger_number += Integer.parseInt(foodData.get(counter+1));
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
        barEntries.add(new BarEntry(1,40f));
        barEntries.add(new BarEntry(2,44f));
        barEntries.add(new BarEntry(3,30f));
        barEntries.add(new BarEntry(4,36f));
        BarDataSet barDataSet = new BarDataSet(barEntries, "Dates");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);


        BarData data = new BarData(barDataSet);
        data.setBarWidth(1);
        barChart.setData(data);

        String[] months = new String[]{"Jan", "Feb", "Mar", "April"};
        XAxis xAxis = barChart.getXAxis();
        xAxis.setValueFormatter(new MyXAxisValueFormatter(months));
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
/*
        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);*/


    }

    public class MyXAxisValueFormatter extends ValueFormatter implements IAxisValueFormatter{
        private String[] mValues;
        public MyXAxisValueFormatter(String[] values){
            this.mValues = values;
        }

        @Override
        public String getFormattedValue(float value, AxisBase axis) {
            return mValues[(int)value];
        }
    }


}
