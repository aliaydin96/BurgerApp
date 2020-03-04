package com.example.burgerapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button girisyap_button, uyeol_button;
    EditText username_et, password_et;
    ImageView burgerimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        girisyap_button = findViewById(R.id.girisyap);
        uyeol_button = findViewById(R.id.uyeol);
        username_et = findViewById(R.id.username);
        password_et = findViewById(R.id.password);
        burgerimg = findViewById(R.id.burgerimg);
        burgerimg.setImageResource(R.mipmap.ham);


        girisyap_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = username_et.getText().toString();
                String password = password_et.getText().toString();

                if ((text.contentEquals("ali")) & (password.contentEquals("123"))) {
                    Toast.makeText(getApplicationContext(), "Dogru", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), siparisekrani.class);
                    startActivity(intent);
                }
                else if((text.contentEquals("admin")) & (password.contentEquals("123"))){

                }

                else {
                    Toast.makeText(getApplicationContext(), "Yanlis", Toast.LENGTH_SHORT).show();

                }
            }
        });
        uyeol_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), uyeol.class);
                startActivity(intent);

            }
        });





    }





}
