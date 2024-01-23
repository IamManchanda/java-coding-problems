/**
 * Problem: Palindrome Number
 * https://leetcode.com/problems/palindrome-number/description/
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Solution {
    public boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int reverse = getReverse(number);

        if (number == reverse) {
            return true;
        }

        return false;
    }

    public int getReverse(int number) {
        int temp = number;
        int reverse = 0;

        while (temp != 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }

        return reverse;
    }
}

/*
 * Enter the integer:
 * 121
 * 
 * Result:
 * true
 */

/*
 * Enter the integer:
 * -121
 * 
 * Result:
 * false
 */

/*
 * Enter the integer:
 * 10
 * 
 * Result:
 * false
 */