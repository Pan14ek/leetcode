package com.leetcode.tasks;

public class RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        RemoveDuplicatesFromSortedArrayII removeDuplicatesFromSortedArrayII = new RemoveDuplicatesFromSortedArrayII();
        System.out.println(removeDuplicatesFromSortedArrayII.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int number : nums) {
            if (i < 2 || number > nums[i - 2])
                nums[i++] = number;
        }
        return i;
    }

}