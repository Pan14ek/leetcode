package com.leetcode.tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleAnArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution(nums);
        int[] param_1 = solution.reset();
        int[] param_2 = solution.shuffle();
        System.out.println(Arrays.toString(param_1));
        System.out.println(Arrays.toString(param_2));
    }

    static class Solution {

        private final int[] nums;

        public Solution(int[] nums) {
            this.nums = nums;
        }

        /**
         * Resets the array to its original configuration and return it.
         */
        public int[] reset() {
            return nums;
        }

        /**
         * Returns a random shuffling of the array.
         */
        public int[] shuffle() {
            int[] newNums = Arrays.copyOf(nums, nums.length);
            Random rnd = ThreadLocalRandom.current();
            for (int i = newNums.length - 1; i > 0; i--) {
                int index = rnd.nextInt(i + 1);
                int a = newNums[index];
                newNums[index] = newNums[i];
                newNums[i] = a;
            }
            return newNums;
        }
    }

}
