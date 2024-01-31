/**
 * Pow(x, n)
 * https://leetcode.com/problems/powx-n/description/
 * (Not submitted as not exactly the same problem due to diff types of input)
 * 
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class Solution {
    public int myPow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * myPow(x, n - 1);
    }
}

/*
 * Enter `x`:
 * 3
 * 
 * Enter `n`:
 * 5
 * 
 * Result:
 * 243
 */

/*
 * Enter `x`:
 * 5
 * 
 * Enter `n`:
 * 3
 * 
 * Result:
 * 125
 */
