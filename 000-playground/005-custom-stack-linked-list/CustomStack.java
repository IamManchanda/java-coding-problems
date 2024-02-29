import java.util.*;

/**
 * Custom Stack using LinkedList
 */

public class CustomStack {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int top = head.data;
        head = head.next;

        return top;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return head.data;
    }
}
