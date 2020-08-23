package homework;

import java.util.*;

/**
 * LeetCode:单词搜索
 *
 * @author huldar
 * @date 2020-08-23 17:21
 */
public class FindWords {
    private final int[][] dirs = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public List<String> findWords(char[][] board, String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        WordTrie trie = new WordTrie();
        TrieNode root = trie.root;

        for (String word : words) {
            trie.insert(word);
        }
        //使用set防止重复
        Set<String> result = new HashSet<>();
        int rowLength = board.length;
        int colLength = board[0].length;
        boolean[][] visited = new boolean[rowLength][colLength];

        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                find(board, row, col, rowLength, colLength, visited, root, result);
            }
        }
        return new LinkedList<>(result);
    }

    private void find(char[][] board, int row, int col, int rowLength, int colLength, boolean[][] visited, TrieNode cur, Set<String> result) {
        if (row < 0 || col < 0 || row >= rowLength || col >= colLength || visited[row][col]) {
            return;
        }
        cur = cur.child[board[row][col] - 'a'];
        visited[row][col] = true;
        if (cur == null) {
            //如果单词不匹配，回退
            visited[row][col] = false;
            return;
        }

        if (cur.isLeaf) {
            result.add(cur.val);
        }
        for (int[] dir : dirs) {
            find(board, row + dir[0], col + dir[1], rowLength, colLength, visited, cur, result);
        }

        visited[row][col] = false;
    }
}

//字典树
class WordTrie {
    public TrieNode root = new TrieNode();

    public void insert(String s) {
        TrieNode cur = root;
        for (char c : s.toCharArray()) {
            if (cur.child[c - 'a'] == null) {
                cur.child[c - 'a'] = new TrieNode();
            }
            cur = cur.child[c - 'a'];
        }
        cur.isLeaf = true;
        cur.val = s;
    }
}

//字典树结点
class TrieNode {
    public String val;
    public TrieNode[] child = new TrieNode[26];
    public boolean isLeaf = false;

    TrieNode() {

    }
}
