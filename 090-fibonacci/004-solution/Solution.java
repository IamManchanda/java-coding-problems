/**
 * Fibonacci sequence
 * Approach: Iterative
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int curr = 0;
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
 * 25
 * 
 * Result:
 * 75025
 */
