/**
 * Print numbers in increasing order.
 */

public class Solution {
    public void printNumbersIncreasing(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printNumbersIncreasing(n - 1);
        System.out.print(n + " ");
    }
}

/*
 * Enter `n`:
 * 10
 * 
 * Result:
 * 1 2 3 4 5 6 7 8 9 10
 */
