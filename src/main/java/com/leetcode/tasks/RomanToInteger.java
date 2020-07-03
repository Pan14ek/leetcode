package com.leetcode.tasks;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("X"));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> numberMap = getRomanSymbols();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'M') {
                sum += numberMap.get(s.charAt(i));
            }
            if (s.charAt(i) == 'D') {
                sum += numberMap.get(s.charAt(i));
            }
            if (s.charAt(i) == 'C') {
                int number = numberMap.get(s.charAt(i));
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'M' || s.charAt(i + 1) == 'D')) {
                    sum -= number;
                } else {
                    sum += number;
                }
            }
            if (s.charAt(i) == 'L') {
                sum += 50;
            }
            if (s.charAt(i) == 'X') {
                int number = numberMap.get(s.charAt(i));
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'C' || s.charAt(i + 1) == 'L')) {
                    sum -= number;
                } else {
                    sum += number;
                }
            }
            if (s.charAt(i) == 'V') {
                sum += numberMap.get(s.charAt(i));
            }
            if (s.charAt(i) == 'I') {
                int number = numberMap.get(s.charAt(i));
                if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    sum -= number;
                } else {
                    sum += number;
                }
            }
        }
        return sum;
    }

    private Map<Character, Integer> getRomanSymbols() {
        Map<Character, Integer> numberMap = new HashMap<>();
        numberMap.put('I', 1);
        numberMap.put('V', 5);
        numberMap.put('X', 10);
        numberMap.put('L', 50);
        numberMap.put('C', 100);
        numberMap.put('D', 500);
        numberMap.put('M', 1000);
        return numberMap;
    }


}
