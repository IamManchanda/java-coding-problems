/**
 * Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/description/
 * (Not submitted as it is a brute force solution)
 * 
 * Approach: Recursive
 * - Time complexity: O(2^n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}

/*
 * Enter `n`:
 * 5
 * 
 * Result:
 * 8
 */
