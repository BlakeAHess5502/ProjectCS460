package com.example.registrationform;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button buttonAction;
    EditText emailField, passField, passConfirm;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        buttonAction = findViewById(R.id.submitButton);
        emailField = findViewById(R.id.emailEntry);
        passField = findViewById(R.id.inputPass);
        passConfirm = findViewById(R.id.confirmPass);

        buttonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailField.getText().toString();
                String pass = passField.getText().toString();
                String confirm = passConfirm.getText().toString();
                Intent intent = new Intent(MainActivity.this, submitAction.class);

                intent.putExtra("email", email);
                intent.putExtra("pass", pass);
                intent.putExtra("confirm", confirm);

                startActivity(intent);
            }
        });
    }
}