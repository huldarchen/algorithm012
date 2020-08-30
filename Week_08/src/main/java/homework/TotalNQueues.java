package homework;

/**
 * LeetCode: N皇后问题
 *
 * @author huldar
 * @date 2020-08-30 11:16
 */
public class TotalNQueues {
    private int size;
    private int count;

    public int totalNQueues(int n) {
        count = 0;
        size = (1 << n) - 1;
        dfs(0, 0, 0);
        return count;
    }

    private void dfs(int row, int ld, int rd) {
        if (row == size) {
            count++;
            return;
        }
        System.out.println(
                "row: " + Integer.toBinaryString(row) +
                        " ld: " + Integer.toBinaryString(ld) +
                        " rd: " + Integer.toBinaryString(rd) +
                        " size: " + Integer.toBinaryString(size)
        );
        int pos = size & (~(row | ld | rd));

        while (pos != 0) {
            System.out.println("pos: " + Integer.toBinaryString(pos));
            int p = pos & (-pos);
            System.out.println("p: " + Integer.toBinaryString(p));
            pos -= p;
            dfs(row | p, (ld | p) << 1, (rd | p) >> 1);
        }
    }
}
