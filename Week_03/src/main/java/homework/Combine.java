package homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * LeetCode-77: 组合
 *
 * @author bingjie.chen
 * @date 2020/7/26
 */
public class Combine {
    private List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || k <= 0) {
            return result;
        }
        List<Integer> stack = new LinkedList<>();
        backtrack(n, k, 1, stack);
        return result;
    }

    private void backtrack(int n, int k, int start, List<Integer> curr) {
        //terminal
        if (curr.size() == k) {
            //clone 并赋值给结果集
            result.add(new LinkedList<>(curr));
            return;
        }
        //sub problem
//        for (int i = start; i <= n; i++) {
        //如何进行剪枝
        for (int i = start; i <= n - (k - curr.size()) + 1; i++) {
            //加入
            curr.add(i);
            //进行递归
            backtrack(n, k, i + 1, curr);
            //删除进行回溯
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combine1(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || n < k) {
            return  res;
        }
        backtrack1(1, n, k, new Stack<>(), res);
        return res;
    }

    private void backtrack1(int start, int n, int k, Stack<Integer> tmp, List<List<Integer>> res) {
        if (tmp.size() == k) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i <= n - (n - tmp.size()) + 1; i++) {
            tmp.push(i);
            backtrack1(i + 1, n, k, tmp, res);
            tmp.pop();
        }
    }

}
