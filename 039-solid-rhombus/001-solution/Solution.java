/**
 * Problem: Print the Solid Rhombus Pattern
 */

public class Solution {
    public void printSolidRhombusPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/*
 * Enter n for the Solid Rhombus Pattern:
 * 5
 * 
 * Result:
 * ____*****
 * ___*****
 * __*****
 * _*****
 * *****
 * 
 * _ denotes a space.
 */
