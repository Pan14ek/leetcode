package com.leetcode.tasks;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] resultArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            resultArray[i] = countSmallerNumbers(nums[i], nums);
        }
        return resultArray;
    }

    private int countSmallerNumbers(int number, int[] numbers) {
        return Math.toIntExact(Arrays.stream(numbers).filter(num -> number > num).count());
    }

}
