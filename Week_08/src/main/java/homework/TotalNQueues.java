package homework;


import java.util.*;

/**
 * LeetCode: N皇后问题
 *
 * @author huldar
 * @date 2020-08-30 11:16
 */
public class TotalNQueues {
    private int size;
    private int count;

    private Set<Integer> cols;
    private Set<Integer> pie;
    private Set<Integer> na;


    public List<List<String>> solveNQueens(int n) {
        cols = new HashSet<>();
        pie = new HashSet<>();
        na = new HashSet<>();
        List<List<String>> result = new ArrayList<>();

        solveNQueensDfs(result, new ArrayList<String>(), 0, n);
        return result;

    }

    private void solveNQueensDfs(List<List<String>> result, ArrayList<String> rowString, int rowNum, int totalQueens) {
        if (rowNum == totalQueens) {
            result.add(new ArrayList<>(rowString));
            return;
        }
        for (int i = 0; i < totalQueens; i++) {
            if (cols.contains(rowNum) || pie.contains(rowNum + i) || na.contains(rowNum - i)) {
                continue;
            }
            char[] chars = new char[totalQueens];
            Arrays.fill(chars, '.');
            chars[i] = 'Q';
            String rowStr = new String(chars);

            rowString.add(rowStr);
            cols.add(i);
            pie.add(rowNum + i);
            na.add(rowNum - i);

            solveNQueensDfs(result, rowString, rowNum + 1, totalQueens);

            rowString.remove(rowString.size() - 1);
            cols.remove(i);
            pie.remove(rowNum + i);
            na.remove(rowNum - i);
        }

    }

    public int totalNQueues(int n) {
        count = 0;
        size = (1 << n) - 1;
        totalNQueuesDFS(0, 0, 0);
        return count;
    }

    private void totalNQueuesDFS(int row, int ld, int rd) {
        if (row == size) {
            count++;
            return;
        }
        System.out.println(
                "row: " + Integer.toBinaryString(row) + " int: " + row +
                        " ld: " + Integer.toBinaryString(ld) + " int: " + ld +
                        " rd: " + Integer.toBinaryString(rd) + " int: " + rd
        );
        System.out.println("size: " + Integer.toBinaryString(size));
        int pos = size & (~(row | ld | rd));

        while (pos != 0) {
            System.out.println("pos: " + Integer.toBinaryString(pos) + " -pos: " + Integer.toBinaryString(-pos));
            int p = pos & (-pos);
            System.out.println("p: " + Integer.toBinaryString(p));
            pos -= p;
            totalNQueuesDFS(row | p, (ld | p) << 1, (rd | p) >> 1);
        }
    }
}
