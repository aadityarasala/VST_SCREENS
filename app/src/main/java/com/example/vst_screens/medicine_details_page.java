package com.example.vst_screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class medicine_details_page extends AppCompatActivity {

    private Spinner spinner_MEDICINE;

    //importing data from new java file
    //private MedicineAdapter adapter;
    //importing data local
    private static final String[] medicine = new String[]{
        "Cyclobenzaprine","Hydrochlorothiazide","Pantoprazole"};
    private static final String[] duration = new String[]{
            "Daily","Weekly","Monthly"};

    //counter
    EditText showvalue1;
    int counter1=0;
    EditText showvalue2;
    int counter2=0;
    EditText showvalue3;
    int counter3=0;
    EditText showvalue4;
    int counter4=0;

    //listview
    ArrayList<String> list;

//    String tutorials[]
//            = { "Algorithms", "Data Structures",
//            "Languages", "Interview Corner",
//            "GATE", "ISRO CS",
//            "UGC NET CS", "CS Subjects",
//            "Web Technologies" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_details_page);

//        spinner_MEDICINE = findViewById(R.id.spinner_MEDICINE);
//        spinner_MEDICINE.setAdapter(adapter);

        //importing data from new java file
        //adapter = new MedicineAdapter(medicine_details_page.this, data.getmedicinelist());


        AutoCompleteTextView editText1  = findViewById(R.id.actv_medicine);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,medicine);
        editText1.setAdapter(adapter1);

        AutoCompleteTextView editText2  = findViewById(R.id.actv_duration);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,duration);
        editText2.setAdapter(adapter2);

        //counter
        showvalue1 = (EditText) findViewById(R.id.counter1);
        showvalue2 = (EditText) findViewById(R.id.counter2);
        showvalue3 = (EditText) findViewById(R.id.counter3);
        showvalue4 = (EditText) findViewById(R.id.counter4);

        //list

        ListView listview = findViewById(R.id.listview);
        Button btn = findViewById(R.id.Add);
        AutoCompleteTextView actv_medicine = findViewById(R.id.actv_medicine);
        AutoCompleteTextView actv_duration = findViewById(R.id.actv_duration);

        list = new ArrayList<String>();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,list);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names = actv_medicine.getText().toString();
                list.add(names);
                listview.setAdapter (arrayAdapter);
                arrayAdapter.notifyDataSetChanged();

            }
        });
        //l = findViewById(R.id.list);
//        ArrayAdapter<String> arr;
//        arr
//                = new ArrayAdapter<String>(
//                this,
//                R.layout.support_simple_spinner_dropdown_item, tutorials);
//        l.setAdapter(arr);
    }

    public void countSub1(View view){
        counter1--;
        showvalue1.setText(Integer.toString(counter1));
    }
    public void countAdd1(View view){
        counter1++;
        showvalue1.setText(Integer.toString(counter1));
    }
    public void countSub2(View view){
        counter2--;
        showvalue2.setText(Integer.toString(counter2));
    }
    public void countAdd2(View view){
        counter2++;
        showvalue2.setText(Integer.toString(counter2));
    }
    public void countSub3(View view){
        counter3--;
        showvalue3.setText(Integer.toString(counter3));
    }
    public void countAdd3(View view){
        counter3++;
        showvalue3.setText(Integer.toString(counter3));
    }
    public void countSub4(View view){
        counter4--;
        showvalue4.setText(Integer.toString(counter4));
    }
    public void countAdd4(View view){
        counter4++;
        showvalue4.setText(Integer.toString(counter4));
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.before:
                if (checked)
                    break;
            case R.id.after:
                if (checked)
                    break;
        }
    }
}