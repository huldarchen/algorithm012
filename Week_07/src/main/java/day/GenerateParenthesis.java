package day;

import java.util.LinkedList;
import java.util.List;

/**
 * LeetCode:括号生成
 *
 * @author huldar
 * @date 2020-08-23 17:13
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        if (n <= 0) {
            return result;
        }
        dfs(result, "", 0, 0, n);
        return result;
    }

    private void dfs(List<String> result, String tmp, int left, int right, int n) {
        if (left == n && right == n) {
            result.add(tmp);
            return;
        }

        if (left <= n) {
            dfs(result, tmp + "(", left + 1, right, n);
        }

        if (right < left) {
            dfs(result, tmp + ")", left, right + 1, n);
        }
    }
}
