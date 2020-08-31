package day;

import java.lang.reflect.Array;
import java.util.*;

/**
 * LeetCode:N皇后
 *
 * @author huldar
 * @date 2020-08-31 19:22
 */
public class Queens {
    //列 撇 捺

    private Set<Integer> cols;
    private Set<Integer> pie;
    private Set<Integer> na;

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }
        cols = new HashSet<>();
        pie = new HashSet<>();
        na = new HashSet<>();
        queensDfs(result, new ArrayList<>(), 0, n);
        return result;
    }

    private void queensDfs(List<List<String>> result, ArrayList<String> tmp, int row, int total) {
        if (row == total) {
            result.add(new ArrayList<>(tmp));
            return;
        }

        for (int col = 0; col < total; col++) {
            if (cols.contains(col) || pie.contains(row + col) || na.contains(row - col)) {
                continue;
            }
            char[] chars = new char[total];
            Arrays.fill(chars, '.');
            chars[col] = 'Q';

            tmp.add(String.valueOf(chars));
            cols.add(col);
            pie.add(row + col);
            na.add(row - col);

            queensDfs(result, tmp, row + 1, total);

            tmp.remove(tmp.size() - 1);
            cols.remove(col);
            pie.remove(row + col);
            na.remove(row - col);
        }

    }

    private int size;
    private int count;

    public int queensCount(int n) {
        if (n <= 0) {
            return 0;
        }
        count = 0;
        // 获取到n皇后
        size = (1 << n) - 1;
        queensCountDfs(0, 0, 0);
        return count;
    }

    private void queensCountDfs(int row, int ld, int rd) {
        if (row == size) {
            count++;
            return;
        }

        int pos = (~(row | ld | rd)) & size;
    }


}
