package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void enterIntegerValue() {
        final CashbackHackService cashback = new CashbackHackService();
        int amount = 5700;
        int actual = cashback.remain(amount);
        int expected = 300;
        assertEquals(actual,expected);
    }

    @Test
    public void enterNullValue() {
        final CashbackHackService cashback = new CashbackHackService();
        int amount = 0;
        int actual = cashback.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @Test
    public void enterRoundValue() {
        final CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    public void enterNegativeValue() {
        final CashbackHackService cashback = new CashbackHackService();
        int amount = -50000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }
}
