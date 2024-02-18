/**
 * Longest Palindromic Substring
 * https://www.algoexpert.io/questions/longest-palindromic-substring
 * 
 * Approach: Brute Force
 * - Time complexity: O(n^3)
 * - Space complexity: O(n)
 */

public class Solution {
    public String longestPalindromicSubstring(String str) {
        int n = str.length(), sn, ln;
        String longest = "";

        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = str.substring(i, j);
                sn = substring.length();
                ln = longest.length();

                if (sn > ln && isPalindrome(substring)) {
                    longest = substring;
                }
            }
        }

        return longest;
    }

    private boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;

        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}

/*
 * Enter String `str`:
 * abaxyzzyxf
 * 
 * Result:
 * xyzzyx
 */
