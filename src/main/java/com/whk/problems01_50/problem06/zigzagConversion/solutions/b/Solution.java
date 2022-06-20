package com.whk.problems01_50.problem06.zigzagConversion.solutions.b;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows<2){
            return s;
        }
        int length = s.length();
        int remainder= length %(2*numRows-2);
        int numCols=remainder>numRows ? 2*length/(2*numRows-2)+2 : 2*length/(2*numRows-2)+1;
        char[][] table=new char[numCols][numRows];
        for (int c=0,i=0;c<numCols;c++){
            if (c%2==1){
                for (int r=numRows-2;r>0 && i<length;r--,i++){
                    table[c][r]=s.charAt(i);
                }
            }else {
                for (int r=0;r<numRows && i<length;r++,i++){
                    table[c][r]=s.charAt(i);
                }
            }
        }
        StringBuilder result=new StringBuilder();
        for (int i=0;i<numRows;i++){
            for (int j=0;j<numCols;j++){
                if (table[j][i]!='\0'){
                    result.append(table[j][i]);
                }
            }
        }
        return result.toString();
    }
}
