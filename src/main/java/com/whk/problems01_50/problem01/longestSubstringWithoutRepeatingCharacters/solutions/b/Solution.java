package com.whk.problems01_50.problem01.longestSubstringWithoutRepeatingCharacters.solutions.b;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = s.length();
        if (s.length() == 1) {
            return 1;
        }
        for (; i >=0; i--) {//子字符串的长度, [1 , s.length()]
            boolean repeatTimes = getIsRepeated(s, i);
            if (repeatTimes){
                return i;
            }
        }
        return 0;
    }

    //判断一个字符串中是否有重复的字符,有 true，没有 false
    public boolean getExjunction(String substring) {
        Set<Character> set=new HashSet();
        for (int i=substring.length()-1;i>=0;i--){
            set.add(substring.charAt(i));
            if (set.size()<substring.length()-i){
                return true;
            }
        }
        return false;
    }

    public boolean getIsRepeated(String s, int i) {
        for (int start = 0; start + i <= s.length(); start++) {//获取该长度的所有子字符串，应该是从最长的子字符串比较好
            String substring = s.substring(start, start + i);
            if (!getExjunction(substring)) {//没有有相同的字符,就直接返回; 表示该长度的子字符串有满足条件的,就直接跳出
                return true;
            }
        }
        //表示该长度的子字符串都是有重复的
        return false;
    }
}
