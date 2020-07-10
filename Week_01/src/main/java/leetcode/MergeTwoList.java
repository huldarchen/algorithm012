package leetcode;

/**
 * LeetCode-21:合并
 *
 * @author bingjie.chen
 * @date 2020/7/10
 */
public class MergeTwoList {

    /**
     * 使用递归来合并两个有序链表
     */
    public ListNode mergeTwoListsUseRecursive(ListNode header1, ListNode header2) {
        //递归的出口
        if (header1 == null) {
            return header2;
        }

        if (header2 == null) {
            return header1;
        }

        if(header1.val < header2.val) {
            header1.next = mergeTwoListsUseRecursive(header1.next,header2);
            return header1;
        }else {
            header2.next = mergeTwoListsUseRecursive(header1,header2.next);
            return header2;
        }

    }




    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
