package com.leetcode.tasks;

public class ValidPerfectSquare {

    public static void main(String[] args) {
        ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();
        System.out.println(validPerfectSquare.isPerfectSquare(1));
    }

    public boolean isPerfectSquare(int num) {
        int squareSum = 1;
        while (num > 0) {
            num -= squareSum;
            squareSum += 2;
        }
        return num == 0;
    }

}
