package com.leetcode.tasks;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("[])"));
    }

    public boolean isValid(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                sum += 1;
            }
            if (s.charAt(i) == ')') {
                if (s.length() > 1 && i != 0 && s.charAt(i - 1) == '(' || i % 2 != 0) {
                    sum -= 1;
                }
            }
            if (s.charAt(i) == '{') {
                sum += 2;
            }
            if (s.charAt(i) == '}') {
                if (s.length() > 1 && i != 0 && s.charAt(i - 1) == '{' || i % 2 != 0) {
                    sum -= 2;
                } else {
                    sum -= 1;
                }
            }
            if (s.charAt(i) == '[') {
                sum += 3;
            }
            if (s.charAt(i) == ']') {
                if (s.length() > 1 && i != 0 && s.charAt(i - 1) == '[' || i % 2 != 0) {
                    sum -= 3;
                } else {
                    sum -= 1;
                }
            }
        }
        return sum == 0;
    }

}
