/**
 * Reorder List
 * https://leetcode.com/problems/reorder-list/
 * 
 * Approach: Find middle, reverse second half, merge two halves
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    // Leetcode provided ListNode class
    // local testing use only, won't be submitted to LeetCode
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode head;
    public ListNode tail;

    // Actual solution starts here (for LeetCode submission)
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1
            fast = fast.next.next; // Move fast by 2
        }

        ListNode mid = slow, curr = mid.next, prev = null, next = null;

        mid.next = null; // Break into two parts

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode left = head, right = prev, nextLeft, nextRight;

        while (left != null && right != null) {
            nextLeft = left.next;
            left.next = right;

            nextRight = right.next;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }
    // Actual solution finishes here (for LeetCode submission)

    // Helper Method to add elements to the LinkedList
    // local testing use only, won't be submitted to LeetCode
    public void add(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Helper Method to print the LinkedList
    // local testing use only, won't be submitted to LeetCode
    public void print() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

/*
 * Input:
 * 1 -> 2 -> 3 -> 4 -> null
 * 
 * Output:
 * 1 -> 4 -> 2 -> 3 -> null
 */

/*
 * Input:
 * 1 -> 2 -> 3 -> 4 -> 5 -> null
 * 
 * Output:
 * 1 -> 5 -> 2 -> 4 -> 3 -> null
 */
