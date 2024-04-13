/**
 * Longest Common Subsequence
 * https://leetcode.com/problems/longest-common-subsequence/description/
 * (Not submitted as it is a brute force solution)
 *
 * Approach: Recursive
 * - Time complexity: O(2^n)
 * - Space complexity: O(n)
 * 
 * where, n is the length of the longest string between `text1` and `text2`
 */

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length(), n2 = text2.length();

        if (isZero(n1, n2)) {
            return 0;
        }

        return longestCommonSubsequence(text1, text2, n1, n2);
    }

    private int longestCommonSubsequence(String text1, String text2, int n1, int n2) {
        if (isZero(n1, n2)) {
            return 0;
        }

        int li1 = n1 - 1, li2 = n2 - 1, result;

        if (text1.charAt(li1) == text2.charAt(li2)) {
            result = longestCommonSubsequence(text1, text2, li1, li2) + 1;
        } else {
            int lcs1 = longestCommonSubsequence(text1, text2, li1, n2);
            int lcs2 = longestCommonSubsequence(text1, text2, n1, li2);
            result = Math.max(lcs1, lcs2);
        }

        return result;
    }

    private boolean isZero(int n1, int n2) {
        return n1 == 0 || n2 == 0;
    }
}

/*
 * Enter String `text1`:
 * abcde
 * 
 * Enter String `text2`:
 * ace
 * 
 * Result:
 * 3
 */

/*
 * Enter String `text1`:
 * abc
 * 
 * Enter String `text2`:
 * abc
 * 
 * Result:
 * 3
 */

/*
 * Enter String `text1`:
 * abc
 * 
 * Enter String `text2`:
 * def
 * 
 * Result:
 * 0
 */
