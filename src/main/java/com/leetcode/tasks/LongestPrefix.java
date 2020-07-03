package com.leetcode.tasks;

public class LongestPrefix {

    public static void main(String[] args) {
        LongestPrefix longestPrefix = new LongestPrefix();
        System.out.println(longestPrefix.longestCommonPrefix(new String[]{"ac", "ac", "a", "a"}));
    }


    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int counter = 0;
        StringBuilder[] stringBuilderArray = new StringBuilder[strs.length - 1];
        String firstLine = strs[0];
        for (int i = 1; i < strs.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if (strs[i].isEmpty()) {
                return "";
            }
            for (int j = 0; j < strs[i].length() && j < firstLine.length(); j++) {
                if (firstLine.charAt(j) == strs[i].charAt(j)) {
                    stringBuilder.append(firstLine.charAt(j));
                }
            }
            stringBuilderArray[counter++] = stringBuilder;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (StringBuilder builder : stringBuilderArray) {
            if (stringBuilder.length() < builder.length()) {
                stringBuilder = builder;
            }
        }
        for (StringBuilder builder : stringBuilderArray) {
            String line = builder.toString();
            counter = 0;
            for (String str : strs) {
                if (line.length() > str.length()) {
                    break;
                }
                for (int k = 0; k < str.length() && k < line.length(); k++) {
                    if (str.charAt(k) != line.charAt(k)) {
                        counter = 0;
                        break;
                    }
                }
                counter++;
            }
            if (counter == strs.length) {
                return builder.toString();
            }
        }
        return "";
    }

}
