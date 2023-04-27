package netology.ru;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {
    CashbackHacker cashback = new CashbackHacker();


    @Test
    public void shouldCalculateIfAmountCorrect() {

        int amount = 1700;
        int actual = cashback.remain(amount);
        int expected = 300;

        assertEquals(actual, expected);

    }


    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        int actual = cashback.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);

    }


    @Test
    public void shouldCalculateIfAmount999() {
        int amount = 999;
        int actual = cashback.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmount1000() {
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }


}