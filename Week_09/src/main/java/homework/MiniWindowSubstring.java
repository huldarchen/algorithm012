package homework;

/**
 * 最小覆盖子串
 *
 * @author huldar
 * @date 2020-09-13 18:29
 */
public class MiniWindowSubstring {


    public String minWindow1(String s, String t) {
        if (s == null || "".equals(s) || t == null || "".equals(t) || s.length() < t.length()) {
            return "";
        }

        int[] needs = new int[128];
        for (char c : t.toCharArray()) {
            needs[c]++;
        }

        int[] window = new int[128];

        int count = 0, minLength = s.length() + 1;

        int left = 0, right = 0;

        String res = "";

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            window[rightChar]++;
            if (needs[rightChar] > 0 && needs[rightChar] >= window[rightChar]) {
                count++;
            }
            while (count == t.length()) {
                char leftChar = s.charAt(left);
                if (needs[leftChar] > 0 && needs[leftChar] >= window[leftChar]) {
                    count--;
                }
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    res = s.substring(left, right + 1);
                }
                window[leftChar]--;
                left++;
            }
            right++;
        }
        return res;


    }

    public String minWindow(String s, String t) {
        // 构建子串出现次数
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c] += 1;
        }

        int begin = 0, counter = t.length(), len = Integer.MAX_VALUE;

        for (int left = 0, right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map[c]--;
            if (map[c] >= 0) {
                counter--;
            }

            while (counter == 0) {
                char lc = s.charAt(left);
                map[lc]++;
                if (map[lc] > 0) {
                    if (right - left + 1 < len) {
                        begin = left;
                        len = right - left + 1;
                    }
                    counter++;
                }
                left++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(begin, begin + len);
    }


}
