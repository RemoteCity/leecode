package com.whk.algorithm.problems01_50.problem10.regularExpressionMatching;

import com.whk.algorithm.problems01_50.problem10.regularExpressionMatching.a.Solution;

/**
 * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
 *
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aa", p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 * Example 2:
 *
 * Input: s = "aa", p = "a*"
 * Output: true
 * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
 * Example 3:
 *
 * Input: s = "ab", p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 20
 * 1 <= p.length <= 30
 * s contains only lowercase English letters.
 * p contains only lowercase English letters, '.', and '*'.
 * It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        String s="bc";
        String p="_";
        System.out.print("是否匹配？"+solution.isMatch(s, p));
    }
}
