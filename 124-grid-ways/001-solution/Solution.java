/**
 * Grid Ways
 * 
 * Approach: Recursion (Brute Force)
 * - Time complexity: O(2^(n+m))
 * - Space complexity: O(n+m)
 * Note: For learning purposes. Bad time complexity.
 */

public class Solution {
    public int gridWays(int n, int m) {
        return gridWays(0, 0, n, m);
    }

    private int gridWays(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }

        int w1 = gridWays(i, j + 1, n, m);
        int w2 = gridWays(i + 1, j, n, m);

        return w1 + w2;
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
