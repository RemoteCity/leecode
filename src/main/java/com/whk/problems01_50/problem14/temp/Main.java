package com.whk.problems01_50.problem14.temp;


import com.whk.problems01_50.problem14.temp.a.Solution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Solution solution=new Solution();
//        Scanner scanner = new Scanner(System.in);
//        int line = scanner.nextInt();
        int line=4;
        boolean [][] array = new boolean[2*line-1][4*line-1];
        for (int i = 0; i < array.length; i++) {
            if (i%2==1){
                break;
            }
            for (int j = 0; j < array[i].length; j++) {
                if (j<line){
                    if (j>2*line-1){
                        continue;
                    }
                }else if (j==line){

                }else if (j<2*line){
                    if (j<2*line-1){
                        continue;
                    }
                }else if (j==2*line){

                }else if (j<3*line){
                    if (true){
                        continue;
                    }
                }else if (j==3*line){

                }else {
                    if (true){
                        continue;
                    }
                }
                array[i][j] = true;
            }
        }
        for (int i = 0; i < array.length; i++) {
            boolean[] anArray = array[i];
            for (int j = 0; j < anArray.length; j++) {
                boolean anAnArray = anArray[j];
                if (anAnArray) System.out.println("*");
                else System.out.println(" ");
            }
        }
    }

}
