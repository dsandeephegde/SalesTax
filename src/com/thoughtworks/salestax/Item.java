package com.thoughtworks.salestax;

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
        if(!name.equals("book"))
        tax = amount * 0.1;
        return tax;
    }
}
