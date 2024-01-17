/**
 * Problem: Print a inverted rotated half pyramid pattern.
 */

public class Solution {
    public void printInvertedRotatedHalfPyramid(int lines) {
        for (int row = 1; row <= lines; row++) {
            for (int col = 1; col <= lines - row; col++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/*
 * Enter the number of lines:
 * 7
 * 
 * Result:
 * ______*
 * _____**
 * ____***
 * ___****
 * __*****
 * _******
 * *******
 * 
 * _ denotes a space.
 */