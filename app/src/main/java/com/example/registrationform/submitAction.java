package com.example.registrationform;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class submitAction extends AppCompatActivity {
    TextView emailView, passView, confirmView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_submit_action);

        emailView=findViewById(R.id.emailView);
        passView=findViewById(R.id.passView);
        confirmView=findViewById(R.id.confirmView);

        //get data from intent

        String email=getIntent().getStringExtra("email");
        String pass=getIntent().getStringExtra("pass");
        String conPass=getIntent().getStringExtra("passCon");

        //set values to textView

        emailView.setText("Email:" + email);
        passView.setText("Password:" + pass);
        confirmView.setText("Confirm Password:" + conPass);
    }
}