package day;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode:寻找单词
 *
 * @author huldar
 * @date 2020-08-16 20:24
 */
public class FindWordsI {

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        //判断每个单词
        for (String word : words) {
            if (exist(board, word)) {
                res.add(word);
            }
        }
        return res;
    }

    private boolean exist(char[][] board, String word) {
        int rowLength = board.length;
        if (rowLength == 0) {
            return false;
        }
        int colLength = board[0].length;
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                if (existRecursive(board, row, col, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean existRecursive(char[][] board, int row, int col, String word, int index) {
        // 递归出口
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return false;
        }
        if (board[row][col] != word.charAt(index)) {
            return false;
        }
        if (index == word.length() - 1) {
            return true;
        }

        char temp = board[row][col];
        board[row][col] = '$';

        //判断四周进行dfs
        boolean up = existRecursive(board, row - 1, col, word, index + 1);
        if (up) {
            board[row][col] = temp;
            return true;
        }

        boolean down = existRecursive(board, row + 1, col, word, index + 1);
        if (down) {
            board[row][col] = temp;
            return true;
        }

        boolean left = existRecursive(board, row, col - 1, word, index + 1);
        if (left) {
            board[row][col] = temp;
            return true;
        }

        boolean right = existRecursive(board, row, col + 1, word, index + 1);
        if (right) {
            board[row][col] = temp;
            return true;
        }
        board[row][col] = temp;
        return false;
    }
}
