package homework;

import util.PrintArrays;

/**
 * LeetCode-1143: 最长公共子序列
 *
 * @author huldar
 * @date 2020-08-12 23:55
 */
public class LongestCommonSubsequence {

    public int longestCommonSubsequenceUseDP(String text1, String text2) {
        int rowLength = text1.length();
        int colLength = text2.length();
        int[][] dp = new int[rowLength + 1][colLength + 1];
        for (int row = 1; row <= rowLength; row++) {
            for (int col = 1; col <= colLength; col++) {
                dp[row][col] = Math.max(dp[row - 1][col], dp[row][col - 1]);
                if (text1.charAt(row - 1) == text2.charAt(col - 1)) {
                    dp[row][col] = Math.max(dp[row][col], dp[row - 1][col - 1] + 1);
                }
            }
        }
        PrintArrays.printIntArrays(dp);
        return dp[rowLength][colLength];

    }
}
