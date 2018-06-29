package me.winterfall.array;

/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/22/
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        int[] upDown = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            upDown[i] = prices[i] - prices[i-1];
        }
        int profit = 0;
        for (int i = 1; i < upDown.length; i++) {
            if (upDown[i] > 0) {
                profit += upDown[i];
            }
        }
        return profit;
    }
}
