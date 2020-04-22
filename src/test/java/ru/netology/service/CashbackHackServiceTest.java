package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void enterIntegerValue() {
        final CashbackHackService cashback = new CashbackHackService();
        int amount = 5700;
        int actual = cashback.remain(amount);
        int expected = 300;
        assertEquals(expected, actual);
    }

    @Test
    public void enterNullValue() {
        final CashbackHackService cashback = new CashbackHackService();
        int amount = 0;
        int actual = cashback.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void enterRoundValue() {
        final CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void enterNegativeValue() {
        final CashbackHackService cashback = new CashbackHackService();
        int amount = -50000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}

