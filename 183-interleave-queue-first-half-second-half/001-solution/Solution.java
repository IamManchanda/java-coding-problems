import java.util.*;

/**
 * Interleave the first half of the queue with second half
 * https://www.geeksforgeeks.org/problems/interleave-the-first-half-of-the-queue-with-second-half/1
 * 
 * Approach: Interleave using a temp queue
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class Solution {
    public ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        int half = N / 2;

        if (half <= 1) {
            return new ArrayList<>(q);
        }

        Queue<Integer> tempQ = new LinkedList<>();

        for (int i = 0; i <= half - 1; i++) {
            tempQ.add(q.remove());
        }

        while (!tempQ.isEmpty()) {
            q.add(tempQ.remove());
            q.add(q.remove());
        }

        return new ArrayList<>(q);
    }
}

/*
 * Entered `N`:
 * 4
 * 
 * Entered Queue `q`:
 * [2, 4, 3, 1]
 * 
 * Result:
 * [2, 3, 4, 1]
 */

/*
 * Entered Queue `q`:
 * [3, 5]
 * 
 * Result:
 * [3, 5]
 */
