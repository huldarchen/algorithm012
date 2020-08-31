package day;

import java.util.Arrays;

/**
 * LeetCode:字符串中第一个唯一字符
 *
 * @author huldar
 * @date 2020-08-31 18:58
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {
        if (s == null ||  s.length() == 0) {
            return -1;
        }
        int[] chars = new int[256];
        for (char c : s.toCharArray()) {
            chars[c] = chars[c] + 1;
        }
        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}
