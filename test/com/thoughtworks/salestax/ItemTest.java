package com.thoughtworks.salestax;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldBeZeroWhenAmountIsZero() {
        Item item = new Item(1, "Music CD", 0.0, false);
        assertEquals(0.0, item.salesTax(), 0.0);
    }

    @Test
    public void shouldBeTenPercentTaxOnAllGoods() {
        Item item = new Item(1, "Music CD", 10, false);
        assertEquals(1.0, item.salesTax(), 0.0);
    }

    @Test
    public void shouldBeZeroTaxForBooks() {
        Item item = new Item(1, "book", 10, false);
        assertEquals(0.0, item.salesTax(), 0.0);
    }
}