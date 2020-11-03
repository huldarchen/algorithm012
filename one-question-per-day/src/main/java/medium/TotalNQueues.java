package medium;

import java.util.*;

/**
 * N 皇后问题
 *
 * @author huldar
 * @date 2020-11-02 20:14
 */
public class TotalNQueues {

    int count;
    int size;

    public int totalNQueens(int n) {
        count = 0;
        size = (1 << n) - 1;
        dsf(0, 0, 0);
        return count;
    }

    private void dsf(int row, int ld, int rd) {
        if (row == size) {
            count++;
            return;
        }
        int pos = size & (~(row | ld | rd));
        while (pos != 0) {
            int p = pos & (-pos);
            pos -= p;
            dsf(row | p, (ld | p) << 1, (rd | p) >> 1);
        }
    }


    // 声明3个集合 表示列 撇 捺
    Set<Integer> cols;
    Set<Integer> pie;
    Set<Integer> na;

    public List<List<String>> solveNQueens(int n) {
        cols = new HashSet<>();
        pie = new HashSet<>();
        na = new HashSet<>();
        List<List<String>> res = new ArrayList<>();
        dsf(res, new ArrayList<>(), 0, n);
        return res;
    }

    private void dsf(List<List<String>> res, ArrayList<String> tmp, int rowNum, int totalQueens) {
        if (rowNum == totalQueens) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < totalQueens; i++) {
            if (cols.contains(i) || pie.contains(rowNum - i) || na.contains(rowNum + i)) {
                continue;
            }
            char[] chars = new char[totalQueens];
            Arrays.fill(chars, '.');
            chars[i] = 'Q';
            String currRow = new String(chars);
            tmp.add(currRow);

            cols.add(i);
            pie.add(rowNum - i);
            na.add(rowNum + i);

            dsf(res, tmp, rowNum + 1, totalQueens);

            tmp.remove(tmp.size() - 1);
            cols.remove(i);
            pie.remove(rowNum - i);
            na.remove(rowNum + i);
        }
    }

}
