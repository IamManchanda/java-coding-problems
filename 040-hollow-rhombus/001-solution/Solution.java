/**
 * Problem: Print the Hollow Rhombus Pattern
 */

public class Solution {
    public void printHollowRhombusPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

/*
 * Enter n for the Hollow Rhombus Pattern:
 * 5
 * 
 * Result:
 * ____*****
 * ___*___*
 * __*___*
 * _*___*
 * *****
 * 
 * _ denotes space
 */
