import java.util.*;

/**
 * Push an item at the bottom of the stack
 * 
 * Approach: Recursion
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
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
 * Enter `item` to push at bottom:
 * 4
 * 
 * Result:
 * [4, 1, 2, 3]
 */
