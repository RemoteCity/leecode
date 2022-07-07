package com.whk.algorithm.problems01_50.problem17.letterCombinationsOfAPhoneNumber;


import com.whk.algorithm.problems01_50.problem17.letterCombinationsOfAPhoneNumber.a.Solution;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        List<String> strings = solution.letterCombinations("232");
        System.out.println(strings);
    }
}
