/**
 * Problem: Sum of first n natural numbers.
 * Approach: Recursive.
 */

public class Solution {
    public int sumFirstNNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumFirstNNaturalNumbers(n - 1);
    }
}

/*
 * Enter n:
 * 15
 * 
 * Result:
 * 120
 */
