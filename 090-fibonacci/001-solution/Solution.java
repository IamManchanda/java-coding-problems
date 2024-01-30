/**
 * Fibonacci sequence
 * Approach: Recursion
 * - Time complexity: O(2^n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}

/*
 * Enter `n`:
 * 25
 * 
 * Result:
 * 75025
 */
