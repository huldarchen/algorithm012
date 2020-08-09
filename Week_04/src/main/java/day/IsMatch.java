package day;

/**
 * LeetCode-19: 正则匹配
 *
 * @author huldar
 * @date 2020-08-09 20:34
 */
public class IsMatch {
    public boolean isMatch(String s, String p) {
        // 递归的出口
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        boolean headMatched = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // 两种情况 1.匹配到0个 2.匹配到多个 前提是第一个能匹配到
            return isMatch(s, p.substring(2)) || (headMatched && isMatch(s.substring(1), p));
        } else if (headMatched) {
            return isMatch(s.substring(1), p.substring(1));
        } else {
            return false;
        }
    }
}
