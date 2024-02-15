/**
 * Is Unique
 * 
 * - Time complexity: O(min(n, c))
 * - Space complexity: O(c)
 * where, n is the length of the string
 * and, c is the size of the character set
 */
public class Solution {
    public boolean isUniqueChars(String str) {
        int n = str.length();
        int checker = 0;

        for (int i = 0; i <= n - 1; i++) {
            int val = str.charAt(i) - 'a';

            int shift = 1 << val;

            if ((checker & shift) > 0) {
                return false;
            }

            checker |= shift;
        }

        return true;
    }
}

/*
 * Enter a string:
 * harry
 * 
 * Result:
 * false
 */

/*
 * Enter a string:
 * gayle
 * 
 * Result:
 * true
 */
