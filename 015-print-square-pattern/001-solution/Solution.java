/**
 * Problem: Print Square Pattern
 */

public class Solution {
    public void printSquarePattern(int lines) {
        for (int row = 1; row <= lines; row++) {
            for (int col = 1; col <= lines; col++) {
                System.out.print("*");
            }
            System.out.println();
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
