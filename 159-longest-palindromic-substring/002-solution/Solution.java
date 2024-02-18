/**
 * Longest Palindromic Substring
 * https://www.algoexpert.io/questions/longest-palindromic-substring
 * 
 * Approach: Optimal
 * - Time complexity: O(n^2)
 * - Space complexity: O(n)
 */

public class Solution {
    public String longestPalindromicSubstring(String str) {
        int[] longest = { 0, 1 };

        for (int i = 1; i <= str.length() - 1; i++) {
            int longestDiff = longest[1] - longest[0];

            int[] odd = getLongestPalindrome(str, i - 1, i + 1);
            int oddDiff = odd[1] - odd[0];

            int[] even = getLongestPalindrome(str, i - 1, i);
            int evenDiff = even[1] - even[0];

            int[] current;
            int currentDiff;

            if (oddDiff > evenDiff) {
                current = odd;
                currentDiff = oddDiff;
            } else {
                current = even;
                currentDiff = evenDiff;
            }

            if (currentDiff > longestDiff) {
                longest = current;
            }
        }

        return str.substring(longest[0], longest[1]);
    }

    private int[] getLongestPalindrome(String str, int l, int r) {
        while (l >= 0 && r <= str.length() - 1) {
            if (str.charAt(l) != str.charAt(r)) {
                break;
            }

            l--;
            r++;
        }

        int[] longest = { l + 1, r };

        return longest;
    }
}

/*
 * Enter String `str`:
 * abaxyzzyxf
 * 
 * Result:
 * xyzzyx
 */
