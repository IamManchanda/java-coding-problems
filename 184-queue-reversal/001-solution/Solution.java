import java.util.*;

/**
 * Queue Reversal
 * https://www.geeksforgeeks.org/problems/queue-reversal/1
 * 
 * Approach: Using Stack (ArrayDeque)
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class Solution {
    public Queue<Integer> rev(Queue<Integer> q) {
        ArrayDeque<Integer> st = new ArrayDeque<>();

        while (!q.isEmpty()) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        return q;
    }
}

/*
 * Entered Queue `q`:
 * [4, 3, 1, 10, 2, 6]
 * 
 * Result:
 * [6, 2, 10, 1, 3, 4]
 */

/*
 * Entered Queue `q`:
 * [4, 3, 2, 1]
 * 
 * Result:
 * [1, 2, 3, 4]
 */
