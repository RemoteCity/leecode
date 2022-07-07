package com.whk.algorithm.problems01_50.problem13.romanToInteger.a;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {

        Map<Character,Integer> svMap = new HashMap<>();
        svMap.put('I',1);
        svMap.put('V',5);
        svMap.put('X',10);
        svMap.put('L',50);
        svMap.put('C',100);
        svMap.put('D',500);
        svMap.put('M',1000);
        int result = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char rightKey = s.charAt(i);
            int right = svMap.get(rightKey);
            if (right>left){
                result = result - 2 * left + right;
            }else {
                result = result+right;
            }
            left = right;
        }
        return result;
    }
}
