package com.whk.algorithm.problems01_50.problem10.regularExpressionMatching.a;

/**
 * 错误解法
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        if (p.contains("*") || s.length()<=p.length()){
            for (int i = 0, j = 0; i < s.length() && j < p.length(); i++) {
                char pChar = p.charAt(j);
                char sChar = s.charAt(i);
                switch (pChar){
                    case '*':{
                        if (j==p.length()-1){
                            return true;
                        }
                        j++;
                        break;
                    }
                    case '.':{
                        j++;
                        break;
                    }
                    default:{
                        if (pChar!=sChar) return false;
                        j++;
                    }
                }
            }
            return true;
        }else {
            return false;
        }

    }
}
