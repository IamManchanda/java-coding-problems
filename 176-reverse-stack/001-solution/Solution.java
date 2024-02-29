import java.util.*;

/**
 * Reverse a stack
 * 
 * Approach: Recursion
 * - Time complexity: O(n^2)
 * - Space complexity: O(n)
 */

public class Solution {
    public void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public void pushAtBottom(Stack<Integer> s, int item) {
        if (s.isEmpty()) {
            s.push(item);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, item);
        s.push(top);
    }
}

/*
 * Entered Stack `s`:
 * [1, 2, 3]
 * 
 * Result:
 * [3, 2, 1]
 */
