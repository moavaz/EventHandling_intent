package com.example.moavaz.eventhandling_intent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.moavaz.eventhandling_intent.R;

import static com.example.moavaz.eventhandling_intent.R.id.btn;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Toast.makeText(getApplicationContext(), "Welcome to second Activity", Toast.LENGTH_SHORT).show();
    }
}