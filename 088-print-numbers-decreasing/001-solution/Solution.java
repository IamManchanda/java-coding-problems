/**
 * Print numbers in decreasing order.
 */

public class Solution {
    public void printNumbersDecreasing(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        printNumbersDecreasing(n - 1);
    }
}

/*
 * Enter `n`:
 * 10
 * 
 * Result:
 * 10 9 8 7 6 5 4 3 2 1
 */
