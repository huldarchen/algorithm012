package homework;

/**
 * LeetCode-122: 买卖股票的最佳时机
 * 贪心算法
 * @author huldar
 * @date 2020-08-01 10:42
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i -1]) {
                max += prices[i] - prices[i - 1];
            }
        }
        return  max;
    }
}
