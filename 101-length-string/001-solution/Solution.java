/**
 * Get the length of the string
 * Approach: Recursion
 */

public class Solution {
    public int length(String str) {
        if (str.length() == 0) {
            return 0;
        }

        return 1 + length(str.substring(1));
    }
}

/*
 * Enter String `str`:
 * abcde
 * 
 * Result:
 * 5
 */
