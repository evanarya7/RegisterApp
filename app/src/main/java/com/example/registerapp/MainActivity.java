package com.example.registerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText inp_username;
    private String username;
    private EditText inp_password;
    private String password;
    private EditText inp_country;
    private String country;
    private EditText inp_phone;
    private String phone;
    private String sex;
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String COUNTRY = "country";
    public static final String PHONE = "phone";
    public static final String SEX = "sex";

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.form_sex_male:
                if (checked)
                    sex = "Male";
                    break;
            case R.id.form_sex_female:
                if (checked)
                    sex = "Female";
                    break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button register = findViewById(R.id.button_submit);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp_username = findViewById(R.id.form_username);
                username = inp_username.getText().toString();
                inp_password = findViewById(R.id.form_password);
                password = inp_password.getText().toString();
                inp_country = findViewById(R.id.form_country);
                country = inp_country.getText().toString();
                inp_phone = findViewById(R.id.form_phone);
                phone = inp_phone.getText().toString();

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra(USERNAME, username);
                intent.putExtra(PASSWORD, password);
                intent.putExtra(COUNTRY, country);
                intent.putExtra(PHONE, phone);
                intent.putExtra(SEX, sex);
                startActivity(intent);
            }
        });
    }
}
