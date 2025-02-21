package com.example.myexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText UsernameEditText, PasswordEditText;
    Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        LoginButton = findViewById(R.id.btnLogin);
        UsernameEditText = findViewById(R.id.btnUsername);
        PasswordEditText = findViewById(R.id.btnPassword);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = UsernameEditText.getText().toString().trim();
                String Password = PasswordEditText.getText().toString().trim();

                if (Username.isEmpty() || Password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Username dan password harus diisi", Toast.LENGTH_SHORT).show();
                } else {
                    if (Username.equals("Jelita") && Password.equals("jelita11")) {
                        Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(MainActivity.this, "Username atau Password salah", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });

    }
}