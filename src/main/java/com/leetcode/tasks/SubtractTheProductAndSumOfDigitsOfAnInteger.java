package com.leetcode.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {
        String[] numbers = String.valueOf(n).split("");
        List<Integer> integers = Arrays.stream(numbers).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        int sum = 0;
        int multiply = 1;
        for (int num : integers) {
            sum += num;
            multiply *= num;
        }
        return multiply - sum;
    }

}
