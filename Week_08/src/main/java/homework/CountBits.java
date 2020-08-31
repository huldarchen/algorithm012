package homework;

/**
 * leetCode: 比特位计数
 *
 * @author huldar
 * @date 2020-08-31 23:01
 */
public class CountBits {


    public int[] countBits(int num) {
        if (num == 0) {
            return new int[]{0};
        }
        int[] dp = new int[num + 1];
        dp[0] = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & 1) == 0) {
                dp[i] = dp[i >> 1];
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }
        return dp;
    }
}
