package day;

import vo.ListNode;

/**
 * TODO
 *
 * @author bingjie.chen
 * @date 2020/7/22
 */

public class ReversePrint {
    private int index = 0;
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[]{};
        }
        return recursion(1, head);
    }

    private int[] recursion(int size, ListNode head) {
        int[] result;

        if (head.next == null) {
            result = new int[size];
        } else {
            result = recursion(++size, head.next);
        }
        result[index++] = head.val;
        return result;
    }
}
