package homework;

import java.util.PriorityQueue;

/**
 * LeetCode-剑指offer40: 最小k个数
 *
 * @author bingjie.chen
 * @date 2020/7/19
 */
public class LeastNumbers {

    public int[] getLeastNumbersUseHeap(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((x, y) -> y - x);
        for (int i : arr) {
            if (heap.size() < k) {
                heap.offer(i);
            } else if (!heap.isEmpty() && i < heap.peek()){
                heap.poll();
                heap.offer(i);
            }
        }
        int[] result = new int[heap.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = heap.poll();
        }
        return result;
    }

}
