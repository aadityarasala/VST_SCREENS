package com.example.vst_screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import com.example.vst_screens.inventory.data;

public class medicine_details_page extends AppCompatActivity {

    private Spinner spinner_MEDICINE;

    //importing data from new java file
    //private MedicineAdapter adapter;
    //importing data local
    private static final String[] medicine = new String[]{
        "Cyclobenzaprine","Hydrochlorothiazide","Pantoprazole"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_details_page);

//        spinner_MEDICINE = findViewById(R.id.spinner_MEDICINE);
//        spinner_MEDICINE.setAdapter(adapter);

        //importing data from new java file
        //adapter = new MedicineAdapter(medicine_details_page.this, data.getmedicinelist());


        AutoCompleteTextView editText  = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,medicine);
        editText.setAdapter(adapter);


    }
}