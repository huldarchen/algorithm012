package day;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 链表两两交换
 *
 * @author bingjie.chen
 * @date 2020/7/9
 */
class SwapPairsTest {


    @Test
    void swapPairsByRecursive() {
        SwapPairs.ListNode heard = getList();
        SwapPairs.ListNode result = new SwapPairs().swapPairsByRecursive(heard);
        String resultStr = printList(new StringBuilder(),result);
        assertEquals("2143",resultStr);
    }

    private String printList(StringBuilder sbd, SwapPairs.ListNode result) {
        if(result == null) {
            return sbd.toString();
        }
        sbd.append(result.val);
        return printList(sbd,result.next);
    }


    private SwapPairs.ListNode getList() {
        SwapPairs.ListNode header = new SwapPairs.ListNode(1);
        SwapPairs.ListNode node1 = new SwapPairs.ListNode(2);
        SwapPairs.ListNode node2 = new SwapPairs.ListNode(3);
        SwapPairs.ListNode node3 = new SwapPairs.ListNode(4);
        header.next = node1;
        node1.next = node2;
        node2.next = node3;
        return header;
    }
}
