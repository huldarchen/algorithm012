package vo.singly;

/**
 * 单向链表节点
 *
 * @author huldar
 * @date 2020-10-12 09:58
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }


}
