package com.leetcode.tasks;

public class XOROperationInAnArray {

    public static void main(String[] args) {
        XOROperationInAnArray xorOperationInAnArray = new XOROperationInAnArray();
        System.out.println(xorOperationInAnArray.xorOperation(1, 7));
    }

    public int xorOperation(int n, int start) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = start + 2 * i;
        }
        int xorNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            xorNumber ^= numbers[i];
        }
        return xorNumber;
    }

}
