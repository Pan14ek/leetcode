package com.leetcode.tasks;

public class CountPrimes {

    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        int amountPrimeNumbers = countPrimes.countPrimes(4);
        System.out.println(amountPrimeNumbers);
    }

    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        int counter = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

}
