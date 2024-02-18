/**
 * Palindrome Check
 * https://www.algoexpert.io/questions/palindrome-check
 * 
 * Approach: Iterate to Reverse and Compare (Optimized)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 * 
 * Note: We optimized this solution by using
 * StringBuilder instead of String concatenation.
 */

public class Solution {
    public boolean isPalindrome(String str) {
        String reversedString = getReversedString(str);

        return str.equals(reversedString);
    }

    private String getReversedString(String str) {
        int n = str.length();
        StringBuilder reversedString = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }

        return reversedString.toString();
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
