package com.example.burgerapp;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ImageView;
public class uyeol extends Activity {
    Button save_button, cancel_button;
    EditText username_et, password_et, password_et_2;
    DatabaseHelper mDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uye_ol);
        mDatabaseHelper = new DatabaseHelper(this);

        save_button = findViewById(R.id.save_button_uyeol);
        cancel_button = findViewById(R.id.cancel_button_uyeol);
        username_et = findViewById(R.id.username_uyeol);
        password_et = findViewById(R.id.password_uyeol);
        password_et_2 = findViewById(R.id.password_uyeol_2);

        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_password = password_et.getText().toString();
                String text_2_password = password_et_2.getText().toString();
                if(text_password.contentEquals(text_2_password)){
                    Toast.makeText(getApplicationContext(), "Kullanici kayit edilmistir.", Toast.LENGTH_SHORT).show();
                    AddData(username_et.getText().toString(),text_password);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Sifreler ayni degil!!!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        cancel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }

    public void AddData(String username, String password) {
        boolean insertData = mDatabaseHelper.addData(username, password);

        if (insertData) {
            toastMessage("Data Successfully Inserted!");
        } else {
            toastMessage("Something went wrong");
        }
    }
    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}
