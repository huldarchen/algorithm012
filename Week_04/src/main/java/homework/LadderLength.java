package homework;

import java.util.*;

/**
 * LeetCode-127: 单词接龙
 * 广度优先
 *
 * @author huldar
 * @date 2020-08-01 11:05
 */
public class LadderLength {

    /** 使用广度优先 */
    public int ladderLengthUseBFS(String beginWord, String endWord, List<String> wordList) {
        //构建字典
        Set<String> wordSet = new HashSet<>(wordList);
        if (wordSet.size() == 0 || !wordSet.contains(endWord)) {
            return 0;
        }
        wordSet.remove(beginWord);

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        int step = 1;
        int wordLen = beginWord.length();

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                char[] charArray = word.toCharArray();
                for (int j = 0; j < wordLen; j++) {
                    char origin = charArray[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == origin) {
                            continue;
                        }
                        charArray[j] = c;
                        String nextWord = String.valueOf(charArray);
                        if (wordSet.contains(nextWord)) {
                            if (nextWord.equals(endWord)) {
                                return step + 1;
                            }
                            if (!visited.contains(nextWord)) {
                                queue.add(nextWord);
                                visited.add(nextWord);
                            }
                        }
                    }
                    charArray[j] = origin;
                }
            }
            step++;
        }
        return 0;
    }
}
