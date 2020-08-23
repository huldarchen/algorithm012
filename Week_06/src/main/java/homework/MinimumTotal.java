package homework;

import java.util.List;

/**
 * LeetCode-120:三角形最小路径和
 *
 * @author huldar
 * @date 2020-08-16 21:24
 */
public class MinimumTotal {
    int rowLength;
    Integer[][] memo;

    public int minimumTotalUseDivide(List<List<Integer>> triangle) {
        rowLength = triangle.size();
        memo = new Integer[rowLength][rowLength];
        return helper(0, 0, triangle);
    }

    private int helper(int row, int col, List<List<Integer>> triangle) {
        if (memo[row][col] != null) {
            return memo[row][col];
        }
        if (row == rowLength - 1) {
            return memo[row][col] = triangle.get(row).get(col);
        }
        int left = helper(row + 1, col, triangle);
        int right = helper(row + 1, col + 1, triangle);

        return memo[row][col] = Math.min(left, right) + triangle.get(row).get(col);

    }

    /** 自底向上 二维dp数组 */
    public int minimumTotalUseDPBottomToUp1(List<List<Integer>> triangle) {
        int rowLength = triangle.size();
        int[][] dp = new int[rowLength][rowLength];

        for (int row = rowLength - 1; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                dp[row][col] = Math.min(dp[row + 1][col], dp[row + 1][col + 1]) + triangle.get(row).get(col);
            }
        }
        return dp[0][0];
    }

    /** 自底向上 二维dp数组 */
    public int minimumTotalUseDPBottomToUp2(List<List<Integer>> triangle) {
        int rowLength = triangle.size();
        int[] dp = new int[rowLength + 1];
        for (int row = triangle.size() - 1; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                dp[col] = Math.min(dp[col], dp[col + 1]) + triangle.get(row).get(col);
            }
        }
        return dp[0];
    }


}
