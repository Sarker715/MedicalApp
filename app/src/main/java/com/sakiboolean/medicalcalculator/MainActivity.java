package com.sakiboolean.medicalcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double convertionRate = 2.2;
    double weightEntered;
    double converterWeight;

    EditText editText;
    RadioGroup radioGroup;
    RadioButton radioButton1;
    RadioButton radioButton2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.Weight);
        radioGroup = findViewById(R.id.RadioGroup);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        textView = findViewById(R.id.Result);
    }

    public void onRadioButtonClick(View view) {

        weightEntered = Double.parseDouble(editText.getText().toString());
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        if (radioButton1.isChecked()) {
            if (weightEntered <= 500) {
                converterWeight = weightEntered / convertionRate;
                textView.setText(decimalFormat.format(converterWeight) + "Kilogram");
            } else {
                Toast.makeText(MainActivity.this, "pounds must be less than 500", Toast.LENGTH_SHORT).show();
            }
        }

        if (radioButton2.isChecked()) {
            if (weightEntered <= 500) {
                converterWeight = weightEntered * convertionRate;
                textView.setText(decimalFormat.format(converterWeight) + "Kilogram");
            } else {
                Toast.makeText(MainActivity.this, "Kilogram must be less than 225", Toast.LENGTH_SHORT).show();
            }
        }
    }


}
