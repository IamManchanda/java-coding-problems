/**
 * Problem: Print a hollow rectangle pattern.
 */

public class Solution {
    public void printHollowRectangle(int rows, int cols) {
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if (row == 1 || row == rows || col == 1 || col == cols) {
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
 * Enter the number of rows:
 * 7
 * 
 * Enter the number of columns:
 * 10
 * 
 * Result:
 * **********
 * *________*
 * *________*
 * *________*
 * *________*
 * *________*
 * **********
 * 
 * Note: _ denotes a space.
 */
