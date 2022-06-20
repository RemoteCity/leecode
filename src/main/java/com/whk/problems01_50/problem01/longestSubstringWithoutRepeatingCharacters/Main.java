package com.whk.problems01_50.problem01.longestSubstringWithoutRepeatingCharacters;

import com.whk.problems01_50.problem01.longestSubstringWithoutRepeatingCharacters.solutions.d.Solution;

public class Main {
    public static void main(String[] args) {
        String s="abcabcedj";
        Solution solution=new Solution();
        int result=solution.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
