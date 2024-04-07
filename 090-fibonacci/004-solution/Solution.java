/**
 * Fibonacci sequence
 * Approach: Dynamic Programming (Recursive / Top-down / Memoization)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int fib(int n) {
        if (isZeroOrOne(n)) {
            return n;
        }

        int[] f = new int[n + 1];

        return fib(n, f);
    }

    private int fib(int n, int[] f) {
        if (isZeroOrOne(n)) {
            return n;
        }

        if (f[n] != 0) {
            return f[n];
        }

        f[n] = fib(n - 1, f) + fib(n - 2, f);

        return f[n];
    }

    private boolean isZeroOrOne(int n) {
        return n == 0 || n == 1;
    }
}

/*
 * Enter `n`:
 * 25
 * 
 * Result:
 * 75025
 */
