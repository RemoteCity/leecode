package com.whk.others.productOfTwoLongestStringWithoutDuplicateChar;

import com.whk.others.productOfTwoLongestStringWithoutDuplicateChar.solution.a.LongestString;

public class Main {
    public static void main(String[] args) {
        LongestString longestString = new LongestString();
        String[] strings = {"abcw","foo","fxyz","bar","abcdef"};
        int result = longestString.getResult(strings);
        System.out.println(result);
    }
}
