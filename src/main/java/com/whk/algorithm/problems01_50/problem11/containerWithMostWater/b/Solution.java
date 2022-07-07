package com.whk.algorithm.problems01_50.problem11.containerWithMostWater.b;


/**
 *  Input: height = [1,8,6,2,5,4,8,3,7]
 *  Input: height = [0,1,2,3,4,5,6,7,8]
 */

/**
 * 最大值在最左和最右之间，通过缩短wide来逐步逼近正方形
 * result = height * wide
 * 在逼近的时候wide每次减少一
 * 在其中一个因子 wide减小时，只有增加 height才能达到增大result的目的
 * height取min(leftValue,rightValue)
 * 所以要移动现有leftValue和rightValue中小的那个，试图找到一个更大的。
 *
 * Q1:为什么左边只能向右移动，右边只能向左移动？
 * A1:每次移动左右标都是一个试图逼近正方形的的步骤，如果存在比现有result更大的值的话，可以证明，一定在移动之后的区间里。
 */
public class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length-1;
        while (left<right){
            int min = Math.min(height[left],height[right]);
            result = Math.max(result, min *(right-left));
            if (height[left]>height[right]) right--;
            else left++;
        }
        return result;
    }
}
