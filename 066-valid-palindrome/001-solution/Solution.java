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

        if (str.isEmpty()) {
            return true;
        }

        for (int i = 0; i <= n / 2; i++) {
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