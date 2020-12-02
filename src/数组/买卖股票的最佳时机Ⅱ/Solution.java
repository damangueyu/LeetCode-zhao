package 数组.买卖股票的最佳时机Ⅱ;

/**
 * @desc:
 * @author: 21927
 * @date: 2020/12/2 14:39
 */
public class Solution {
    /**
     * @desc: 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
     * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     * @author: 21927
     * @date: 2020/12/2 15:02
     */
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < prices[i + 1]) {
               maxProfit += prices[i+1] - prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println("最大利润为："+maxProfit(prices));
    }
}
