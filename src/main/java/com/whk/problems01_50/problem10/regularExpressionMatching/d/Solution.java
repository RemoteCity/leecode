package com.whk.problems01_50.problem10.regularExpressionMatching.d;

public class Solution {
    public boolean isMatch(String s, String p){
        if (p.contains("*")){
            for (int i = 0,j=0; i < s.length() && j<p.length();) {
                if (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'){
                    j++;
                    i++;
                }else if (j+1<p.length() && p.charAt(j+1)=='*'){

                    j++;
                }else {
                    return false;
                }
            }
        }else {
            if (p.length()!=s.length()){
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i)==p.charAt(i) || p.charAt(i)=='.')){
                    return false;
                }
            }
        }
        return true;
    }
}
