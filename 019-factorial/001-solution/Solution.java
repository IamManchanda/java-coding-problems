/**
 * Problem: Find the factorial of the number.
 * Approach: Use iterative approach.
 */

public class Solution {
    public int factorial(int number) {
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }
}

/*
 * Enter number:
 * 5
 * 
 * Result:
 * 120
 */