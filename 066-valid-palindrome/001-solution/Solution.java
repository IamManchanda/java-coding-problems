/**
 * Valid Palindrome
 * https://leetcode.com/problems/valid-palindrome/description/
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class Solution {
    public boolean isPalindrome(String s) {
        String str = removeNonAlphanumeric(s);
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

    private String removeNonAlphanumeric(String input) {
        return input
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();
    }

    private int findMidIndex(int start, int end) {
        // Avoids overflow compared to (start + end) / 2
        return start + (end - start) / 2;
    }
}

/*
 * Enter the String:
 * A man, a plan, a canal: Panama
 * 
 * Result:
 * true
 */

/*
 * Enter the String:
 * race a car
 * 
 * Result:
 * false
 */

/*
 * Enter the String:
 * _
 * 
 * Result:
 * true
 * 
 * _ denotes a space
 */