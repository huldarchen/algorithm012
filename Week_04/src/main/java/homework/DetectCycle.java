package homework;


import java.util.LinkedList;
import java.util.List;

/**
 * LeetCode-142:环形链表II 返回第一次入环的链表
 *
 * @author huldar
 * @date 2020-08-01 10:01
 */
public class DetectCycle {


    public ListNode detectCycleUseSet(ListNode head) {
        List<ListNode> array = new LinkedList<>();

        if (head == null) {
            return null;
        }
        ListNode node = head;
        while (node != null) {
            if (array.contains(node)) {
                return node;
            }
            array.add(node);
            node = node.next;
        }
        return null;

    }


    /**
     * 返回第一次入环的节点.如果没有返回null
     */
    public ListNode detectCycleUseIndex(ListNode head) {
        //一种比较简单直接的方式是先判断是否有换
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        do {
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        } while (fast != slow);
        //这里找到了第一次相遇的地方,但这里并不是环的入口.因此接着遍历找到相同的地方
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }


    }
}
