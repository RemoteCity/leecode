package com.whk.algorithm.problems01_50.problem08.stringToTnteger_atoi.c;

public class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        int result = 0;
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '+' ? 1 : -1;
        }
        for (; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int num = s.charAt(i) - '0';
                if (result < Integer.MAX_VALUE / 10 && result * 10 < Integer.MAX_VALUE - num) {
                    result = result * 10 + num;
                } else {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                continue;
            }
            return 0;
        }
        return sign * result;
    }
}
