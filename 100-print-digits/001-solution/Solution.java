/**
 * Print number as digits
 */

public class Solution {
    String[] digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public void printDigits(int n) {
        if (n == 0) {
            return;
        }

        int lastDigit = n % 10;
        printDigits(n / 10);
        System.out.print(digits[lastDigit] + " ");
    }
}

/*
 * Enter `n`:
 * 1947
 * 
 * Result:
 * one nine four seven
 */
