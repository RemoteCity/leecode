package com.whk.algorithm.problems01_50.problem15.threeSum;


import com.whk.algorithm.problems01_50.problem15.threeSum.d.Solution;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[] nums = {7,5,-8,-6,-13,7,10,1,1,-4,-14,0,-1,-10,1,-13,-4,6,-11,8,-6,0,0,-5,0,11,-9,8,2,-6,4,-14,6,4,-5,0,-12,12,-13,5,-6,10,-10,0,7,-2,-5,-12,12,-9,12,-9,6,-11,1,14,8,-1,7,-13,8,-11,-11,0,0,-1,-15,3,-11,9,-7,-10,4,-2,5,-4,12,7,-8,9,14,-11,7,5,-15,-15,-4,0,0,-11,3,-15,-15,7,0,0,13,-7,-12,9,9,-3,14,-1,2,5,2,-9,-3,1,7,-12,-3,-1,1,-2,0,12,5,7,8,-7,7,8,7,-15};
        //int[] nums = {-1,0,1,2,-1,-4};
        int[] nums = {3,0,-2,-1,1,2};
        List<List<Integer>> lists = solution.threeSum(nums);
        System.out.println(lists);
    }
}
