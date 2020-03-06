package com.example.takehomeassignment06_jiaqiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    EditText amountEdittext;
    EditText taxPercentageEditText;
    EditText tipPercentageEditText;
    Button submitButton;
    double amount;
    double taxPercentage;
    double tipPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountEdittext = findViewById(R.id.amount);
        taxPercentageEditText = findViewById(R.id.tax_percentage);
        tipPercentageEditText = findViewById(R.id.tip_percentage);
        submitButton = findViewById(R.id.submit_button);

    }

    public void launchActivity(View view) {
        Intent intent = new Intent(MainActivity.this, ReceiptActivity.class);

        amount = Double.parseDouble(amountEdittext.getText().toString());
        taxPercentage = Double.parseDouble(taxPercentageEditText.getText().toString());
        tipPercentage = Double.parseDouble(tipPercentageEditText.getText().toString());
        Receipt receipt = new Receipt(amount, taxPercentage, tipPercentage);

        intent.putExtra(Keys.KEY, receipt);

        startActivity(intent);
    }
}
