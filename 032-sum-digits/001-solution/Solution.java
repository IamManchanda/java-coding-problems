/**
 * Problem: Compute the sum of the digits in an integer.
 */

public class Solution {
    public int calculateSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }

        return sum;
    }
}

/*
 * Enter the integer:
 * 33245
 * 
 * Result:
 * Sum of the digits in 33245 is: 17
 */
