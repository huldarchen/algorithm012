package medium;

import vo.singly.ListNode;

/**
 * 链表两两想交换
 *
 * @author huldar
 * @date 2020-10-12 11:02
 */
public class SwapPairsList {

    public ListNode swapPairsRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairsRecursion(next.next);
        next.next = head;

        return next;
    }

    public ListNode swapPairsLoop(ListNode head) {

        return null;
    }


}
