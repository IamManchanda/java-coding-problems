/**
 * Count all contiguous substrings of a string
 * starting and ending with the same character
 * 
 * Approach: Recursion
 */

public class Solution {
    public int countSubstrings(String str) {
        int n = str.length();
        int i = 0, j = n - 1;
        return countSubstrings(str, i, j, n);
    }

    private int countSubstrings(String str, int i, int j, int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return n;
        }

        int res = countSubstrings(str, i + 1, j, n - 1)
                + countSubstrings(str, i, j - 1, n - 1)
                - countSubstrings(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }

        return res;
    }
}

/*
 * Enter String `str`:
 * abcab
 * 
 * Result:
 * 7
 */
