package day;

/**
 * LeetCode-130:被围绕的区域
 *
 * @author huldar
 * @date 2020-08-19 12:18
 */
public class Solve {

    private final int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        int rowLength = board.length;
        int colLength = board[0].length;
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                boolean isEdges = row == 0 || col == 0 || row == rowLength - 1 || col == colLength - 1;
                if (isEdges && board[row][col] == 'O') {
                    dfs(board, row, col, rowLength, colLength);
                }
            }
        }
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
               if (board[row][col] == 'O') {
                   board[row][col] = 'X';
               }
                if (board[row][col] == '#') {
                    board[row][col] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col, int rowLength, int colLength) {
        // 递归出口
        if (row < 0 || row >= rowLength || col < 0 || col >= colLength || board[row][col] == 'X' || board[row][col] == '#') {
            return;
        }
        board[row][col] = '#';
        for (int[] dire : direction) {
            dfs(board, row + dire[0], col + dire[1], rowLength, colLength);
        }
    }
}
