/**
 * Palindrome Check
 * https://www.algoexpert.io/questions/palindrome-check
 * 
 * Approach: Iterate to Reverse and Compare
 * - Time complexity: O(n^2)
 * - Space complexity: O(n)
 */

public class Solution {
    public boolean isPalindrome(String str) {
        String reversedString = getReversedString(str);

        return str.equals(reversedString);
    }

    private String getReversedString(String str) {
        int n = str.length();
        String reversedString = "";

        for (int i = n - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }

        return reversedString;
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
