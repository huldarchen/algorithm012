package day;

import java.util.*;

/**
 * 剑指offer 59
 *
 * @author bingjie.chen
 * @date 2020/7/15
 */
public class MaxSlidingWindow {

    public int[] maxSlidingWindowUsePriorityQueue(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1,o2) -> (o1 - o2));
        for (int i = 0; i < nums.length; i++) {
            int start = i - k;
            if (start >= 0) {
                priorityQueue.remove(nums[start]);
            }
            priorityQueue.offer(nums[i]);
            if (priorityQueue.size() == k) {
                result[i - k + 1] = priorityQueue.peek();
            }
        }
        return result;
    }

    public int[] maxSlidingWindowUseDequeue(int[] nums, int k) {
        if (nums == null || k == 0 || nums.length < k) {
            return new int[0];
        }
        int[] result = new int[nums.length - k + 1];
        //双向队列 保存当前窗口最大值的数组位置 保证队列中数组位置的数值按从大到小排序
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            // 保证从大到小 如果前面数小则需要依次弹出，直至满足要求
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            // 添加当前值对应的数组下标
            deque.addLast(i);
            // 判断当前队列中队首的值是否有
            if (!deque.isEmpty() && deque.peek() <= i - k) {
                deque.poll();
            }
            // 当窗口长度为k时 保存当前窗口中最大值
            if (i + 1 >= k) {
                result[i + 1 - k] = nums[deque.peek()];
            }
        }
        return result;
    }

    public int[] maxSlidingWindowUseDeque2(int[] nums, int k) {
        int length;
        if (nums == null || k == 0 || (length = nums.length) < k) {
            return new int[0];
        }

        int[] result = new int[length - k + 1];
        Deque<Integer> wind = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {

            while (wind.size() > 0 && wind.peekFirst() <= i - k) {
                wind.pollFirst();
            }
            while (wind.size() > 0 && nums[wind.peekLast()] < nums[i]) {
                wind.pollLast();
            }
            wind.offerLast(i);
            if (i >= k - 1) {
                result[i - k + 1] = nums[wind.peekFirst()];
            }
        }

        return result;
    }
}
