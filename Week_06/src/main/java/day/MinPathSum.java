package day;

import java.util.Arrays;

/**
 * LeetCode-64: 最小路径和
 *
 * @author huldar
 * @date 2020-08-10 12:12
 */
public class MinPathSum {

    private int rowLength, colLength;
    /** 记忆化 */
    private int[][] memo;

    /**
     * 最小路径和-分治
     */
    public int minPathSumUseRecursion(int[][] grid) {
        rowLength = grid.length;
        colLength = grid[0].length;
        memo = new int[rowLength][colLength];
        for (int i = 0; i < rowLength; i++) {
            Arrays.fill(memo[i],  -1);
        }
        return recursion(grid,0, 0);
    }


    private int recursion(int[][] grid, int row, int col) {
       // termination
        if(row < 0 || row>= rowLength || col < 0 || col >= colLength) {
            return Integer.MAX_VALUE;
        }
        if (memo[row][col] > -1) {
            return memo[row][col];
        }

        if (row == rowLength - 1 && col == colLength - 1) {
            return grid[rowLength - 1][colLength - 1];
        }
        int right = recursion(grid, row, col + 1);
        int down = recursion(grid, row + 1, col);

        int result = Math.min(right, down) + grid[row][col];
        memo[row][col] = result;
        return result;

    }

    /**
     * 最小路径-使用dp
     */
    public int minPathSumUseDP(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int rowLength = grid.length, colLength = grid[0].length;
        int[][] dp = new int[rowLength][colLength];

        dp[0][0] = grid[0][0];

        for (int row = 1; row < rowLength; row++) {
            dp[row][0] = dp[row - 1][0] + grid[row][0];
        }

        for (int col = 1; col < colLength; col++) {
            dp[0][col] = dp[0][col - 1] + grid[0][col];
        }

        for (int row = 1; row < rowLength; row++) {
            for (int col = 1; col < colLength; col++) {
                dp[row][col] = Math.min(dp[row - 1][col], dp[row][col - 1]) + grid[row][col];
            }
        }
        return dp[rowLength - 1][colLength - 1];
    }

}
