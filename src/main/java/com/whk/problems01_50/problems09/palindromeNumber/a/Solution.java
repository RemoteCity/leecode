package com.whk.problems01_50.problems09.palindromeNumber.a;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        StringBuilder s=new StringBuilder();
        while (!(x/10==0)){
            s.insert(0,x%10);
            x/=10;
        }
        s.insert(0,x);
        String num = s.toString();
        for (int i = 0,j=num.length()-1; i < num.length()/2; i++,j--) {
            if (s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
}
