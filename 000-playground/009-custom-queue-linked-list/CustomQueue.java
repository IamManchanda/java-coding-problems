/**
 * Custom Queue using LinkedList
 */

public class CustomQueue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head is front, tail is rear
    static Node head = null, tail = null;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void add(int item) { // Enqueue
        Node newNode = new Node(item);

        if (isEmpty()) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int remove() { // Dequeue
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int front = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }

        return front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return head.data;
    }
}
