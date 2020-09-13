package homework;

/**
 * 解码方法
 *
 * @author huldar
 * @date 2020-09-13 14:01
 */
public class DecodeWays {
    public int numDecodings(String s) {
//        if (s == null || s.length() == 0) {
//            return 0;
//        }
//        int n = s.length();
//        int[] dp = new int[n + 1];
//        dp[0] = 1;
//        dp[1] = s.charAt(0) != '0' ? 1 : 0;
//        for (int i = 2; i <= n; i++) {
//            int first = Integer.parseInt(s.substring(i - 1, i));
//            int second = Integer.parseInt(s.substring(i - 2, i));
//            if (first >= 1 && first <= 9) {
//                dp[i] += dp[i-1];
//            }
//            if (second >= 10 && second <= 26) {
//                dp[i] += dp[i-2];
//            }
//        }
//        return dp[n];
//        int n = s.length();
//        if (n == 0) {
//            return 0;
//        }
//
//        int[] dp = new int[n + 1];
//        dp[n] = 1;
//        dp[n - 1] = s.charAt(n - 1) != '0' ? 1 : 0;
//
//        for (int i = n - 2; i >= 0; i--) {
//            if (s.charAt(i) != '0') {
//                dp[i] = (Integer.parseInt(s.substring(i, i + 2)) <= 26) ? dp[i + 1] + dp[i + 2] : dp[i + 1];
//            }
//        }
//
//        return dp[0];

//
//        int len = s.length();
//        if (len == 0 || "0".equals(s)) {
//            return 0;
//        }
//        char[] c = s.toCharArray();
//        int[] dp = new int[len];
//        if (c[0] == '0') {
//            return 0;
//        }
//        dp[0] = 1;
//        for (int i = 1; i < dp.length; i++) {
//            if (c[i] != '0') {
//                dp[i] = dp[i - 1];
//            }
//            int num = (c[i - 1] - '0') * 10 + c[i] - '0';
//            if (num <= 26 && num >= 10) {
//                if (i == 1) {
//                    dp[i]++;
//                } else {
//                    dp[i] += dp[i - 2];
//                }
//            }
//        }
//        return dp[len - 1];


        int f1 = 1, f2 = 1, f3 = 0;
        if (s.length() == 0 || s.charAt(0) == '0') return 0;
        for (int i = 2; i <= s.length(); i++) {
            f3 = 0;
            if (s.charAt(i - 1) != '0') f3 = f2;
            int num = (s.charAt(i - 2) - '0') * 10 + s.charAt(i - 1) - '0';
            if (num >= 10 && num <= 26) f3 += f1;
            f1 = f2;
            f2 = f3;
        }
        return f2;
    }
}
