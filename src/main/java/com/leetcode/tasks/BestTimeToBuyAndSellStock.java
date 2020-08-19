package com.leetcode.tasks;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int minimum = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if ((prices[i] - minimum) > profit) {
                profit = prices[i] - minimum;
            }
            if (prices[i] < minimum) {
                minimum = prices[i];
            }
        }
        return profit;
    }

}
