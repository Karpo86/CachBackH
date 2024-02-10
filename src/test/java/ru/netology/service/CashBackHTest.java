package ru.netology.service;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashBackHTest {
    CashBackH service = new CashBackH();

    @Test
    public void shouldCalculateIfAmountCorrect() {
        int amount = 5700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateIfAmountInCorrect() {
        int amount = 5000;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateIfAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }
}