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
    Button bbqburger_ekle, bbqburger_cikar, mushroombur_ekle, mushroombur_cikar, doublecheeseburger_ekle, doublecheeseburger_cikar, cheeseburger_ekle, cheeseburger_cikar, chickenburger_ekle, chickenburger_cikar;
    Button classicburger_ekle, classicburger_cikar, su_ekle, su_cikar, ayran_ekle, ayran_cikar, kola_ekle, kola_cikar, fanta_ekle, fanta_cikar, icetea_ekle, icetea_cikar, sprite_ekle, sprite_cikar;
    Button soganhalkasi_ekle, soganhalkasi_cikar, elmadilim_ekle, elmadilim_cikar, tirtiklipatates_ekle, tirtiklipatates_cikar, nugget_ekle, nugget_cikar;
    EditText bbqburger_number, mushroombur_number, doublecheeseburger_number, cheeseburger_number, chickenburger_number, classicburger_number, su_number, ayran_number, kola_number, fanta_number, sprite_number, icetea_number;
    EditText elmadilim_number, tirtiklipatates_number, nugget_number, soganhalkasi_number;
    int bbqburger_counter = 0;
    int mushroombur_counter = 0;
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
    int kola_counter = 0;
    int fanta_counter = 0;
    int icetea_counter = 0;
    int sprite_counter = 0;
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
        doublecheeseburger_ekle = findViewById(R.id.doublecheeseburger_ekle);
        doublecheeseburger_cikar = findViewById(R.id.doublecheeseburger_cikar);
        doublecheeseburger_number = findViewById(R.id.doublecheeseburger_number);
        cheeseburger_ekle = findViewById(R.id.cheeseburger_ekle);
        cheeseburger_cikar = findViewById(R.id.cheeseburger_cikar);
        cheeseburger_number = findViewById(R.id.cheeseburger_number);
        chickenburger_ekle = findViewById(R.id.chickenburger_ekle);
        chickenburger_cikar = findViewById(R.id.chickenburger_cikar);
        chickenburger_number = findViewById(R.id.chickenburger_number);
        classicburger_ekle = findViewById(R.id.classicburger_ekle);
        classicburger_cikar = findViewById(R.id.classicburger_cikar);
        classicburger_number = findViewById(R.id.classicburger_number);
        elmadilim_ekle = findViewById(R.id.elmadilim_ekle);
        elmadilim_cikar = findViewById(R.id.elmadilim_cikar);
        elmadilim_number = findViewById(R.id.elmadilim_number);
        tirtiklipatates_ekle = findViewById(R.id.tirtiklipatates_ekle);
        tirtiklipatates_cikar = findViewById(R.id.tirtiklipatates_cikar);
        tirtiklipatates_number = findViewById(R.id.tirtiklipatates_number);
        nugget_ekle = findViewById(R.id.nugget_ekle);
        nugget_cikar = findViewById(R.id.nugget_cikar);
        nugget_number = findViewById(R.id.nugget_number);
        soganhalkasi_ekle = findViewById(R.id.soganhalkasi_ekle);
        soganhalkasi_cikar = findViewById(R.id.soganhalkasi_cikar);
        soganhalkasi_number = findViewById(R.id.soganhalkasi_number);
        su_ekle = findViewById(R.id.su_ekle);
        su_cikar = findViewById(R.id.su_cikar);
        su_number = findViewById(R.id.su_number);
        ayran_ekle = findViewById(R.id.ayran_ekle);
        ayran_cikar = findViewById(R.id.ayran_cikar);
        ayran_number = findViewById(R.id.ayran_number);
        kola_ekle = findViewById(R.id.kola_ekle);
        kola_cikar = findViewById(R.id.kola_cikar);
        kola_number = findViewById(R.id.kola_number);
        fanta_ekle = findViewById(R.id.fanta_ekle);
        fanta_cikar = findViewById(R.id.fanta_cikar);
        fanta_number = findViewById(R.id.fanta_number);
        icetea_ekle = findViewById(R.id.icetea_ekle);
        icetea_cikar = findViewById(R.id.icetea_cikar);
        icetea_number = findViewById(R.id.icetea_number);
        sprite_ekle = findViewById(R.id.sprite_ekle);
        sprite_cikar = findViewById(R.id.sprite_cikar);
        sprite_number = findViewById(R.id.sprite_number);

        siparisver_buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), siparisekraniliste.class);
                intent.putExtra("bbqburger", bbqburger_counter);
                intent.putExtra("mushroomburger", mushroombur_counter);
                intent.putExtra("doublecheeseburger", doublecheeseburger_counter);
                intent.putExtra("cheeseburger", cheeseburger_counter);
                intent.putExtra("chickenburger", chickenburger_counter);
                intent.putExtra("classicburger", classicburger_counter);
                intent.putExtra("elmadilim", elmadilim_counter);
                intent.putExtra("tirtiklipatates", tirtiklipatates_counter);
                intent.putExtra("nugget", nugget_counter);
                intent.putExtra("soganhalkasi", soganhalkasi_counter);
                intent.putExtra("su", su_counter);
                intent.putExtra("fanta", fanta_counter);
                intent.putExtra("kola", kola_counter);
                intent.putExtra("icetea", icetea_counter);
                intent.putExtra("ayran", ayran_counter);
                intent.putExtra("sprite", sprite_counter);

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
        cheeseburger_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cheeseburger_counter += 1;
                String cheeseburger_counter_string = Integer.toString(cheeseburger_counter);
                cheeseburger_number.setText(cheeseburger_counter_string);
            }
        });
        cheeseburger_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cheeseburger_counter > 0) {
                    cheeseburger_counter -= 1;
                    String cheeseburger_counter_string = Integer.toString(cheeseburger_counter);
                    cheeseburger_number.setText(cheeseburger_counter_string);
                }
            }
        });
        chickenburger_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chickenburger_counter += 1;
                String chickenburger_counter_string = Integer.toString(chickenburger_counter);
                chickenburger_number.setText(chickenburger_counter_string);
            }
        });
        chickenburger_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chickenburger_counter > 0) {
                    chickenburger_counter -= 1;
                    String chickenburger_counter_string = Integer.toString(chickenburger_counter);
                    chickenburger_number.setText(chickenburger_counter_string);
                }
            }
        });
        classicburger_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                classicburger_counter += 1;
                String classicburger_counter_string = Integer.toString(classicburger_counter);
                classicburger_number.setText(classicburger_counter_string);
            }
        });
        classicburger_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(classicburger_counter > 0) {
                    classicburger_counter -= 1;
                    String classicburger_counter_string = Integer.toString(classicburger_counter);
                    classicburger_number.setText(classicburger_counter_string);
                }
            }
        });
        elmadilim_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elmadilim_counter += 1;
                String elmadilim_counter_string = Integer.toString(elmadilim_counter);
                elmadilim_number.setText(elmadilim_counter_string);
            }
        });
        elmadilim_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(elmadilim_counter > 0) {
                    elmadilim_counter -= 1;
                    String elmadilim_counter_string = Integer.toString(elmadilim_counter);
                    elmadilim_number.setText(elmadilim_counter_string);
                }
            }
        });
        tirtiklipatates_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tirtiklipatates_counter += 1;
                String tirtiklipatates_counter_string = Integer.toString(tirtiklipatates_counter);
                tirtiklipatates_number.setText(tirtiklipatates_counter_string);
            }
        });
        tirtiklipatates_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tirtiklipatates_counter > 0) {
                    tirtiklipatates_counter -= 1;
                    String tirtiklipatates_counter_string = Integer.toString(tirtiklipatates_counter);
                    tirtiklipatates_number.setText(tirtiklipatates_counter_string);
                }
            }
        });
        nugget_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nugget_counter += 1;
                String nugget_counter_string = Integer.toString(nugget_counter);
                nugget_number.setText(nugget_counter_string);
            }
        });
        nugget_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nugget_counter > 0) {
                    nugget_counter -= 1;
                    String nugget_counter_string = Integer.toString(nugget_counter);
                    nugget_number.setText(nugget_counter_string);
                }
            }
        });
        soganhalkasi_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soganhalkasi_counter += 1;
                String soganhalkasi_counter_string = Integer.toString(soganhalkasi_counter);
                soganhalkasi_number.setText(soganhalkasi_counter_string);
            }
        });
        soganhalkasi_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(soganhalkasi_counter > 0) {
                    soganhalkasi_counter -= 1;
                    String soganhalkasi_counter_string = Integer.toString(soganhalkasi_counter);
                    soganhalkasi_number.setText(soganhalkasi_counter_string);
                }
            }
        });
        su_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                su_counter += 1;
                String su_counter_string = Integer.toString(su_counter);
                su_number.setText(su_counter_string);
            }
        });
        su_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(su_counter > 0) {
                    su_counter -= 1;
                    String su_counter_string = Integer.toString(su_counter);
                    su_number.setText(su_counter_string);
                }
            }
        });
        ayran_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ayran_counter += 1;
                String ayran_counter_string = Integer.toString(ayran_counter);
                ayran_number.setText(ayran_counter_string);
            }
        });
        ayran_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ayran_counter > 0) {
                    ayran_counter -= 1;
                    String ayran_counter_string = Integer.toString(ayran_counter);
                    ayran_number.setText(ayran_counter_string);
                }
            }
        });
        fanta_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fanta_counter += 1;
                String fanta_counter_string = Integer.toString(fanta_counter);
                fanta_number.setText(fanta_counter_string);
            }
        });
        fanta_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fanta_counter > 0) {
                    fanta_counter -= 1;
                    String fanta_counter_string = Integer.toString(fanta_counter);
                    fanta_number.setText(fanta_counter_string);
                }
            }
        });
        kola_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kola_counter += 1;
                String kola_counter_string = Integer.toString(kola_counter);
                kola_number.setText(kola_counter_string);
            }
        });
        kola_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kola_counter > 0) {
                    kola_counter -= 1;
                    String kola_counter_string = Integer.toString(kola_counter);
                    kola_number.setText(kola_counter_string);
                }
            }
        });
        sprite_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sprite_counter += 1;
                String sprite_counter_string = Integer.toString(sprite_counter);
                sprite_number.setText(sprite_counter_string);
            }
        });
        sprite_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sprite_counter > 0) {
                    sprite_counter -= 1;
                    String sprite_counter_string = Integer.toString(sprite_counter);
                    sprite_number.setText(sprite_counter_string);
                }
            }
        });
        icetea_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icetea_counter += 1;
                String icetea_counter_string = Integer.toString(icetea_counter);
                icetea_number.setText(icetea_counter_string);
            }
        });
        sprite_cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(icetea_counter > 0) {
                    icetea_counter -= 1;
                    String icetea_counter_string = Integer.toString(icetea_counter);
                    icetea_number.setText(icetea_counter_string);
                }
            }
        });
    }
}
