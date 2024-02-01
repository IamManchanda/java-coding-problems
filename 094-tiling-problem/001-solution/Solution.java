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

        int waysIfHorizontalFirst = tilingProblem(n - 1);
        int waysIfVerticalFirst = tilingProblem(n - 2);
        int totalWays = waysIfHorizontalFirst + waysIfVerticalFirst;

        return totalWays;
    }
}

/*
 * Enter `n`:
 * 7
 * 
 * Result:
 * 21
 */
