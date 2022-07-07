package com.whk.algorithm.problems01_50.problem04.medianOfTwoSortedArrays.a;
//还可以有更简单的解法,在检测到一个没有长度的时候,就直接另一个里面读数据, 而不用复制
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length==0){
            if (nums2.length%2==0){
                return (nums2[nums2.length/2]+nums2[nums2.length/2-1])/2.0;
            }
            return nums2[nums2.length/2];
        }
        if (nums2.length==0){
            if (nums1.length%2==0){
                return (nums1[nums1.length/2]+nums1[nums1.length/2-1])/2.0;
            }
            return nums1[nums1.length/2];
        }


        int length=nums1.length+nums2.length;
        if (nums1.length==1&&nums2.length==1){
            return (nums1[0]+nums2[0])/2.0;
        }
        int[] sortedArrat=new int[length/2+1];
        int i=0,j=0;
        for (int k=0;k<sortedArrat.length;k++){
            if (i>=nums1.length){
                sortedArrat[k]=nums2[j];
                j++;
                continue;
            }
            if (j>=nums2.length){
                sortedArrat[k]=nums1[i];
                i++;
                continue;
            }
            if (nums1[i]<nums2[j]){
                sortedArrat[k]=nums1[i];
                i++;
            }else {
                sortedArrat[k]=nums2[j];
                j++;
            }
        }
        if (length%2==0){//偶数
            return (sortedArrat[sortedArrat.length - 1] + sortedArrat[sortedArrat.length - 2])/2.0;
        }
        return sortedArrat[sortedArrat.length-1];
    }
}
