/**
 * Custom Doubly Linked List
 */

public class CustomLinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    private static int count;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        count++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        count++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void add(int data) {
        addLast(data);
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if (count == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        count--;

        return val;
    }

    public int removeLast() {
        if (count == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } else if (count == 1) {
            return removeFirst();
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        count--;

        return val;
    }

    public void reverse() {
        Node curr = head, prev = null, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void print() {
        if (count >= 1) {
            System.out.print("null <-> ");
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public int size() {
        return count;
    }
}
