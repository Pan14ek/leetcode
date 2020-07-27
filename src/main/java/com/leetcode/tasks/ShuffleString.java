package com.leetcode.tasks;

public class ShuffleString {

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        ShuffleString shuffleString = new ShuffleString();
        System.out.println(shuffleString.restoreString(s, indices));
    }


    public String restoreString(String s, int[] indices) {
        char[] sCharArray = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            sCharArray[indices[i]] = s.charAt(i);
        }
        return String.valueOf(sCharArray);
    }

}
