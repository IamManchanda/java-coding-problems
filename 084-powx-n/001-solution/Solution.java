/**
 * Pow(x, n)
 * https://leetcode.com/problems/powx-n/description/
 * (Not submitted as not exactly the same problem due to diff types of input)
 * 
 * - Time Complexity: O(log n)
 * - Space Complexity: O(1)
 */

public class Solution {
    public int myPow(int x, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) == 1) {
                ans *= x;
            }

            x *= x;
            n >>= 1;
        }

        return ans;
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
