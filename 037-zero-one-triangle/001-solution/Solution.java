/**
 * Problem: Print the 0-1 triangle pattern.
 */

public class Solution {
    public void printZeroOneTriangle(int lines) {
        for (int row = 1; row <= lines; row++) {
            for (int col = 1; col <= row; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
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
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 */
