package vo;

/**
 * 双向链表
 *
 * @author huldar
 * @date 2020-08-31 22:30
 */
public class DoubleList {

    private final int capacity;
    private final Node dummyHead;
    private final Node dummyTail;
    private int size;

    public DoubleList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        dummyHead = new Node(-1, -1);
        dummyTail = new Node(-1, -1);
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    public void addFirst(Node node) {
        node.next = dummyHead.next;
        node.prev = dummyHead;
        dummyHead.next.prev = node;
        dummyHead.next = node;
        size++;
    }

    public void remove(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
        size--;
    }

    public void removeFirst(Node node) {
        remove(node);
        addFirst(node);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public Node getTailNode() {
        return dummyTail.prev;
    }


    public static class Node {
        int key, value;
        Node prev, next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }


}
