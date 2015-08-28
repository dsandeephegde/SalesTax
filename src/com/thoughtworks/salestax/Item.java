package com.thoughtworks.salestax;

//Item calculates sales tax and price inclusive of tax
public class Item {

    private int number;
    private String name;
    private double amount;
    private boolean isImported;
    private double tax;

    public Item(int number, String name, double amount, boolean isImported) {
        this.number = number;
        this.name = name;
        this.amount = amount;
        this.isImported = isImported;
    }

    public double salesTax() {
        double percent = 0.0;
        if(!(name.contains("book") || name.contains("chocolate") || name.contains("pills"))) {
            percent = 0.1;
            tax = amount * percent;
        }
        if(isImported) {
            percent += 0.05;
            tax = amount * percent;
        }
        return tax;
    }

    public double price() {
        return amount + salesTax();
    }
}
