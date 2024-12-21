package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MonthHolidayServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/MonthHoliday.csv")
    public void testFirst(int expected, int income, int expenses, int threshold) {
        MonthHolidayService service = new MonthHolidayService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
