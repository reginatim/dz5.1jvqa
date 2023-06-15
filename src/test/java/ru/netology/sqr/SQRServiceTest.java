package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    public void testWhenFewSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenValuesSame() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWhenOneValueInsideAnother() {
        SQRService service = new SQRService();

        int actual = service.calc(400, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
