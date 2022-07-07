package com.whk.algorithm.problems01_50.problem13.romanToInteger.c;

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'I': right = 1; break;
                case 'V': right = 5; break;
                case 'X': right = 10; break;
                case 'L': right = 50; break;
                case 'C': right = 100; break;
                case 'D': right = 500; break;
                case 'M': right = 1000; break;
            }
            if (right>left){
                result = result - left;
            }else {
                result+=left;
            }
            left = right;
        }
        result+=left;
        return result;
    }
}
