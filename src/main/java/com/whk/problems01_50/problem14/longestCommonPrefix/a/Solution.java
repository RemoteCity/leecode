package com.whk.problems01_50.problem14.longestCommonPrefix.a;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = Integer.MAX_VALUE;
        for (String str : strs) {
            length = Math.min(str.length(),length);
        }
        StringBuilder result = new StringBuilder();
        for (int charIndex = 0;charIndex<length;charIndex++){
            char tempChar = strs[0].charAt(charIndex);
            for (int i = 1; i < strs.length; i++) {
                int isEquals = tempChar ^ strs[i].charAt(charIndex);
                if (isEquals != 0) {
                    return result.toString();
                }
            }
            result.append(tempChar);
        }
        return result.toString();
    }
}
