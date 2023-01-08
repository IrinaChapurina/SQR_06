package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @Test
    public void calculateSqrtTestLowBoundry() {
        SQRService service = new SQRService();
        int actual = service.calculateSqrt(0, 100);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateSqrtTestHighBoundry() {
        SQRService service = new SQRService();
        int actual = service.calculateSqrt(9801, 20000);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateSqrtTestMiddleBoundry() {
        SQRService service = new SQRService();
        int actual = service.calculateSqrt(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

}

