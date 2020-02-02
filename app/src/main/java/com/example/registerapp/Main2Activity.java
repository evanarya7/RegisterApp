package com.example.registerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView usernameBlock;
    private TextView passwordBlock;
    private TextView countryBlock;
    private TextView phoneBlock;
    private TextView sexBlock;
    private String data_username;
    private String data_password;
    private String data_country;
    private String data_phone;
    private String data_sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        data_username = intent.getStringExtra(MainActivity.USERNAME);
        data_password = intent.getStringExtra(MainActivity.PASSWORD);
        data_country = intent.getStringExtra(MainActivity.COUNTRY);
        data_phone = intent.getStringExtra(MainActivity.PHONE);
        data_sex = intent.getStringExtra(MainActivity.SEX);

        usernameBlock = findViewById(R.id.form_username);
        passwordBlock = findViewById(R.id.form_password);
        countryBlock = findViewById(R.id.form_country);
        phoneBlock = findViewById(R.id.form_phone);
        sexBlock = findViewById(R.id.form_sex);

        usernameBlock.setText(data_username);
        passwordBlock.setText(data_password);
        countryBlock.setText(data_country);
        phoneBlock.setText(data_phone);
        sexBlock.setText(data_sex);

    }
}
