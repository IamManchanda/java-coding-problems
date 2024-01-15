/**
 * Problem: Print the largest of three numbers.
 */

public class Solution {
    public int largestOfThreeNumbers(int a, int b, int c) throws IllegalArgumentException {
        if ((a == b) || (b == c) || (c == a)) {
            throw new IllegalArgumentException("All three numbers must be distinct.");
        }

        if (a > b && a > c) {
            return a;
        }

        if (b > a && b > c) {
            return b;
        }

        return c;
    }
}

/*
 * Enter the first number:
 * 12
 * 
 * Enter the second number:
 * 15
 * 
 * Enter the third number:
 * 10
 * 
 * Largest of the three numbers:
 * 15
 */
