/**
 * Custom Singly Linked List
 */

public class CustomLinkedList {
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

    public int removeLast() {
        if (count == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } else if (count == 1) {
            return removeFirst();
        }

        Node prev = head;

        for (int i = 0; i <= count - 3; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        count--;

        return val;
    }

    public void removeLast(int index) {
        if (index == count) {
            head = head.next;
            return;
        }

        int i = 0, find = count - index - 1;
        Node prev = head;

        while (i < find) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        count--;
    }

    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int recursiveSearch(int key) {
        return recursiveSearch(head, key);
    }

    private int recursiveSearch(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int index = recursiveSearch(head.next, key);

        if (index == -1) {
            return -1;
        }

        return index + 1;
    }

    public void reverse() {
        Node current, prev = null, next = null;
        current = tail = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    private Node reverse(Node node) {
        Node current = node, prev = null, next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public Node findMid(Node head) {
        Node slow, fast;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move 1 step
            fast = fast.next.next; // Move 2 steps
        }

        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node current, prev = null, next = null, left, right;
        current = findMid(head);

        Node headCopy = new Node(head.data);

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        left = head;
        right = prev;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        headCopy.next = reverse(prev);

        return true;
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

    public static boolean isCycle() {
        Node slow, fast;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void removeCycle() {
        Node slow, fast;
        slow = fast = head;

        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move 1 step
            fast = fast.next.next; // Move 2 steps

            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        if (!isCycle) {
            System.out.println("Cycle not found");
            return;
        }

        slow = head;

        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next; // Move 1 step
            fast = fast.next; // Move 1 step
        }

        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
