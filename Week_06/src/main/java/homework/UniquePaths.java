package homework;

import static util.PrintArrays.printIntArrays;

/**
 * LeetCode-62: 不同路径
 *
 * @author huldar
 * @date 2020-08-11 23:01
 */
public class UniquePaths {

    /**
     * 不同路径 无障碍物
     * 自顶向上DP
     */
    public int uniquePathsUseDPDownUp(int m, int n) {
        if (m < 0 || n < 0) {
            return 0;
        }
        int[][] dp = new int[m][n];
        // 初始化
        for (int i = 0; i < m; i++) {
            dp[i][n - 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            dp[m - 1][i] = 1;
        }

        printIntArrays(dp);
        for (int row = m - 2; row >= 0; row--) {
            for (int col = n - 2; col >= 0; col--) {
                dp[row][col] = dp[row + 1][col] + dp[row][col + 1];
            }
        }
        printIntArrays(dp);
        return dp[0][0];
    }

    public int uniquePathsUseDPUpDown(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 0;

        for (int row = 1; row < m; row++) {
            dp[row][0] = 1;
        }
        for (int col = 0; col < n; col++) {
            dp[0][col] = 1;
        }

        printIntArrays(dp);
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                dp[row][col] = dp[row - 1][col] + dp[row][col - 1];
            }
        }
        printIntArrays(dp);
        return dp[m - 1][n - 1];
    }

    public int uniquePathsWithObstaclesUseDPDownUp(int[][] obstacleGrid) {
        if (obstacleGrid == null) {
            return 0;
        }
        int rowLength = obstacleGrid.length;
        if (rowLength == 0) {
            return 0;
        }
        int colLength = obstacleGrid[0].length;
        int[][] dp = new int[rowLength][colLength];
        for (int row = 0; row < rowLength && obstacleGrid[row][0] == 0; row++) {
            dp[row][0] = 1;
        }
        for (int col = 0; col < colLength && obstacleGrid[0][col] == 0; col++) {
            dp[0][col] = 1;
        }
        printIntArrays(dp);
        for (int row = 1; row < rowLength; row++) {
            for (int col = 1; col < colLength; col++) {
                if (obstacleGrid[row][col] == 0) {
                    dp[row][col] = dp[row - 1][col] + dp[row][col - 1];
                }
            }
        }
        printIntArrays(dp);
        return dp[rowLength - 1][colLength - 1];
    }


}
