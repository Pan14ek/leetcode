package com.leetcode.tasks;

import java.util.Arrays;

public class RunningSumOf1dArray {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};
        RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();
        System.out.println(Arrays.toString(runningSumOf1dArray.runningSum(nums)));
    }

    public int[] runningSum(int[] nums) {
        int[] sumArray = new int[nums.length];
        sumArray[0] = nums[0];
        for (int i = 1; i < sumArray.length; i++) {
            sumArray[i] += nums[i] + sumArray[i - 1];
        }
        return sumArray;
    }

}
