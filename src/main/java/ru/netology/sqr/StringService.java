package ru.netology.sqr;

public class StringService {
    public String longestString(String s1, String s2) {
        if (s1.length() <= s2.length()) {
            return s2;
        } else {
            return s1;
        }
    }
}
