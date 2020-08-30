package day;

/**
 * LeetCode: 最大公共子数组
 *
 * @author huldar
 * @date 2020-08-30 16:58
 */
public class FindLength {
    public int findLengthTwo(int[] A, int[] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0) {
            return 0;
        }
        int rowLength = A.length;
        int colLength = B.length;
        int result = 0;
        int[][] dp = new int[rowLength][colLength];
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                if (A[row] == B[col]) {
                    dp[row + 1][col + 1] = dp[row][col] + 1;
                }
                result = Math.max(result, dp[row + 1][col + 1]);
            }
        }
        return result;

    }

}
