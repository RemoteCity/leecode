package com.whk.algorithm.others.productOfTwoLongestStringWithoutDuplicateChar.solution.a;

public class LongestString {
    /**
     * 输入一个字符串数组words，请计算不包含相同字符的两个字符串words[i]和words[j]的长度乘积的最大值。
     * 如果所有字符串都包含至少一个相同字符，那么返回0。假设字符串中只包含英文小写字母。
     * 例如，输入的字符串数组words为[“abcw”，“foo”，“bar”，“fxyz”，“abcdef”]，
     * 数组中的字符串"bar"与"foo"没有相同的字符，它们长度的乘积为9。"abcw"与"fxyz"也没有相同的字符，
     * 它们长度的乘积为16，这是该数组不包含相同字符的一对字符串的长度乘积的最大值。
     */
    public int getResult(String[] words){
        int[] flags = new int[words.length];
        for (int i = words.length - 1; i >= 0; i--) {
            for (char c : words[i].toCharArray()) {
                flags[i] |= 1<<(c-'a');
            }
        }
        int result = 0;
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length; j++) {
                if ((flags[i]&flags[j])==0){
                    result = Math.max(result,words[i].length()*words[j].length());
                }
            }
        }
        return result;
    }
}
