package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-09-07 18:35
 */
class DeleteDuplicatesTest {
    private final DeleteDuplicates deleteDuplicates = new DeleteDuplicates();


    @Test
    void deleteDuplicates() {
        DeleteDuplicates.ListNode head = new DeleteDuplicates.ListNode(1);
        DeleteDuplicates.ListNode next = head.next = new DeleteDuplicates.ListNode(2);
        DeleteDuplicates.ListNode next1 = new DeleteDuplicates.ListNode(3);
        next.next = next1;
        next1.next = new DeleteDuplicates.ListNode(3);
        assertEquals("123", printResult(deleteDuplicates.deleteDuplicates(head)));
    }

    @Test
    void deleteDuplicatesUseReverse() {
        DeleteDuplicates.ListNode head = new DeleteDuplicates.ListNode(1);
        DeleteDuplicates.ListNode next = head.next = new DeleteDuplicates.ListNode(2);
        DeleteDuplicates.ListNode next1 = new DeleteDuplicates.ListNode(3);
        next.next = next1;
        next1.next = new DeleteDuplicates.ListNode(3);

        assertEquals("123", printResult(deleteDuplicates.deleteDuplicatesUseReverse(head)));
    }

    private String printResult(DeleteDuplicates.ListNode head) {
        StringBuilder result = new StringBuilder();
        while (head != null) {
            result.append(head.val);
            head = head.next;
        }
        return result.toString();
    }
}
