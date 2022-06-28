package com.whk.problems01_50.problem15.threeSum.c;

import java.util.HashSet;
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
    //failure
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();
        if (nums.length<3){
            return results;
        }
        int left = 0;
        int right = nums.length-1;
        boolean leftOrRightToMove = true;
        boolean ifFindMid = false;
        do {
            int mid = nums[left] + nums[right];
            mid = -mid;
            for (int i = left + 1; i < right; i++) {
                if (nums[i] == mid) {
                    List<Integer> result = new LinkedList<>();
                    result.add(nums[left]);
                    result.add(nums[i]);
                    result.add(nums[right]);
                    results.add(result);
                    ifFindMid = true;
                }
            }
            if (ifFindMid){//left和right找到了对应的mid
                if (leftOrRightToMove){
                    left++;
                    leftOrRightToMove = false;
                }else {
                    right--;
                    leftOrRightToMove = true;
                }
            }else {

            }



        } while (left < right);
        return results;
    }
}
