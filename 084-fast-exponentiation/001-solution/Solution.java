/**
 * Fast Exponentiation
 * 
 * - Time Complexity: O(log n)
 * - Space Complexity: O(1)
 */

public class Solution {
    public int fastExpo(int a, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) == 1) {
                ans *= a;
            }

            a *= a;
            n >>= 1;
        }

        return ans;
    }
}

/*
 * Enter `a`:
 * 3
 * 
 * Enter `n`:
 * 5
 * 
 * Result:
 * 243
 */

/*
 * Enter `a`:
 * 5
 * 
 * Enter `n`:
 * 3
 * 
 * Result:
 * 125
 */
