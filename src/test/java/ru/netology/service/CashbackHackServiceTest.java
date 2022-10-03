package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateTheAmount() {
        int amount = 3300;
        int actual = service.remain(amount);
        int expected = 700;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateTheAmount() {
        int amount = 991;
        int actual = service.remain(amount);
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateTheAmount() {
        int amount = 3000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateTheAmount() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}