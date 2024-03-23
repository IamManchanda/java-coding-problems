import java.util.*;

/**
 * Sliding Window Maximum
 * https://leetcode.com/problems/sliding-window-maximum/description/
 * 
 * Approach: Using Priority Queue
 * - Time complexity: O(n log k)
 * - Space complexity: O(n) auxiliary space
 */

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        int i;
        for (i = 0; i < k; i++) {
            pq.add(new Pair(nums[i], i));
        }

        result[0] = pq.peek().val;

        for (i = k; i < n; i++) {
            while (!pq.isEmpty() && pq.peek().idx <= i - k) {
                pq.poll();
            }

            pq.add(new Pair(nums[i], i));

            result[i - k + 1] = pq.peek().val;
        }

        return result;
    }

    static class Pair implements Comparable<Pair> {
        int val, idx;

        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair other) {
            // Descending order
            return other.val - this.val;
        }
    }
}

/*
 * Entered `nums[]`:
 * [1, 3, -1, -3, 5, 3, 6, 7]
 * 
 * Enter `k`:
 * 3
 * 
 * Result:
 * [3, 3, 5, 5, 6, 7]
 */

/*
 * Entered `nums[]`:
 * [1]
 * 
 * Enter `k`:
 * 1
 * 
 * Result:
 * [1]
 */
