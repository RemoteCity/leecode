package com.whk.problems01_50.problem12.integerToRoman.a;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     *  * Symbol       Value
     *  * I             1 0
     *  * V             5 0
     *  * X             10 1
     *  * L             50 1
     *  * C             100 2
     *  * D             500 2
     *  * M             1000 3
     */
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <=3 ; i++) {
            int v = num % 10;
            num/=10;
            if (v==0){
                continue;
            }
            if (v==9){
                if (i==0){
                    result.insert(0,"IX");
                    continue;
                }
                if (i==1){
                    result.insert(0,"XC");
                    continue;
                }
                if (i==2){
                    result.insert(0,"CM");
                    continue;
                }
            }
            if (v>5){
                int times = v-5;
                if (i==0){
                    result.insert(0,"V");
                    for (int j = 0; j < times; j++) {
                        result.insert(1,"I");
                    }
                    continue;
                }
                if (i==1){
                    result.insert(0,"L");
                    for (int j = 0; j < times; j++) {
                        result.insert(1,"X");
                    }
                    continue;
                }
                if (i==2){
                    result.insert(0,"D");
                    for (int j = 0; j < times; j++) {
                        result.insert(1,"C");
                    }
                    continue;
                }
            }
            if (v==5){
                if (i==0){
                    result.insert(0,"V");
                    continue;
                }
                if (i==1){
                    result.insert(0,"L");
                    continue;
                }
                if (i==2){
                    result.insert(0,"D");
                    continue;
                }
            }

            if (v==4){
                if (i==0){
                    result.insert(0,"IV");
                    continue;
                }
                if (i==1){
                    result.insert(0,"XL");
                    continue;
                }
                if (i==2){
                    result.insert(0,"CD");
                    continue;
                }
            }
            if (v>=1){
                if (i==0){
                    for (int j = 0; j < v; j++) {
                        result.insert(0,"I");
                    }
                    continue;
                }
                if (i==1){
                    for (int j = 0; j < v; j++) {
                        result.insert(0,"X");
                    }
                    continue;
                }
                if (i==2){
                    for (int j = 0; j < v; j++) {
                        result.insert(0,"C");
                    }
                    continue;
                }
                if (i==3){
                    for (int j = 0; j < v; j++) {
                        result.insert(0,"M");
                    }
                    continue;
                }
            }

        }
        return result.toString();
    }
}
