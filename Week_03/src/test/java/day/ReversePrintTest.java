package day;

import org.junit.jupiter.api.Test;
import vo.ListNode;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 反转打印链表
 *
 * @author bingjie.chen
 * @date 2020/7/22
 */
class ReversePrintTest {
    ListNode head = new ListNode(1);
    {
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
    }
    private ReversePrint reversePrint = new ReversePrint();
    @Test
    void reversePrint() {
        reversePrint.reversePrint(head);
    }
}
