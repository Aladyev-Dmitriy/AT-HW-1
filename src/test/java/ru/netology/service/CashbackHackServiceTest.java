package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateTheAmount() {
        assertEquals( service.remain(3300), 700);
    }
    @Test
    public void shouldCalculateTheAmountIfZero() {
        assertEquals( service.remain(0), 1000);
    }
    @Test
    public void shouldCalculateTheAmountAndAdd9() {
        assertEquals( service.remain(991), 9);
    }

    @Test
    public void shouldCalculateTheAmountIf1000() {
        assertEquals( service.remain(1000), 0);
    }

}