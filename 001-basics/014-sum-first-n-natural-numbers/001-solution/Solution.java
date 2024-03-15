/**
 * Problem: Sum of first n natural numbers.
 * Approach: Iterative.
 */

public class Solution {
    public int sumFirstNNaturalNumbers(int n) {
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        return sum;
    }
}

/*
 * Enter n:
 * 15
 * 
 * Result:
 * 120
 */
