package com.whk.algorithm.others.productOfTwoLongestStringWithoutDuplicateChar;

import com.whk.algorithm.others.productOfTwoLongestStringWithoutDuplicateChar.solution.a.LongestString;

public class Main {
    public static void main(String[] args) {
        LongestString longestString = new LongestString();
        String[] strings = {"abcw","foo","fxyz","bar","abcdef"};
        int result = longestString.getResult(strings);
        System.out.println(result);
    }
}
