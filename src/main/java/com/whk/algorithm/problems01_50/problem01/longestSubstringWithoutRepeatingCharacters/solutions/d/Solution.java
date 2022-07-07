package com.whk.algorithm.problems01_50.problem01.longestSubstringWithoutRepeatingCharacters.solutions.d;

public class Solution {

    /**
     * 核心思想类似于维护一个可变大小的窗口
     * 只记录每个字符上次出现的位置
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128];//定义了一个128位的数组，对应ascii编码，用于记录字符在字符串中的位置
        for (int j = 0, i = 0; j < n; j++) {//只要遍历一次字符串
            int position = index[s.charAt(j)];
            i = Math.max(position, i);//i表示该元素上次出现的位置（是s的index+1），和上一个重复出现的字符的位置比较，取较大的；更新为靠后的字符的位置
            ans = Math.max(ans, j - i + 1);//表示无重复字符的子字符串的长度。用当前位置减去上一个重复出现的字符的位置
            index[s.charAt(j)] = j + 1;//将该元素的位置更新
        }
        return ans;
    }
}
