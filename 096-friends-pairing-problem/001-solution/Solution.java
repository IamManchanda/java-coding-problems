/**
 * Friends Pairing Problem
 * Approach: Recursion
 * 
 * - Time complexity: O(2^n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int friendsPairing(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }

        int waysIfSingleFirst = friendsPairing(n - 1);
        int waysIfPairedFirst = (n - 1) * friendsPairing(n - 2);
        int totalWays = waysIfSingleFirst + waysIfPairedFirst;

        return totalWays;
    }
}

/*
 * Enter `n`:
 * 9
 * 
 * Result:
 * 2620
 */
