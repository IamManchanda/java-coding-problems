import java.util.*;

/**
 * Sliding Window Maximum
 * https://leetcode.com/problems/sliding-window-maximum/description/
 * 
 * Approach: Using Deque
 * - Time complexity: O(n)
 * - Space complexity: O(k) auxiliary space
 */

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        int i;
        for (i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        for (i = k; i < n; i++) {
            result[i - k] = nums[dq.peekFirst()];

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        result[i - k] = nums[dq.peekFirst()];

        return result;
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
