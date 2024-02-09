/**
 * Grid Ways
 * 
 * - Approach: Mathematical (Permutation)
 * - Time complexity: O(n+m)
 * - Space complexity: O(1)
 */

public class Solution {
    public int gridWays(int n, int m) {
        return permutation(n, m);
    }

    private int permutation(int n, int m) {
        /**
         * Formula:
         * (n - 1 + m - 1)! / (n - 1)! * (m - 1)!
         * => (n + m - 2)! / (n - 1)! * (m - 1)!
         */
        return factorial(n + m - 2) / (factorial(n - 1) * factorial(m - 1));
    }

    private int factorial(int number) {
        if (number == 0) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}

/*
 * Enter no of rows:
 * 3
 * 
 * Enter no of cols:
 * 3
 * 
 * Result:
 * 6
 */

/*
 * Enter no of rows:
 * 4
 * 
 * Enter no of cols:
 * 5
 * 
 * Result:
 * 35
 */
