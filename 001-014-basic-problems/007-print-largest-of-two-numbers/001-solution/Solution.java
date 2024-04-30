/**
 * Problem: Print the largest of two numbers.
 */

public class Solution {
    public int largestOfTwoNumbers(int a, int b) throws IllegalArgumentException {
        if (a == b) {
            throw new IllegalArgumentException("The numbers are equal.");
        }

        if (a > b) {
            return a;
        }

        return b;
    }
}

/*
 * Enter the first number:
 * 12
 * 
 * Enter the second number:
 * 14
 * 
 * The largest of "a: 12" and "b: 14" is:
 * 14
 */

/*
 * Enter the first number:
 * 10
 * 
 * Enter the second number:
 * 7
 * 
 * The largest of "a: 10" and "b: 7" is:
 * 10
 */
