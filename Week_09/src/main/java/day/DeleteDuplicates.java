package day;

/**
 * 删除排序链表中的重复元素
 *
 * @author huldar
 * @date 2020-09-07 18:28
 */
public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmp = head;

        while (tmp.next != null) {
          if (tmp.val == tmp.next.val) {
              tmp.next = tmp.next.next;
          } else {
              tmp = tmp.next;
          }
        }
        return head;
    }

    public ListNode deleteDuplicatesUseReverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        if (head.val == head.next.val) {
            return head.next;
        }
        return head;
    }


    static class ListNode {
        int val;
        ListNode next;
       public ListNode(int x) {
            this.val = x;
        }

        @Override
        public String toString() {
            return Integer.toString(val);
        }
    }
}
