package com.whk.algorithm.problems01_50.problem15.threeSum.b;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 15. 3Sum
 * Medium
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Example 2:
 * <p>
 * Input: nums = []
 * Output: []
 * Example 3:
 * <p>
 * Input: nums = [0]
 * Output: []
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 */
public class Solution {

    //Time Limit Exceeded
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();
        if (nums.length<3){
            return results;
        }
        List<Set<Integer>> combination = new LinkedList<>();
        int left1Index = 0;
        int left2Index = 1;
        for (;;){
            int right = -(nums[left1Index]+nums[left2Index]);
            for (int i = left2Index+1; i < nums.length; i++) {

            }
            if (left2Index==nums.length-1){
                if (left1Index==nums.length-2){
                    //left1 和 left2是最后三个里面的
                    break;
                }else {
                    //left1 left2 同时右移
                    left2Index = left1Index+2;
                    left1Index++;
                }
            }else {
                //右移left2
                left2Index++;
            }
        }
        return results;
    }
}
