package com.leetcode.tasks;

import java.util.Arrays;

public class ShuffleTheArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        System.out.println(Arrays.toString(shuffleTheArray.shuffle(nums, n)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] shuffleNums = new int[nums.length];
        int index = 0;
        for (int i = 1; i < nums.length; i += 2) {
            shuffleNums[i - 1] = nums[index++];
            shuffleNums[i] = nums[n++];
        }
        return shuffleNums;
    }

}
