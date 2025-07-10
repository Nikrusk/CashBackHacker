package ru.netology;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldSpendExtra100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSpendExtra900() {
        CashbackHackService cashbackHackService = new CashbackHackService ();
        int actual = cashbackHackService.remain(1100);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSpendExtra() {
        CashbackHackService cashbackHackService = new CashbackHackService ();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }
}