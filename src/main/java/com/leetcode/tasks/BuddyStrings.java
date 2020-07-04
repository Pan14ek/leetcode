package com.leetcode.tasks;

public class BuddyStrings {

    public static void main(String[] args) {
        BuddyStrings buddyStrings = new BuddyStrings();
        System.out.println(buddyStrings.buddyStrings("aaaaaaaaaaaaaaaacb", "aaaaaaaaaaaaaaaabc"));
    }

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        int diff = 0;
        int count = 0;

        int[] letters = new int[256];
        for (int i = 0; i < A.length(); i++) {
            letters[A.charAt(i)]++;
            if (A.charAt(i) != B.charAt(i)) {
                diff += A.charAt(i) - B.charAt(i);
                count++;
            }
        }
        if (A.equals(B)) {
            for (int l : letters) {
                if (l > 1)
                    return true;
            }
        }

        return count == 2 && diff == 0;
    }

}
