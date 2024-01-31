/**
 * Tiling Problem
 * 
 * Approach: Recursion
 * - Time complexity: O(2^n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }
}

/*
 * Enter `n`:
 * 7
 * 
 * Result:
 * 21
 */
