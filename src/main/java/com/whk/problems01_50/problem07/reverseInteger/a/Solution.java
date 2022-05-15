package com.whk.problems01_50.problem07.reverseInteger.a;

public class Solution {
    public int reverse(int x) {
        boolean flag = false;
        if (x < 0) {
            flag = true;
            x *= -1;
        }
        int result = 0;
        while (true) {
            int digit = x % 10;//余数
            x = x / 10;//
            if ((long)result * 10 + digit==result * 10 + digit){
                result = result * 10 + digit;
            }else {
                return 0;
            }

            if (x == 0) {
                break;
            }
        }
        if (flag) {
            return -result;
        }
        return result;
    }
}
