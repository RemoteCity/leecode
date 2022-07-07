package com.whk.algorithm.problems01_50.problem14.longestCommonPrefix;


import com.whk.algorithm.problems01_50.problem14.longestCommonPrefix.a.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"flower","flow","flight"};
        //String[] strs = {"dog","racecar","car"};
        String s = solution.longestCommonPrefix(strs);
        System.out.println(s);


    }

//        Scanner scanner = new Scanner(System.in);
//        int line = scanner.nextInt();
//        int line = 4;
//        boolean[][] array = new boolean[2 * line - 1][4 * line - 1];
//        for (int y = 0; y < array.length; y++) {
//            if (y % 2 == 1) {
//                break;
//            }
//            for (int x = 0; x < array[y].length; x++) {
//                if (x<=line-1){
//                    if ((2*line-1)*x >= (line-1)*y){
//                        array[x][y] = true;
//                    }
//                }else if (x<=2*line-1){
//                    if ((2*line-1)*x >= y-2*line +1){
//
//                    }
//                }else if (x>=2*line+1 && x<=3*line){
//
//                }else if (x>=3*line){
//
//                }
//            }
//        }
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j]){
//                    System.out.println("*");
//                }else {
//                    System.out.println(" ");
//                }
//            }
//        }
//    }
}
