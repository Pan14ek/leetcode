package com.leetcode.tasks;

public class PowerOfFour {

    public static void main(String[] args) {
        PowerOfFour powerOfFour = new PowerOfFour();
        System.out.println(powerOfFour.isPowerOfFour(257));
    }

    public boolean isPowerOfFour(int num) {
        if (num == 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        if (num == 4) {
            return true;
        }
        int i = 16;
        int prev = num;
        while (num > 4) {
            if (num == i || prev == i) {
                return true;
            }
            prev = num;
            num /= 4;
            i *= 4;
        }
        return false;
    }

}
