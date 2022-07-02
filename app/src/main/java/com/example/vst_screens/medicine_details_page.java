package com.example.vst_screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class medicine_details_page extends AppCompatActivity {

    private Spinner spinner_MEDICINE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_details_page);

        spinner_MEDICINE = findViewById(R.id.spinner_MEDICINE);
    }
}