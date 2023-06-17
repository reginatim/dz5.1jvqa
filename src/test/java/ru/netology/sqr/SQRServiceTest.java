package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class SQRServiceTest {

    @ParameterizedTest
//    @CsvSource({
//    "200,300,3",
//    "200,200,0",
//    "400,200,0"
//    })
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void testWhenFewSquaresFound(int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.calc(min, max);
        // int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//public void testWhenValuesSame() {
//SQRService service = new SQRService();
//int actual = service.calc(200, 200);
// int expected = 0;
// Assertions.assertEquals(expected, actual);
    //  }

//    @Test
//    public void testWhenOneValueInsideAnother() {
//        SQRService service = new SQRService();

//        int actual = service.calc(400, 200);
//        int expected = 0;

//        Assertions.assertEquals(expected, actual);
//    }
}
