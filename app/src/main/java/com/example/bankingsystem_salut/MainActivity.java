package com.example.bankingsystem_salut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText loanAmount;
    TextView interestRate;
    Button smallBank;
    Button bigBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loanAmount = findViewById(R.id.editTextNumberDecimal);
        interestRate = findViewById(R.id.interestResult);
        smallBank = findViewById(R.id.smallBank);
        bigBank = findViewById(R.id.bigBank);

        smallBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double loan = Double.parseDouble(loanAmount.getText().toString());
                SmallBank small = new SmallBank(loan);
                small.computeInterest();
                interestRate.setText(Double.toString(small.returnInterest()));

            }
        });

        bigBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double loan = Double.parseDouble(loanAmount.getText().toString());
                BigBank big = new BigBank(loan);
                big.computeInterest();
                interestRate.setText(Double.toString(big.returnInterest()));
            }
        });


    }
}