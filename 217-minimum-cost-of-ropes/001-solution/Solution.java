import java.util.*;

/**
 * Minimum Cost of ropes
 * https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
 * 
 * Approach: Priority Queue (Min Heap)
 * - Time Complexity: O(n log n)
 * - Space Complexity: O(n)
 */

public class Solution {
    public long minCost(long[] arr, int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (long item : arr) {
            pq.add(item);
        }

        long result = 0;

        while (pq.size() > 1) {
            long minFirst = pq.poll();
            long minSecond = pq.poll();

            long sum = minFirst + minSecond;
            result += sum;
            pq.add(sum);
        }

        return result;
    }
}

/*
 * Entered `arr[]`:
 * [4, 3, 2, 6]
 * 
 * Entered `n`:
 * 4
 * 
 * Result:
 * 29
 */

/**
 * Entered `arr[]`:
 * [4, 2, 7, 6, 9]
 * 
 * Entered `n`:
 * 5
 * 
 * Result:
 * 62
 */
