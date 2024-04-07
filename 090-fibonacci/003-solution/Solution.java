/**
 * Fibonacci sequence
 * Approach: Dynamic Programming (Iterative / Bottom-up / Tabulation)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] f = new int[n + 1];

        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }
}

/*
 * Enter `n`:
 * 25
 * 
 * Result:
 * 75025
 */
