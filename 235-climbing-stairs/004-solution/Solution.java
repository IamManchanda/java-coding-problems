/**
 * Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/description/
 * 
 * Approach: Iterative
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int curr = 1;
        int next = 1;

        for (int i = 2; i <= n; i++) {
            int sum = curr + next;
            curr = next;
            next = sum;
        }

        return next;
    }
}

/*
 * Enter `n`:
 * 5
 * 
 * Result:
 * 8
 */
