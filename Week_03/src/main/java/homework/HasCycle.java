package homework;

import vo.ListNode;

/**
 * LeetCode-141:判断链表是否有环
 *
 * @author bingjie.chen
 * @date 2020/7/25
 */
public class HasCycle {

    public boolean hasCycleUseTwoPointer(ListNode head) {
        //边界条件
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;

        while (slowPointer != fastPointer) {

            if (fastPointer == null || fastPointer.next == null) {
                return true;
            }

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return false;
    }
}
