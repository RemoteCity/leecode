package com.whk.problems01_50.problem06.zigzagConversion;

import com.whk.problems01_50.problem06.zigzagConversion.solutions.b.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        String s="PAYPALISHIRING";
        int numRows=3;
        String convert = solution.convert(s, numRows).replaceAll("\u0000","");
        System.out.println(convert);
    }
}
