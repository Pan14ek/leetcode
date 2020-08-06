package com.leetcode.tasks;

import java.util.LinkedList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();
        System.out.println(findAllDuplicatesInAnArray.findDuplicates(nums));
    }

    //second solution
    public List<Integer> findDuplicates(int[] nums) {
        int[] counterArray = new int[nums.length + 1];
        List<Integer> duplicatesNumbers = new LinkedList<>();
        for (int num : nums) {
            counterArray[num]++;
        }
        for (int i = 0; i < counterArray.length; i++) {
            if (counterArray[i] > 1) {
                duplicatesNumbers.add(i);
            }
        }
        return duplicatesNumbers;
    }

    //first solution
//    public List<Integer> findDuplicates(int[] nums) {
//        Set<Integer> numbers = new HashSet<>();
//        List<Integer> duplicatesNumbers = new ArrayList<>();
//        for (int num : nums) {
//            if (numbers.contains(num)) {
//                duplicatesNumbers.add(num);
//            } else {
//                numbers.add(num);
//            }
//        }
//        return duplicatesNumbers;
//    }

}
