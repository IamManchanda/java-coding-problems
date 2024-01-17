/**
 * Problem: Print a inverted half pyramid numbers pattern.
 */

public class Solution {
    public void printInvertedHalfPyramidNumbers(int lines) {
        for (int row = 1; row < lines; row++) {
            for (int col = 1; col <= lines - row + 1; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}

/*
 * Enter the number of lines:
 * 5
 * 
 * Result:
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 */
