package com.example.burgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Grafikekrani extends AppCompatActivity {
    BarChart barChart;
    FoodDatabaseHelper foodDatabaseHelper;
    Spinner gun_spinner, ay_spinner, yil_spinner, grafikaraligi_spinner;
    Button grafikcizdir_button, listele_button;
    int bbqburger_counter = 0;
    int mushroomburger_counter = 0;
    int doublecheeseburger_counter = 0;
    int cheeseburger_counter = 0;
    int chickenburger_counter = 0;
    int classicburger_counter = 0;
    int elmadilim_counter = 0;
    int tirtiklipatates_counter = 0;
    int nugget_counter = 0;
    int soganhalkasi_counter = 0;
    int su_counter = 0;
    int ayran_counter = 0;
    int fanta_counter = 0;
    int kola_counter = 0;
    int sprite_counter = 0;
    int icetea_counter = 0;
    BarDataSet barDataSet;
    BarData data;
    ArrayList<BarEntry> barEntries = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafikekrani);
        foodDatabaseHelper = new FoodDatabaseHelper(this);
        gun_spinner = findViewById(R.id.gun_spinner);
        ay_spinner = findViewById(R.id.ay_spinner);
        yil_spinner = findViewById(R.id.yil_spinner);
        grafikaraligi_spinner = findViewById(R.id.grafikaraligi_spinner);
        grafikcizdir_button = findViewById(R.id.grafikcizdir_button);
        listele_button = findViewById(R.id.grafikekranilistelebutonu);

        listele_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), grafiklisteekrani.class);
                startActivity(intent);
            }
        });

        String date = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        String date_year = date.split("-")[0];
        String date_month = date.split("-")[1];
        String date_day = date.split("-")[2];
        gun_spinner.setSelection(Integer.parseInt(date_day) - 1);
        ay_spinner.setSelection(Integer.parseInt(date_month) - 1);
        yil_spinner.setSelection(Integer.parseInt(date_year) - 2020);
        final List<String> foodData = foodDatabaseHelper.getFoodData();
        barChart = findViewById(R.id.bargraph);
        barChart.setDrawBarShadow(false);
        barChart.setDrawValueAboveBar(true);
        barChart.setMaxVisibleValueCount(100);
        barChart.setPinchZoom(false);
        barChart.setDrawGridBackground(true);

        barEntries.add(new BarEntry(1, bbqburger_counter));
        barEntries.add(new BarEntry(2, mushroomburger_counter));
        barEntries.add(new BarEntry(3, doublecheeseburger_counter));
        barEntries.add(new BarEntry(4, cheeseburger_counter));
        barEntries.add(new BarEntry(5, chickenburger_counter));
        barEntries.add(new BarEntry(6, classicburger_counter));
        barEntries.add(new BarEntry(7, elmadilim_counter));
        barEntries.add(new BarEntry(8, tirtiklipatates_counter));
        barEntries.add(new BarEntry(9, nugget_counter));
        barEntries.add(new BarEntry(10, soganhalkasi_counter));
        barEntries.add(new BarEntry(11, su_counter));
        barEntries.add(new BarEntry(12, ayran_counter));
        barEntries.add(new BarEntry(13, fanta_counter));
        barEntries.add(new BarEntry(14, kola_counter));
        barEntries.add(new BarEntry(15, sprite_counter));
        barEntries.add(new BarEntry(16, icetea_counter));

        barDataSet = new BarDataSet(barEntries, "Food Name");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        data = new BarData(barDataSet);
        data.setBarWidth(0.5f);
        barChart.setData(data);
        barChart.setFitBars(false);

        XAxis xAxis = barChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setAxisMinimum(0);
        final YAxis yAxis = barChart.getAxisLeft();
        yAxis.setAxisMinimum(0);
        barChart.getAxisRight().setEnabled(false);

        grafikcizdir_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = 0;
                int counter = 0;
                int foodDate_day = 0;
                int foodDate_month = 0;
                int foodDate_year = 0;
                int position = 0;
                int gun = Integer.parseInt(gun_spinner.getSelectedItem().toString());
                int ay = Integer.parseInt(ay_spinner.getSelectedItem().toString());
                int yil = Integer.parseInt(yil_spinner.getSelectedItem().toString());
                String position_str = grafikaraligi_spinner.getSelectedItem().toString();
                while(foodData.size() > counter){
                    if(counter %4 == 3) {
                        if(position_str.contentEquals("Gunluk")) {
                            foodDate_year = Integer.parseInt(foodData.get(counter).split("-")[0]);
                            foodDate_month = Integer.parseInt(foodData.get(counter).split("-")[1]);
                            foodDate_day = Integer.parseInt(foodData.get(counter).split("-")[2]);
                            position = 1;
                        }
                        if(position_str.contentEquals("Haftalik")) {
                            foodDate_year = Integer.parseInt(foodData.get(counter).split("-")[0]);
                            foodDate_month = Integer.parseInt(foodData.get(counter).split("-")[1]);
                            foodDate_day = Integer.parseInt(foodData.get(counter).split("-")[2]);
                            position = 7;
                        }
                        if(position_str.contentEquals("Aylik")) {
                            foodDate_year = Integer.parseInt(foodData.get(counter).split("-")[0]);
                            foodDate_month = Integer.parseInt(foodData.get(counter).split("-")[1]);
                            foodDate_day = 0;
                            gun = 0;
                            position = 1;
                        }
                        if(position_str.contentEquals("Yillik")) {
                            foodDate_year = Integer.parseInt(foodData.get(counter).split("-")[0]);
                            foodDate_day = 0;
                            gun = 0;
                            position = 1;
                            ay = 0;
                            foodDate_month = 0;
                        }
                        for (i = 0; i < position; i++) {
                            if (((gun - i) == foodDate_day) & (ay == foodDate_month) & (yil == foodDate_year)) {
                                if (foodData.get(counter - 2).contentEquals("BBQ Burger")) {
                                    bbqburger_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Mushroom Burger")) {
                                    mushroomburger_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Double Cheese Burger")) {
                                    doublecheeseburger_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Cheese Burger")) {
                                    cheeseburger_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Chicken Burger")) {
                                    chickenburger_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Classic Burger")) {
                                    classicburger_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Elma Dilim Patates")) {
                                    elmadilim_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Tırtıklı Patates")) {
                                    tirtiklipatates_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Nugget")) {
                                    nugget_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Soğan Halkası")) {
                                    soganhalkasi_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Su")) {
                                    su_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Ayran")) {
                                    ayran_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Fanta")) {
                                    fanta_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Kola")) {
                                    kola_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Sprite")) {
                                    sprite_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                                if (foodData.get(counter - 2).contentEquals("Icetea")) {
                                    icetea_counter += Integer.parseInt(foodData.get(counter - 1));
                                }
                            }
                        }
                        foodDate_day = 0;
                        foodDate_month = 0;
                        foodDate_year = 0;
                    }

                    counter++;
                }
                data.notifyDataChanged();
                barChart.notifyDataSetChanged();
                barChart.invalidate();
                barEntries.removeAll(barEntries);
                barEntries.add(new BarEntry(1, bbqburger_counter));
                barEntries.add(new BarEntry(2, mushroomburger_counter));
                barEntries.add(new BarEntry(3, doublecheeseburger_counter));
                barEntries.add(new BarEntry(4, cheeseburger_counter));
                barEntries.add(new BarEntry(5, chickenburger_counter));
                barEntries.add(new BarEntry(6, classicburger_counter));
                barEntries.add(new BarEntry(7, elmadilim_counter));
                barEntries.add(new BarEntry(8, tirtiklipatates_counter));
                barEntries.add(new BarEntry(9, nugget_counter));
                barEntries.add(new BarEntry(10, soganhalkasi_counter));
                barEntries.add(new BarEntry(11, su_counter));
                barEntries.add(new BarEntry(12, ayran_counter));
                barEntries.add(new BarEntry(13, fanta_counter));
                barEntries.add(new BarEntry(14, kola_counter));
                barEntries.add(new BarEntry(15, sprite_counter));
                barEntries.add(new BarEntry(16, icetea_counter));


                data.setBarWidth(0.5f);
                barChart.setData(data);
                barChart.setFitBars(true);

                yAxis.setAxisMaximum(20);

                bbqburger_counter = 0;
                mushroomburger_counter = 0;
                doublecheeseburger_counter = 0;
                cheeseburger_counter = 0;
                chickenburger_counter = 0;
                classicburger_counter = 0;
                elmadilim_counter = 0;
                tirtiklipatates_counter = 0;
                nugget_counter = 0;
                soganhalkasi_counter = 0;
                su_counter = 0;
                ayran_counter = 0;
                fanta_counter = 0;
                kola_counter = 0;
                sprite_counter = 0;
                icetea_counter = 0;
            }
        });






/*


        ArrayList labels = new ArrayList();
        labels.add("BBQ Burger");
        labels.add("Mushroom Burger");
        labels.add("Double Cheese Burger");
        labels.add("Cheese Burger");
        labels.add("Chicken Burger");
        labels.add("Classic Burger");
        labels.add("Su");
        labels.add("Ayran");
        labels.add("Fanta");
        labels.add("Kola");
        labels.add("Sprite");
        labels.add("Icetea");


        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);*/


    }

}
