package com.example.takehomeassignment06_jiaqiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiptActivity extends AppCompatActivity {

    TextView receiptDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);
        //this.setTitle("Your Receipt");

        receiptDisplay = findViewById(R.id.receipt_display);
        Intent receivingIntent = getIntent();
        Receipt receipt = (Receipt) receivingIntent.getSerializableExtra(Keys.KEY);

        receiptDisplay.setText(receipt.toString());
    }
}
