package com.leetcode.tasks;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int lastNumber = nums[nums.length - 1];
            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
            nums[0] = lastNumber;
        }

    }

}

/*

reverse

for (int i = 0; i < k; i++) {
    int temp = nums[i];
    nums[i] = nums[nums.length - 1 - i];
    nums[nums.length - 1 - i] = temp;
}

 */
