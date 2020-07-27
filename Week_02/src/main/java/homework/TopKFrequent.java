package homework;

import java.util.*;

/**
 * LeetCode-347: k个高频元素
 *
 * @author bingjie.chen
 * @date 2020/7/19
 */
public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        //第一次遍历
        Map<Integer, Integer> hash = new HashMap<>();
        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(hash::get));

        for (Integer key : hash.keySet()) {
            if (heap.size() < k) {
                heap.add(key);
            } else if (hash.get(key) > hash.get(heap.peek())) {
                heap.remove();
                heap.add(key);
            }
        }
        int[] result = new int[heap.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = heap.remove();
        }
        return result;
    }
}
