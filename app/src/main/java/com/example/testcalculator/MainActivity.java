package com.example.testcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText suma1;
    EditText suma2;
    double ats;
    Button button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculateButton();
        spinner();
    }

    public void spinner() {
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }


    public void calculateButton() {
        suma1 = findViewById(R.id.suma1);
        suma2 = findViewById(R.id.suma2);
        button = findViewById(R.id.calculate);
        text = findViewById(R.id.calculatorText);
        suma2.getText();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sum1 = Double.parseDouble(suma1.getText().toString());
                double sum2 = Double.parseDouble(suma2.getText().toString());
                ats = sum1 + sum2;
                String atsText = new Double(ats).toString();

                text.setText(atsText);
            }
        });

    }
}