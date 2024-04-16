/**
 * Catalan number sequence
 * 
 * Approach: Recursive
 * - Time complexity: O(2^n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int catalan(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += catalan(i) * catalan(n - i - 1);
        }

        return ans;
    }
}

/*
 * Enter `n`:
 * 4
 * 
 * Result:
 * 14
 */
