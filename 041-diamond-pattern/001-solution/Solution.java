/**
 * Problem: Print the Diamond Pattern
 */

public class Solution {
    public void printDiamondPattern(int n) {
        for (int i = 1; i <= n; i++) {
            printDiamondPattern(i, n);
        }

        for (int i = n; i >= 1; i--) {
            printDiamondPattern(i, n);
        }
    }

    private void printDiamondPattern(int i, int n) {
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= (2 * i) - 1; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

/*
 * Enter n for the Diamond Pattern:
 * 5
 * 
 * Result:
 * ____*
 * ___***
 * __*****
 * _*******
 * *********
 * *********
 * _*******
 * __*****
 * ___***
 * ____*
 *
 * _ denotes space
 */
