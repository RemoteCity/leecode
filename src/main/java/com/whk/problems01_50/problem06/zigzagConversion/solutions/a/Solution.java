package com.whk.problems01_50.problem06.zigzagConversion.solutions.a;

public class Solution {
    public String convert(String s, int numRows) {
        int length = s.length();
        char[] newString=new char[length];
        for (int i = 0; i< length; i++){
            newString[getIndex(length,i,numRows)]=s.charAt(i);
        }
        return new String(newString);
    }


    public char getIndex(int length,int oldIndex,int numRows){
        int newIndex=0;

        return 0;
    }
}
