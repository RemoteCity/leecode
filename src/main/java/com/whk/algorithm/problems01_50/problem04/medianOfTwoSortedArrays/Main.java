package com.whk.algorithm.problems01_50.problem04.medianOfTwoSortedArrays;

import com.whk.algorithm.problems01_50.problem04.medianOfTwoSortedArrays.a.Solution;

public class Main {
    public static void main(String[] args) {
       int[] nums1 = {2,3}, nums2 = {1,4};
        Solution solution=new Solution();
        double medianSortedArrays = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }
}
