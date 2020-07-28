package com.leetcode.tasks;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class SetMismatch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        SetMismatch setMismatch = new SetMismatch();
        System.out.println(Arrays.toString(setMismatch.findErrorNums(nums)));
    }

    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int duplicate = 0;
        int loseNumber = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                duplicate = nums[i];
            }
        }
        Set<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for (Integer number : numbers) {
            if (number != loseNumber) {
                break;
            } else {
                loseNumber++;
            }
        }
        return new int[]{duplicate, loseNumber};
    }

}
