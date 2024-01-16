/**
 * Problem: Print Inverted star pattern.
 */

public class Solution {
    public void printInvertedStarPattern(int lines) {
        for (int row = 1; row <= lines; row++) {
            for (int col = 1; col <= lines - row + 1; col++) {
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
 * *****
 * ****
 * ***
 * **
 * *
 */
