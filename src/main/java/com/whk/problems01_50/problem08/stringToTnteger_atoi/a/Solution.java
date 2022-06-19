package com.whk.problems01_50.problem08.stringToTnteger_atoi.a;

public class Solution {
    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        boolean negativeFlag = false;
        boolean ifTyped = false;
        boolean ifDoubleZero=false;
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            byte type = getCharType(chars[i]);
            switch (type){
                case 0:{//数字
                    int num = chars[i] - '0';
                    result = result * 10 + num;
                    if (result * 10 != (long) result * 10 || result * 10 + num != (long) result * 10 + num) {
                        if (negativeFlag) {
                            return Integer.MIN_VALUE;
                        }
                        return Integer.MAX_VALUE;
                    }
                    break;
                }
                case 1:{//字母
                    return getResult(result,negativeFlag);
                }
                case 2:{//正负
                    if (!ifDoubleZero){
                        if (!ifTyped){
                            negativeFlag = true;
                            ifTyped=true;
                            break;
                        }else {
                            return getResult(result,negativeFlag);
                        }
                    }else {
                        return 0;
                    }

                }
                case 3:{
                    if (!ifDoubleZero){
                        if (ifTyped){
                            return getResult(result,negativeFlag);
                        }else {
                            ifTyped=true;
                        }
                    } else {
                        return getResult(result,negativeFlag);
                    }
                }
                case 4:{
                    break;
                }
                case 5:{
                    return getResult(result,negativeFlag);
                }
                case 6:{
                    if (i==0){
                        ifDoubleZero=true;
                        break;
                    }else if (i==1&&ifDoubleZero){
                        return getResult(result,negativeFlag);
                    }else {
                        int num = chars[i] - '0';
                        result = result * 10 + num;
                        if (result * 10 != (long) result * 10 || result * 10 + num != (long) result * 10 + num) {
                            if (negativeFlag) {
                                return Integer.MIN_VALUE;
                            }
                            return Integer.MAX_VALUE;
                        }
                        break;
                    }

                }
            }
        }

        return getResult(result,negativeFlag);

    }

    /**
     * @param element
     * @return
     * -1 其他
     * 1-9 数字
     * 1 字母
     * 2 负号
     * 3 正号
     * 4 空格
     * 5 句号.
     * 6 数字0
     */
    private byte getCharType(char element) {
        if (element <= 57 && element > 48) return 0;
        else if ((element <= 90 && element >= 65) || (element >= 97 && element <= 122)) return 1;
        else if (element==45) return 2;
        else if (element==43) return 3;
        else if (element==32) return 4;
        else if (element==46) return 5;
        else if (element==48) return 6;
        else return -1;
    }
    private int getResult(int result, boolean negativeFlag){
        if (negativeFlag) {
            return -result;
        }
        return result;
    }

}
