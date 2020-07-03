package com.leetcode.tasks;

public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits findNumbersWithEvenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();
        System.out.println(findNumbersWithEvenNumberOfDigits.findNumbers(new int[]{12, 345, 2, 6, 7896}));
    }

    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            int numberCounter = 0;
            while (num > 0) {
                num /= 10;
                numberCounter++;
            }
            if (numberCounter % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

}
