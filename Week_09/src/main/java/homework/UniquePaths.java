package homework;

import java.util.Arrays;

/**
 * 不同路径
 *
 * @author huldar
 * @date 2020-09-13 22:30
 */
public class UniquePaths {


    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        //初始化
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m][n];
    }
    public int uniquePaths2(int m, int n) {
        int[] dp = new int[m];
        Arrays.fill(dp, 1);
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j -1];
            }
        }
        return dp[m - 1];
    }
}
