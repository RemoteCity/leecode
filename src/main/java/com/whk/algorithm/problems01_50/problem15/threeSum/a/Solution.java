package com.whk.algorithm.problems01_50.problem15.threeSum.a;

import java.util.LinkedList;
import java.util.List;

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
    //failure
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();
        List<Integer> numsHaveBeenUsed = new LinkedList<>();
        int left1Index = 0;
        int left2Index = 1;
        numsHaveBeenUsed.add(left1Index);
        numsHaveBeenUsed.add(left2Index);
        while (true) {
            int right = -(nums[left1Index] + nums[left2Index]);
            for (int i = 0; i < nums.length; i++) {
                if (!numsHaveBeenUsed.contains(i)) {
                    if (nums[i] == right) {
                        numsHaveBeenUsed.add(i);
                        List<Integer> result = new LinkedList<>();
                        result.add(nums[left1Index]);
                        result.add(nums[left2Index]);
                        result.add(nums[i]);
                        results.add(result);
                    }
                }
            }
            while (true) {
                left1Index++;
                if (!numsHaveBeenUsed.contains(left1Index)) {
                    numsHaveBeenUsed.add(left1Index);
                    if (left1Index>=nums.length){
                        return results;
                    }
                    break;
                }
            }
            while (true) {
                left2Index++;
                if (!numsHaveBeenUsed.contains(left2Index)) {
                    numsHaveBeenUsed.add(left2Index);
                    if (left2Index>=nums.length){
                        return results;
                    }
                    break;
                }
            }
            if (numsHaveBeenUsed.size() == nums.length){
                break;
            }

        }
        return results;
    }
}
