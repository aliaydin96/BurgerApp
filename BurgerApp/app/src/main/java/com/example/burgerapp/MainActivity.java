package com.example.burgerapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper mDatabaseHelper;
    Button girisyap_button, uyeol_button;
    EditText username_et, password_et;
    ImageView burgerimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDatabaseHelper = new DatabaseHelper(this);

        girisyap_button = findViewById(R.id.girisyap);
        uyeol_button = findViewById(R.id.uyeol);
        username_et = findViewById(R.id.username);
        password_et = findViewById(R.id.password);
        burgerimg = findViewById(R.id.burgerimg);
        burgerimg.setImageResource(R.mipmap.ham);

        final List<String> username = mDatabaseHelper.getUsername();
        final List<String> password = mDatabaseHelper.getPassword();
        girisyap_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUserName = username_et.getText().toString();
                String inputPassword = password_et.getText().toString();
                int counter = 0;
                boolean correction = false;
                while ( username.size()> counter){
                    if ((inputUserName.contentEquals(username.get(counter))) & (inputPassword.contentEquals(password.get(counter)))) {
                        correction = true;

                    }
                    counter++;
                }
                if(correction == true){
                    Toast.makeText(getApplicationContext(), "Kullanici adi ve sifre Dogru", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), siparisekrani.class);
                    startActivity(intent);
                }
                else if((inputUserName.contentEquals("admin")) & (inputPassword.contentEquals("123"))){
                    Intent intent = new Intent(getApplicationContext(), yoneticiekrani.class);
                    startActivity(intent);
                }

                else {
                    Toast.makeText(getApplicationContext(), "Kullanici adi veya sifre yanlis", Toast.LENGTH_SHORT).show();

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
