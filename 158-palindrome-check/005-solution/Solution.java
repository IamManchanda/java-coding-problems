/**
 * Palindrome Check
 * https://www.algoexpert.io/questions/palindrome-check
 * 
 * Approach: Two Pointers
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public boolean isPalindrome(String str) {
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
