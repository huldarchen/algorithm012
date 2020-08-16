package homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * LeetCode: 广度优先 双向广度优先
 *
 * @author huldar
 * @date 2020-08-13 22:31
 */
public class LadderLength {

    public int ladderLengthUseDoubleBFS(String beginWord, String endWord, List<String> wordList) {

        Set<String> wordSet = new HashSet<>(wordList);

        if (wordSet.isEmpty() || !wordSet.contains(endWord)) {
            return 0;
        }

        Set<String> leftSet = new HashSet<>();
        leftSet.add(beginWord);

        Set<String> rightSet = new HashSet<>();
        rightSet.add(endWord);

        Set<String> visited = new HashSet<>();

        int step = 1;
        int length = beginWord.length();

        while (!leftSet.isEmpty() && !rightSet.isEmpty()) {

            if (leftSet.size() > rightSet.size()) {
                Set<String> tmp = leftSet;
                leftSet = rightSet;
                rightSet = tmp;
            }

            Set<String> newSet = new HashSet<>();

            for (String word : leftSet) {
                char[] chars = word.toCharArray();
                for (int i = 0; i < length; i++) {
                    char origin = chars[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (origin == c) {
                            continue;
                        }
                        chars[i] = c;
                        String nextWord = String.valueOf(chars);
                        if (wordSet.contains(nextWord)) {
                            //TODO 一定要注意这里 并不是和末尾的相等 要在末尾的集合中
                            if (rightSet.contains(nextWord)) {
                                return step + 1;
                            }
                            if (!visited.contains(nextWord)) {
                                newSet.add(nextWord);
                                visited.add(nextWord);
                            }
                        }
                    }
                    chars[i] = origin;
                }
            }
            leftSet = newSet;
            step++;
        }
        return 0;

    }
}
