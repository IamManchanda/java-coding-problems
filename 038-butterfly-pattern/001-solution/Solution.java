/**
 * Problem: Print the Butterfly Pattern
 */

public class Solution {
    public void printButterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {
            printButterflyPattern(i, n);
        }

        for (int i = n; i >= 1; i--) {
            printButterflyPattern(i, n);
        }
    }

    private void printButterflyPattern(int i, int n) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        for (int j = 1; j <= 2 * (n - i); j++) {
            System.out.print("  ");
        }

        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}

/*
 * Enter n for the Butterfly Pattern:
 * 7
 * 
 * Result:
 * *_________________________*
 * * *_____________________* *
 * * * *_________________* * *
 * * * * *_____________* * * *
 * * * * * *_________* * * * *
 * * * * * * *_____* * * * * *
 * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * *
 * * * * * * *_____* * * * * *
 * * * * * *_________* * * * *
 * * * * *_____________* * * *
 * * * *_________________* * *
 * * *_____________________* *
 * *_________________________*
 *
 * _ denotes a space.
 */
