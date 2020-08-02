package homework;

import java.util.*;

/**
 * LeetCode-433:最小基因变化
 *
 * @author huldar
 * @date 2020-08-01 16:34
 */
public class MinMutation {

    private static final char[] DISC = {'A', 'C', 'G', 'T'};
    private int minStep = Integer.MIN_VALUE;

    /**
     * 最小基因变化
     *
     * @param start 开始基因
     * @param end   目标基因
     * @param bank  基因库
     * @return 最小变化距离,-1表示无法变化
     */
    public int minMutationUseBFS(String start, String end, String[] bank) {
        if (bank == null) {
            return -1;
        }
        //BFS算法
        Set<String> mutationSet = new HashSet<>(Arrays.asList(bank));
        mutationSet.remove(start);
        if (!mutationSet.contains(end)) {
            return -1;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(start);

        Set<String> visited = new HashSet<>();
        visited.add(start);

        int step = 0;
        while (!queue.isEmpty()) {
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                String mutation = queue.poll();
                char[] charArray = mutation.toCharArray();
                for (int j = 0; j < charArray.length; j++) {
                    char origin = charArray[j];
                    for (char c : DISC) {
                        charArray[j] = c;
                        String nextMutation = String.valueOf(charArray);
                        if (mutationSet.contains(nextMutation)) {
                            if (end.equals(nextMutation)) {
                                return step + 1;
                            }
                            if (!visited.contains(nextMutation)) {
                                queue.offer(nextMutation);
                                visited.add(nextMutation);
                            }
                        }
                    }
                    charArray[j] = origin;
                }
            }
            step++;
        }
        return -1;
    }

    public int minMutationUseDFS(String start, String end, String[] bank) {
        //DFS 递归
        dfs(new HashSet<>(),0, start, end, bank);
        return minStep == Integer.MIN_VALUE ? -1 : minStep;
    }

    private void dfs(HashSet<String> step, int stepCount, String current, String end, String[] bank) {
        if (current.equals(end)) {
            minStep = Math.min(stepCount, minStep);
        }
        for (String mutation : bank) {
            int diff = 0;
            for (int i = 0; i < mutation.length(); i++) {
                if (current.charAt(i) != mutation.charAt(i)) {
                    if (++diff > 1) {
                        break;
                    }
                }
            }
            if (diff == 1 && !step.contains(current)) {
                step.add(mutation);
                dfs(step, stepCount + 1, mutation, end, bank);
                step.remove(mutation);
            }
        }
    }
}
