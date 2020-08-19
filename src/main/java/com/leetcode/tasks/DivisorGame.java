package com.leetcode.tasks;

public class DivisorGame {

    public static void main(String[] args) {
        DivisorGame divisorGame = new DivisorGame();
        System.out.println(divisorGame.divisorGame(3));
    }

    public boolean divisorGame(int N) {
        boolean swapFlag = false;
        while (N > 0) {
            if (swapFlag) {
                if (N == 1) {
                    return true;
                }
                swapFlag = false;
            } else {
                if (N == 1) {
                    return false;
                }
                swapFlag = true;
            }
            N -= 1;
        }
        return false;
    }

}
