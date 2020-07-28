package com.leetcode.tasks;

public class RotateFunction {

    public static void main(String[] args) {
        int[] nums = {4, 15, 14, 3, 14, -8, 12, -9, 17, -1, 15, 1, 10, 19, -7, 15, 8, 7, -8, 11};
        RotateFunction rotateFunction = new RotateFunction();
        int max = rotateFunction.maxRotateFunction(nums);
        System.out.println(max);
    }

    public int maxRotateFunction(int[] A) {
        int sum = 0;
        int length = A.length;
        int F = 0;
        for (int i = 0; i < length; i++) {
            F += i * A[i];
            sum += A[i];
        }
        int max = F;
        for (int i = length - 1; i >= 1; i--) {
            F += sum - length * A[i];
            max = Math.max(F, max);
        }
        return max;
    }

}
