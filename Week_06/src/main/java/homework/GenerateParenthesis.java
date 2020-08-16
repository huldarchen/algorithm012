package homework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * LeetCode: 生成括号DP解法
 *
 * @author huldar
 * @date 2020-08-12 22:59
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<List<String>> dp = new LinkedList<>();
        dp.add(Collections.singletonList(""));
        dp.add(Collections.singletonList("()"));

        for (int i = 2; i <= n; i++) {
            List<String> newList = new LinkedList<>();
            for (int j = 0; j < i; j++) {
                List<String> insides = dp.get(j);
                System.out.println(insides);
                List<String> tails = dp.get(i - j - 1);
                System.out.println(tails);
                for (String inside : insides) {
                    for (String tail : tails) {
                        newList.add("(" + inside + ")" + tail);
                    }
                }
            }
            dp.add(newList);
        }

        return dp.get(n);
    }
}
