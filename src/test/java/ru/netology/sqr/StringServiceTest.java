package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringServiceTest {
    @Test
    public void shouldFindLongestIfFirst() {
        StringService service = new StringService();

        String s1 = "Hello";
        String s2 = "Wow";

        String expected = s1;
        String actual = service.longestString(s1, s2);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldWorkIfEqualLength() {
        StringService service = new StringService();

        String s1 = "Hello";
        String s2 = "World";

        String expected = s2;
        String actual = service.longestString(s1, s2);

        Assertions.assertEquals(expected, actual);
    }
}
