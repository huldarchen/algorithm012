package day;

import java.util.*;

/**
 * LeetCode-126:单词接龙
 *
 * @author huldar
 * @date 2020-08-21 12:20
 */
public class FindLadders {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> wordSet = new HashSet<>(wordList);

        if (wordSet.size() == 0 || !wordSet.contains(endWord)) {
            return 0;
        }

        wordSet.remove(beginWord);

        Set<String> leftQueue = new HashSet<>();
        leftQueue.add(beginWord);

        Set<String> rightQueue = new HashSet<>();
        rightQueue.add(endWord);

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int step = 1;
        int wordLength = beginWord.length();

        while (!leftQueue.isEmpty() && !rightQueue.isEmpty()) {

            // 取数量小的
            if (leftQueue.size() > rightQueue.size()) {
                Set<String> tmp = leftQueue;
                leftQueue = rightQueue;
                rightQueue = tmp;
            }
            Set<String> newLeft = new HashSet<>();

            for (String word : leftQueue) {
                char[] wordCharArrays = word.toCharArray();
                for (int i = 0; i < wordLength; i++) {
                    char origin = wordCharArrays[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (origin == c) {
                            continue;
                        }
                        wordCharArrays[i] = c;
                        String nextWord = String.valueOf(wordCharArrays);
                        if (wordSet.contains(nextWord)) {
                            if (rightQueue.contains(nextWord)) {
                                return step + 1;
                            }
                            if (!visited.contains(nextWord)) {
                                newLeft.add(nextWord);
                                visited.add(nextWord);
                            }
                        }
                    }
                    wordCharArrays[i] = origin;
                }
            }

            step++;
            leftQueue = newLeft;
        }
        return 0;
    }
}
