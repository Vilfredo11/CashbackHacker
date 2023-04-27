package netology.ru;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerTest {
    CashbackHacker cashback = new CashbackHacker();


    @Test
    public void shouldCalculateIfAmountCorrect() {

        int amount = 1700;
        int actual = cashback.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        int actual = cashback.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldCalculateIfAmount999() {
        int amount = 999;
        int actual = cashback.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfAmount1000() {
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }


}
