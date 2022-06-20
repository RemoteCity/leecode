package com.whk.problems01_50.problem01.longestSubstringWithoutRepeatingCharacters.solutions.a;
//超时了。。。
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 1;
        if (s.length() == 1) {
            return 1;
        }
        for (; i <= s.length(); i++) {//子字符串的长度, [1 , s.length()]
            int count = getRepeatTimes(s, i);//子字符的集合中，满足有重复字符这一条件的个数
            //如果该长度的所有的子字符串都有重复字符，说明最大长度就是i-1;
            //即所有的组合都有重复的字符；从s.length()个字符中取连续i个字符 s.length()-i+1
            int mapSize=s.length()-i+1;
            if (count == mapSize) {
                return i-1;
            }
        }
        return s.length();
    }

    //判断一个字符串中是否有重复的字符,有 true，没有 false
    public boolean getExjunction(String substring) {
        int isRepeat = 0;
        //如果有字符串长度为4
        //(0,1)(0,2)(0,3)(0,4)
        //(1,2)(1,3)(1,4)
        //(2,3)(2,4)
        //(3,4)
        for (int i = 0; i < substring.length(); i++) {
            for (int j = i + 1; j < substring.length(); j++) {
                if (substring.charAt(i) == substring.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getRepeatTimes(String s, int i) {
        int count = 0;//子字符的集合中，满足有重复字符这一条件的个数
        String substring;
        for (int start = 0; start + i <= s.length(); start++) {//获取该长度的所有子字符串
            substring = s.substring(start, start + i);
            if (getExjunction(substring)) {//有相同的字符
                count++;
            }
        }
        return count;
    }
}
