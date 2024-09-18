package com.example.classworkfpt;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private final String userAccount = "admin";
    private final String passwordAccount = "123456";
    EditText username, password;
    TextView display;
    Button btnLogin;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Tim id tren layout
        username = findViewById(R.id.usernameTxt);
        password = findViewById(R.id.passwordText);
        btnLogin = findViewById(R.id.btnLogin);

        // Dung de hien thi ket qua login
        display = findViewById(R.id.displayResult);
        display.setVisibility(View.INVISIBLE);


        // Listener thay doi text
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                display.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                display.setVisibility(View.INVISIBLE);
            }

            @Override
            public void afterTextChanged(Editable s) {
                display.setVisibility(View.INVISIBLE);
            }
        });

        // Listener nhan nut login
        btnLogin.setOnClickListener(v -> {
            String a = username.getText().toString();
            String b = password.getText().toString();
            if (a.equalsIgnoreCase(userAccount) && b.equals(passwordAccount)) {
                display.setText("Login successfully");
            }
            display.setVisibility(View.VISIBLE);
        });
    }
}