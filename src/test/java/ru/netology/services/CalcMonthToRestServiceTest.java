package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcMonthToRestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")

//    @CsvSource({
//            "10000, 3000, 20000, 3",
//            "100000, 60000, 150000, 2"
//    })
    public void firstCasePlanningFreeMonthToRest(int income, int expense, int threshold, int expected) {

        CalcMonthToRestService service = new CalcMonthToRestService();

//        int income = 10_000;
//        int expense = 3_000;
//        int threshold = 20_000;
//        int expected = 3;

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);

    }

//    @Test
//    public void secondCasePlanningFreeMonthToRest() {
//
//        CalcMonthToRestService service = new CalcMonthToRestService();
//
//        int income = 100_000;
//        int expense = 60_000;
//        int threshold = 150_000;
//        int expected = 2;
//
//        int actual = service.calculate(income, expense, threshold);
//
//        Assertions.assertEquals(expected, actual);
//
//    }
}
