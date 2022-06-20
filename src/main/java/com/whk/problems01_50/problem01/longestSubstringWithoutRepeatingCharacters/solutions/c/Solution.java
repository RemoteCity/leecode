package com.whk.problems01_50.problem01.longestSubstringWithoutRepeatingCharacters.solutions.c;

import java.util.HashMap;
import java.util.Map;

//Runtime: 82 ms, faster than 16.50% of Java online submissions for Longest Substring Without Repeating Characters.
//Memory Usage: 49.2 MB, less than 18.04% of Java online submissions for Longest Substring Without Repeating Characters.
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0){
            return 0;
        }
        if (s.length()==1){
            return 1;
        }
        int result = 0;
        int end = 0;
        Map<Character,Integer> map = new HashMap();
        map.put(s.charAt(end), end);//将第一个字符放进map中
        end++;
        while (true){
            if (map.get(s.charAt(end))==null){//如果没有，把该字符放到map中，然后end向右移动一位
                map.put(s.charAt(end),end);
                if (end==s.length()-1){//如果end是最后一位了，就终止
                    return Math.max(result,map.size());
                }
                end++;
            }else {//如果map中已经有了该字符：remove掉重复元素之前的所有元素；更新result的值；将start的位置调整到重复元素的位置+1的位置
                int start=map.get(s.charAt(end))+1;
                result = Math.max(map.size(),result);
                map.values().removeIf(x->x<start);
            }
        }
    }
}
