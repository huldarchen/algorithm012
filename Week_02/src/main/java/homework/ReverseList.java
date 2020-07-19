package homework;

/**
 *  LeetCode-206: 反转链表
 *
 *
 * @author bingjie.chen
 * @date 2020/7/13
 */
public class ReverseList {
    public ListNode reverseListNodeUseRecursive(ListNode head) {
        //递归条件
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseListNodeUseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }


    public ListNode reverseListNodeUseLoop(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val =val;
        }
    }
}
