package com.whk.algorithm.problems01_50.problem16.threeSumCloesest.a;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        List<List<Integer>> results = new LinkedList<>();
        if (nums.length<3){
            return 1;
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
        return 1;
    }
}
