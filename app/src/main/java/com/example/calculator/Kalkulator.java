package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class Kalkulator extends AppCompatActivity {

    EditText editTextNum1;
    EditText editTextNum2;
    Button plusButton;
    Button minusButton;
    Button multipleButton;
    Button divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        editTextNum1 = findViewById(R.id.editTextNumber1);
        editTextNum2 = findViewById(R.id.editTextNumber2);
        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);
        multipleButton = findViewById(R.id.multipleButton);
        divideButton = findViewById(R.id.divideButton);





        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNum1 = editTextNum1.getText().toString();
                String textNum2 = editTextNum2.getText().toString();


                if(textNum1.isEmpty() || textNum2.isEmpty()) {
                    Toast.makeText(Kalkulator.this, "Please enter the number", Toast.LENGTH_SHORT).show();
                }else {
                    int num1 = Integer.parseInt(textNum1);
                    int num2 = Integer.parseInt(textNum2);

                    int result = num1 + num2;

                    String textResult = String.valueOf(result);

                    Toast.makeText(Kalkulator.this, "Result : " + textResult, Toast.LENGTH_SHORT).show();
                }


            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNum1 = editTextNum1.getText().toString();
                String textNum2 = editTextNum2.getText().toString();


                if(textNum1.isEmpty() || textNum2.isEmpty()) {
                    Toast.makeText(Kalkulator.this, "Please enter the number", Toast.LENGTH_SHORT).show();
                }else {
                    int num1 = Integer.parseInt(textNum1);
                    int num2 = Integer.parseInt(textNum2);

                    int result = num1 - num2;

                    String textResult = String.valueOf(result);

                    Toast.makeText(Kalkulator.this, "Result : " + textResult, Toast.LENGTH_SHORT).show();
                }

            }
        });

        multipleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNum1 = editTextNum1.getText().toString();
                String textNum2 = editTextNum2.getText().toString();

                if(textNum1.isEmpty() || textNum2.isEmpty()) {
                    Toast.makeText(Kalkulator.this, "Please enter the number", Toast.LENGTH_SHORT).show();
                }else {
                    int num1 = Integer.parseInt(textNum1);
                    int num2 = Integer.parseInt(textNum2);

                    int result = num1 * num2;

                    String textResult = String.valueOf(result);

                    Toast.makeText(Kalkulator.this, "Result : " + textResult, Toast.LENGTH_SHORT).show();
                }
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNum1 = editTextNum1.getText().toString();
                String textNum2 = editTextNum2.getText().toString();

                if(textNum1.isEmpty() || textNum2.isEmpty()) {
                    Toast.makeText(Kalkulator.this, "Please enter the number", Toast.LENGTH_SHORT).show();
                }else {
                    double num1 = Double.parseDouble(textNum1);
                    double num2 = Double.parseDouble(textNum2);

                    double result = num1 / num2;




                    Toast.makeText(Kalkulator.this, "Result : " + new DecimalFormat("##.##").format(result), Toast.LENGTH_SHORT).show();
                }
            }
        });



    }


}