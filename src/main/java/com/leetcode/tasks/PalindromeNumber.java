package com.leetcode.tasks;

import java.util.stream.IntStream;

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(-121));
    }

    public boolean isPalindrome(int x) {
        String[] stringNumbers = String.valueOf(x).split("");
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(0, stringNumbers.length)
                .forEach(i -> stringBuilder.append(stringNumbers[stringNumbers.length - i - 1]));
        String reverseNumber = stringBuilder.toString();
        return String.valueOf(x).equals(reverseNumber);
    }

}
