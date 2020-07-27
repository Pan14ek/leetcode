package com.leetcode.tasks;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for (int number : nums) {
            if (number != i) {
                break;
            } else {
                i++;
            }
        }
        return i;
    }

}
