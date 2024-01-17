/**
 * Problem: Check if a number is palindrome or not.
 */

public class Solution {
    public boolean isPalindrome(int number) {
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
 * 11122111
 * 
 * Result:
 * 11122111 is palindrome.
 */

/*
 * Enter the integer:
 * 12456
 * 
 * Result:
 * 12456 is not palindrome.
 */