/**
 * Problem: Print Square Pattern
 */

public class Solution {
    public void printSquarePattern(int lines) {
        int row = 1;

        while (row <= lines) {
            int col = 1;

            while (col <= lines) {
                System.out.print("*");
                col++;
            }

            System.out.println();
            row++;
        }
    }
}

/*
 * Enter number of lines:
 * 6
 * 
 * Result:
 * ******
 * ******
 * ******
 * ******
 * ******
 * ******
 */
