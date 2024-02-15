/**
 * Is Unique
 * 
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 * where, n is the length of the string
 */
public class Solution {
    private static final int ASCII_SIZE = 128;

    public boolean isUniqueChars(String str) {
        int n = str.length();

        if (n > ASCII_SIZE) {
            return false;
        }

        boolean[] charSet = new boolean[ASCII_SIZE];

        for (int i = 0; i <= n - 1; i++) {
            int val = str.charAt(i);

            if (charSet[val]) {
                return false;
            }

            charSet[val] = true;
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
