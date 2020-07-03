package com.leetcode.tasks;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> encodeList = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                encodeList.add(nums[i + 1]);
            }
        }
        return encodeList.stream().mapToInt(i -> i).toArray();
    }

}
