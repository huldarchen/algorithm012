package homework;

/**
 * LeetCode-200: 岛屿的数量
 *
 * @author huldar
 * @date 2020-07-29 19:40
 */
public class NumIsLands {

    private int rowLength;
    private int colLength;
    private final int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int numIslands(char[][] grid) {
        int count = 0;
        rowLength = grid.length;
        if (rowLength == 0) {
            return count;
        }
        colLength = grid[0].length;
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                if (grid[row][col] == '1') {
                    dfsMarking(grid, row, col);
                    ++count;
                }
            }
        }
        return count;
    }

    private void dfsMarking(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= rowLength || col >= colLength || grid[row][col] != '1') {
            return;
        }
        grid[row][col] = '0';
        for (int[] dir : dirs) {
            dfsMarking(grid, row + dir[0], col + dir[1]);
        }
    }
}
