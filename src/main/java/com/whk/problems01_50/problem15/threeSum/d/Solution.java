package com.whk.problems01_50.problem15.threeSum.d;

import java.util.Arrays;
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
    /**
     * Runtime: 45 ms, faster than 35.90% of Java online submissions for 3Sum.
     * Memory Usage: 60 MB, less than 31.01% of Java online submissions for 3Sum.
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();
        if (nums.length<3){
            return results;
        }
        Arrays.sort(nums);
        for (int first = 0;first<nums.length;first++){
            if (first==0 || nums[first]!=nums[first-1]){//枚举first
                for (int second = first+1,third = nums.length-1;second<=third-1;){
                    if (second == first+1 || nums[second]!=nums[second-1]){//枚举second
                        int temp = nums[first]+nums[second]+nums[third];
                        if (temp==0){
                            List<Integer> result = new LinkedList<>();
                            result.add(nums[first]);
                            result.add(nums[second]);
                            result.add(nums[third]);
                            results.add(result);
                            second++;
                            third--;
                        }else if (temp>0){
                            third--;
                        }else{
                            second++;
                        }
                    }else {
                        second++;
                    }

                }
            }
        }
        return results;
    }
}
