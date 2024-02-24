/**
 * Merge Sort on a Singly Linked List
 * 
 * - Time Complexity: O(n log n)
 * - Space Complexity: O(1)
 */

public class Solution {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node rightHead = mid.next;

        mid.next = null; // Break into two parts

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1
            fast = fast.next.next; // Move fast by 2
        }

        return slow; // mid node
    }

    private Node merge(Node leftHead, Node rightHead) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (leftHead != null && rightHead != null) {
            if (leftHead.data <= rightHead.data) {
                temp.next = leftHead;
                leftHead = leftHead.next; // Move leftHead by 1
            } else { // leftHead.data > rightHead.data
                temp.next = rightHead;
                rightHead = rightHead.next; // Move rightHead by 1
            }

            temp = temp.next; // Move temp by 1
        }

        while (leftHead != null) {
            temp.next = leftHead;
            leftHead = leftHead.next; // Move leftHead by 1
            temp = temp.next; // Move temp by 1
        }

        while (rightHead != null) {
            temp.next = rightHead;
            rightHead = rightHead.next; // Move rightHead by 1
            temp = temp.next; // Move temp by 1
        }

        return mergedLL.next;
    }

    // Helper Method to add elements to the LinkedList
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Helper Method to print the LinkedList
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

/*
 * Input:
 * 5 -> 4 -> 1 -> 3 -> 2 -> null
 * 
 * Output:
 * 1 -> 2 -> 3 -> 4 -> 5 -> null
 */
