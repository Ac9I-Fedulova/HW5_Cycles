package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthHolidayServiceTest {

    @Test
    public void testFirst() {
        MonthHolidayService service = new MonthHolidayService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        MonthHolidayService service = new MonthHolidayService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }


}
