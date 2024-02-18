/**
 * Palindrome Check
 * https://www.algoexpert.io/questions/palindrome-check
 * 
 * Approach: Iterative
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public boolean isPalindrome(String str) {
        int n = str.length();
        int mid = findMidIndex(0, n - 1);

        if (str.isEmpty()) {
            return true;
        }

        for (int i = 0; i <= mid; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    private int findMidIndex(int start, int end) {
        // Avoids overflow compared to (start + end) / 2
        return start + (end - start) / 2;
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
