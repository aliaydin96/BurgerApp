package com.example.burgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



/*


Diger urunler icinde ayni sekilde eklenecektir.


*/
public class siparisekrani extends AppCompatActivity {
    Button siparisver_buton;
    Button bbqburger_ekle, bbqburger_cikar, mushroombur_ekle, mushroombur_cikar, doublecheeseburger_ekle, doublecheeseburger_cikar;
    EditText bbqburger_number, mushroombur_number, doublecheeseburger_number;
    int bbqburger_counter = 0;
    int mushroombur_counter = 0;
    int doublecheeseburger_counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siparisekrani);

        siparisver_buton = findViewById(R.id.siparisver_button);
        bbqburger_ekle = findViewById(R.id.bbqburger_ekle);
        bbqburger_cikar = findViewById(R.id.bbqburger_cikar);
        bbqburger_number = findViewById(R.id.bbqburger_number);
        mushroombur_ekle = findViewById(R.id.mushroomburger_ekle);
        mushroombur_cikar = findViewById(R.id.mushroomburger_cikar);
        mushroombur_number = findViewById(R.id.mushroomburger_number);
        doublecheeseburger_ekle = findViewById(R.id.doubleclassicburger_ekle);
        doublecheeseburger_cikar = findViewById(R.id.doubleclassicburger_cikar);
        doublecheeseburger_number = findViewById(R.id.doubleclassicburger_number);

        siparisver_buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), siparisekraniliste.class);
                intent.putExtra("bbqburger", bbqburger_counter);
                intent.putExtra("mushroomburger", mushroombur_counter);
                startActivity(intent);
            }
        });

        bbqburger_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bbqburger_counter += 1;
                String bbqburger_counter_string = Integer.toString(bbqburger_counter);
                bbqburger_number.setText(bbqburger_counter_string);
            }
        });
        bbqburger_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bbqburger_counter > 0) {
                    bbqburger_counter -= 1;
                    String bbqburger_counter_string = Integer.toString(bbqburger_counter);
                    bbqburger_number.setText(bbqburger_counter_string);
                }

            }
        });
        mushroombur_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mushroombur_counter += 1;
                String mushroombur_counter_string = Integer.toString(mushroombur_counter);
                mushroombur_number.setText(mushroombur_counter_string);
            }
        });
        mushroombur_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mushroombur_counter > 0) {
                    mushroombur_counter -= 1;
                    String mushroombur_counter_string = Integer.toString(mushroombur_counter);
                    mushroombur_number.setText(mushroombur_counter_string);
                }
            }
        });

        doublecheeseburger_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doublecheeseburger_counter += 1;
                String doublecheeseburger_counter_string = Integer.toString(doublecheeseburger_counter);
                doublecheeseburger_number.setText(doublecheeseburger_counter_string);
            }
        });
        doublecheeseburger_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(doublecheeseburger_counter > 0) {
                    doublecheeseburger_counter -= 1;
                    String doublecheeseburger_counter_string = Integer.toString(doublecheeseburger_counter);
                    doublecheeseburger_number.setText(doublecheeseburger_counter_string);
                }
            }
        });
    }
}
