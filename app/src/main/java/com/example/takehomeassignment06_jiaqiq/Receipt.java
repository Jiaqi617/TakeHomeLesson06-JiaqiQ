package com.example.takehomeassignment06_jiaqiq;

import android.text.Editable;

import java.io.Serializable;

public class Receipt implements Serializable {
    double amount;
    double taxPercentage;
    double tipPercentage;
    double grandTotal;

    public Receipt(double amount, double taxPercentage, double tipPercentage) {
        this.amount = amount;
        this.taxPercentage = taxPercentage;
        this.tipPercentage = tipPercentage;
        this.grandTotal = amount * (1 + taxPercentage + tipPercentage);
    }

    public String toString() {
        return "Total: " + amount
                + "\nSales Tax: " + taxPercentage * 100
                + "\nTip: " + tipPercentage * 100
                + "\nGrand Total: " + grandTotal;
    }
}
