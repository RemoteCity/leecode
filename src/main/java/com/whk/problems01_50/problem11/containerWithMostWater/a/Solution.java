package com.whk.problems01_50.problem11.containerWithMostWater.a;


/**
 *  Input: height = [1,8,6,2,5,4,8,3,7]
 *  Input: height = [0,1,2,3,4,5,6,7,8]
 */


/**
 * Time Limit Exceeded
 */
public class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        for (int left = 0; left < height.length; left++) {
            for (int right = left+1; right< height.length;right++){
                int min = Math.min(height[left],height[right]);
                result = Math.max(result, min *(right-left));
            }
        }
        return result;
    }
}
