package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.*;

//Tests the item class for behaviour, the salesTax() and price()
public class ItemTest {

    @Test
    public void shouldBeZeroWhenAmountIsZero() {
        Item item = new Item(1, "Music CD", 0.0, false);
        assertEquals(0.0, item.salesTax(), 0.001);
    }

    @Test
    public void shouldBeTenPercentTaxOnAllGoods() {
        Item item = new Item(1, "Music CD", 10, false);
        assertEquals(1.0, item.salesTax(), 0.001);
    }

    @Test
    public void shouldBeZeroTaxForBooks() {
        Item item = new Item(1, "book", 10, false);
        assertEquals(0.0, item.salesTax(), 0.001);
    }

    @Test
    public void shouldBeZeroTaxForFood() {
        Item item = new Item(1, "chocolate", 10, false);
        assertEquals(0.0, item.salesTax(), 0.001);
    }

    @Test
    public void shouldBeZeroTaxForMedicines() {
        Item item = new Item(1, "Headache pills", 10, false);
        assertEquals(0.0, item.salesTax(), 0.001);
    }

    @Test
    public void shouldBeFivePercentIfImported() {
        Item item = new Item(1, "book", 10, true);
        assertEquals(0.5, item.salesTax(), 0.001);
    }

    @Test
    public void shouldBeFifteenPercentTaxIfImportedAndNotBookFoodOrMedicine() {
        Item item = new Item(1, "Music CD", 10, true);
        assertEquals(1.5, item.salesTax(), 0.001);
    }

    @Test
    public void priceInclusiveOfTaxShouldBeCorrect() {
        Item item = new Item(1, "Music CD", 10, true);
        assertEquals(11.5, item.price(), 0.001);
    }
}