package com.leetcode.tasks;

public class PowerOfTwo {

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(218));
    }

    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        int i = 2;
        while (n > 2) {
            n -= i;
            i *= 2;
        }
        return n == 2;
    }

}
