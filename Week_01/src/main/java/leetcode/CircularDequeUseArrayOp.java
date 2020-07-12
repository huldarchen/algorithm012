package leetcode;

/**
 * LeetCode-641:设计一个双端循环队列
 *
 * 使用数组实现
 * @author bingjie.chen
 * @date 2020/7/12
 */
public class CircularDequeUseArrayOp {
    private final int[] arr;
    private int front;
    private int rear;
    private final int capacity;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public CircularDequeUseArrayOp(int k) {
        this.front = 0;
        this.rear = 0;
        this.capacity = k + 1;
        this.arr = new int[capacity];
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        //如果
        if (isFull()) {
            return false;
        }
        front = (front + capacity - 1) % capacity;
        arr[front] = value;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1 + capacity) % capacity;
        arr[rear] = value;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        rear = (rear + capacity - 1) % capacity;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (isEmpty()) {
            return  -1;
        }
        return arr[(rear + capacity -1) % capacity];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return front == rear;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return (rear + 1) % capacity == capacity;
    }
}
