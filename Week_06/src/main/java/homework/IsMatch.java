package homework;

import java.util.Arrays;

/**
 * 字符串正则匹配
 *
 * @author huldar
 * @date 2020-08-10 23:31
 */
public class IsMatch {

    public boolean isMatchUseDPDownUp(String s, String p) {
        int sLength = s.length();
        int pLength = p.length();
        boolean[][] dp = new boolean[sLength + 1][pLength + 1];
        dp[sLength][pLength] = true;
        printArrays(dp);
        for (int i = sLength; i >= 0; i--) {
            for (int j = pLength - 1; j >= 0; j--) {
                boolean charMatch = i < sLength && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
                if (j < pLength - 1 && p.charAt(j + 1) == '*') {
                    dp[i][j] = dp[i][j + 2] || charMatch && dp[i + 1][j];
                } else {
                    dp[i][j] = charMatch && dp[i + 1][j + 1];
                }
            }
        }
        printArrays(dp);
        return dp[0][0];
    }

    public boolean isMatchUseDPUp2Down(String s, String p) {
        // 二维数组进行设定状态
        int sLength = s.length();
        int pLength = p.length();
        boolean[][] dp = new boolean[sLength + 1][pLength + 1];
        dp[0][0] = true;
        for (int i = 2; i <= pLength; i++) {
            // 思考下为什么?
            dp[0][i] = p.charAt(i - 1) == '*' && dp[0][i - 2];
        }
        printArrays(dp);
        for (int i = 0; i < sLength; i++) {
            for (int j = 0; j < pLength; j++) {
                if (p.charAt(j) == '*') {
                    dp[i + 1][j + 1] = dp[i + 1][j - 1] ||
                            (dp[i + 1][j] && headMatched(s, p, i, j -1));
                } else {
                    dp[i + 1][j + 1] = dp[i][j] && headMatched(s, p, i, j);
                }
            }
        }
        printArrays(dp);
        return dp[sLength][pLength];
    }

    private void printArrays(boolean[][] dp) {
        for (boolean[] booleans : dp) {
            System.out.print(Arrays.toString(booleans));
            System.out.println();
        }
        System.out.println();
    }

    private boolean headMatched(String s, String p, int i, int j) {
        return s.charAt(i)==p.charAt(j)||p.charAt(j)=='.';
    }
}
