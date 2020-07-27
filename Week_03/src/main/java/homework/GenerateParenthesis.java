package homework;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode-22:括号生成
 * 递归经典
 *
 * @author bingjie.chen
 * @date 2020/7/20
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) {
            return null;
        }
        recursion(result, 0, 0, n, "");
        return result;
    }

    private void recursion(List<String> result, int left, int right, int n, String str) {
        //terminal
        if (left == n && right == n) {
            result.add(str);
        }
        //process drill down
        if (left < n) {

            recursion(result, left + 1, right, n, str + "(");
        }
        if (right < left) {
            recursion(result, left, right + 1, n, str + ")");
        }
        //reverse status
    }

}
