public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int count;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        count++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
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
        tail = newNode;
    }

    public void add(int data) {
        addLast(data);
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        count++;
        Node temp = head;

        for (int i = 0; i <= index - 2; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (count == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if (count == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }

        count--;
        return val;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public int size() {
        return count;
    }
}
