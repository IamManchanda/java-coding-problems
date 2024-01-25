/**
 * Power of Two
 * https://leetcode.com/problems/power-of-two/description/
 * 
 * Approach: Bit Manipulation
 * - Time complexity: O(1)
 * - Space complexity: O(1)
 */

public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

/*
 * Enter the number:
 * 1
 * 
 * Result:
 * true
 */

/*
 * Enter the number:
 * 16
 * 
 * Result:
 * true
 */

/*
 * Enter the number:
 * 3
 * 
 * Result:
 * false
 */
