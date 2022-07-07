package com.whk.algorithm.problems01_50.problem17.letterCombinationsOfAPhoneNumber.a;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * Return the answer in any order.
 * <p>
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 */
public class Solution {

    /**
     * Runtime: 10 ms, faster than 15.31% of Java online submissions for Letter Combinations of a Phone Number.
     * Memory Usage: 43.3 MB, less than 11.38% of Java online submissions for Letter Combinations of a Phone Number.
     */
    static Map<Integer, String> phoneButtons = new HashMap<>(8);

    static {
        phoneButtons.put(2, "abc");
        phoneButtons.put(3, "def");
        phoneButtons.put(4, "ghi");
        phoneButtons.put(5, "ikl");
        phoneButtons.put(6, "mno");
        phoneButtons.put(7, "pqrs");
        phoneButtons.put(8, "tuv");
        phoneButtons.put(9, "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<>();
        for (int i = 0; i < digits.length(); i++) {
            String button = phoneButtons.get(digits.charAt(i) - '0');
            if (i == 0) {
                for (int j = 0; j < button.length(); j++) {
                    result.add(String.valueOf(button.charAt(j)));
                }
                continue;
            }

            List<String> tempResult = new LinkedList<>();
            for (int j = 0; j < button.length(); j++) {
                for (String s : result) {
                    String newElement = s + button.charAt(j);
                    tempResult.add(newElement);
                }
            }
            result = tempResult;

        }
        return result;
    }
}
