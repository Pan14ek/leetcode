package com.leetcode.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).mapToObj(candy -> maxCandies <= candy + extraCandies).collect(Collectors.toList());
    }

}