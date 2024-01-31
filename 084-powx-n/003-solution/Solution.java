/**
 * Pow(x, n)
 * https://leetcode.com/problems/powx-n/description/
 * 
 * Approach: Divide and Conquer
 * - Time Complexity: O(log n)
 * - Space Complexity: O(log n)
 */

public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            x = 1 / x;

            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE;
                return x * myPow(x, n);
            }

            n = -n;
        }

        double halfPow = myPow(x, n / 2);
        double halfPowSq = halfPow * halfPow;
        boolean isOdd = n % 2 != 0;

        return isOdd ? x * halfPowSq : halfPowSq;
    }
}

/*
 * Enter `x`:
 * 2.00000
 * 
 * Enter `n`:
 * 10
 * 
 * Result:
 * 1024.0
 */

/*
 * Enter `x`:
 * 2.10000
 * 
 * Enter `n`:
 * 3
 * 
 * Result:
 * 9.261000000000001
 */

/*
 * Enter `x`:
 * 2.00000
 * 
 * Enter `n`:
 * -2
 * 
 * Result:
 * 0.25
 */