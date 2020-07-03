package com.leetcode.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CreateTargetArrayInTheGivenOrder {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> integers = new ArrayList<>();
        IntStream.range(0, nums.length).forEach(i -> integers.add(index[i], nums[i]));
        return integers.stream().mapToInt(i -> i).toArray();
    }

}
