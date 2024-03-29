/**
 * Palindrome Check
 * https://www.algoexpert.io/questions/palindrome-check
 * 
 * Approach: Recursion (Compare Indices)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public boolean isPalindrome(String str) {
        return isPalindrome(str, 0);
    }

    private boolean isPalindrome(String str, int i) {
        int n = str.length();
        int j = n - i - 1;

        if (i >= j) {
            return true;
        }

        return str.charAt(i) == str.charAt(j) && isPalindrome(str, i + 1);
    }
}

/*
 * Enter String `str`:
 * abcdcba
 * 
 * Result:
 * true
 */

/*
 * Enter String `str`:
 * abccba
 * 
 * Result:
 * true
 */

/*
 * Enter String `str`:
 * abb
 * 
 * Result:
 * false
 */
