package com.leetcode.tasks;

public class NumberOfStepsToReduceANumberToZero {

    public static void main(String[] args) {
        NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();
        System.out.println(numberOfStepsToReduceANumberToZero.numberOfSteps(123));
    }

    public int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }
        int stepCounter = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            stepCounter++;
        }
        return stepCounter;
    }

}
