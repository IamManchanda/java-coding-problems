/**
 * Problem: Find the binomial coefficient of n and k.
 */

public class Solution {
    public int binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private int factorial(int number) {
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }
}

/*
 * Enter n:
 * 7
 * 
 * Enter k:
 * 3
 * 
 * Result:
 * 35
 */
