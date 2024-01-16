/**
 * Problem: Return the reverse of a number.
 */

public class Solution {
    public int reverseNumber(int number) {
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return reverse;
    }
}

/*
 * Enter number:
 * 10899
 * 
 * Result:
 * 99801
 */
