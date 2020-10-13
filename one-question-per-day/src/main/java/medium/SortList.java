package medium;

import vo.singly.ListNode;

/**
 * @author huldar
 * @date 2020-10-12 09:57
 * 链表排序
 */
public class SortList {

    public ListNode sortListRecursion(ListNode head) {
        // 递归终结条件
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;

        ListNode left = sortListRecursion(head);
        ListNode right = sortListRecursion(tmp);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left != null && right != null) {
            if (left.val < right.val) {
                h.next = left;
                left = left.next;
            } else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }

        h.next = left != null ? left : right;

        return res.next;
    }
}
