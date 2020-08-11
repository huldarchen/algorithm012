package homework;

import java.util.Arrays;

/**
 * LeetCode-322: 零钱兑换
 *
 * @author huldar
 * @date 2020-08-11 12:17
 */
public class CoinChange {
    /**
     * 使用DP自上而下 状态转移方程是 F(n) = min(F(n-c1), F(n-c2), F(n-c3)) + 1
     */
    public int coinChangeUseDPUp2Down(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        // 初始化dp数组
        Arrays.fill(dp, max);
        dp[0] = 0;
        System.out.println(Arrays.toString(dp));
        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[amount] > amount ? -1 : dp[amount];

    }
}
