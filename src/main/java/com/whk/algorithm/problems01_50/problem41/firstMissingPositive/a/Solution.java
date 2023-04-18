package com.whk.algorithm.problems01_50.problem41.firstMissingPositive.a;

/**
 * @author wangkun
 */
public class Solution {

    /**
     * 一个长度为n的数组，缺失的最小的正整数只可能在[1,n+1]之间。这说明负数和大于n的数都是没有意义的。
     * 可以通过标记数组中的数来确定这除n+1外的n个正整数是否存在
     * 这时候需要找到一种标记方式，达到标记的目的，而又不让这些数失去原本的信息。
     *
     */
    public int firstMissingPositive(int[] nums) {
        // 确定最大的数
        int n = nums.length;
        // 第一次遍历，将没有价值的值替换成length + 1，这样他的值就可以用来当作数组的下标。
        // 这层遍历也可以不走，在第二次遍历的时候加一个判断也行
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (num > 0 && num <= n) {
                continue;
            }
            // 用n+1覆盖掉
            nums[i] = n +1;
        }

        // 现在数组内全是正整数了

        // 第二次遍历，将数组中包含的正整数打上标记
        for (int i = 0; i < nums.length; i++) {
            int originNum = nums[i];
            // 我们需要的是正整数，将之用来作为下标
            int numAndIndex = Math.abs(originNum);
            if (numAndIndex <= n){
                // 将标记做成幂等的，不然会被重复标记
                nums[numAndIndex - 1] = -Math.abs(nums[numAndIndex - 1]);
            }
        }

        // 现在所有在[1,n]范围内的正整数都已经被标记了
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

}
