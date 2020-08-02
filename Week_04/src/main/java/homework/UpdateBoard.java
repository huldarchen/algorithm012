package homework;

/**
 * LeetCode-529:扫雷游戏
 *
 * @author huldar
 * @date 2020-07-29 20:05
 */
public class UpdateBoard {

    /** 移动的方向 */
    private final int[][] dirs = {
            {1, 0}, {0, 1},
            {-1, 0}, {0, -1},
            {1, 1}, {-1, -1},
            {-1, 1}, {1, -1}
    };

    public char[][] updateBoard(char[][] board, int[] click) {
        int rowLength = board.length;
        int colLength = board[0].length;
        int row = click[0], col = click[1];
        if (board[row][col] == 'M' || board[row][col] == 'X') {
            board[row][col] = 'X';
            return board;
        }
        int num = 0;
        for (int[] dir : dirs) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (newRow > 0 && newCol > 0 && newRow < rowLength && newCol < colLength && board[newRow][newCol] == 'M') {
                num++;
            }
        }
        if (num > 0) {
            board[row][col] = (char) (num + '0');
            return board;
        } else {
            board[row][col] = 'B';
        }

        for (int[] dir : dirs) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (newRow >= 0 && newCol >=0 && newRow < rowLength && newCol < colLength && board[newRow][newCol] == 'E') {
                updateBoard(board, new int[]{newRow, newCol});
            }
        }
        return board;
    }
}
