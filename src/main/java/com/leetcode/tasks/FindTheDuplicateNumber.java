package com.leetcode.tasks;

import java.util.Arrays;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        FindTheDuplicateNumber findTheDuplicateNumber = new FindTheDuplicateNumber();
        System.out.println(findTheDuplicateNumber.findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        int duplicate = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                duplicate = nums[i];
                break;
            }
        }
        return duplicate;
    }

}
