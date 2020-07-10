package day;

/**
 * LeetCode-24:两两交换链表中的节点
 *
 * @author bingjie.chen
 * @date 2020/7/9
 */
public class SwapPairs {
    /**
     * 使用递归求解
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     * @param head 头结点
     * @return 交换后的链表的头结点
     */
    public ListNode swapPairsByRecursive(ListNode head) {
        //递归的结束条件是 1. 头节点为null(没有结点) 2.头节点的下一个结点为null(只有一个结点了)
        if (head == null || head.next == null) {
            return head;
        }
        //递归
        ListNode next = head.next;
        head.next = swapPairsByRecursive(next.next);
        next.next = head;
        return next;
    }



    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
