/**
 * Problem: Print Half Pyramid pattern.
 */

public class Solution {
    public void printHalfPyramid(int lines) {
        for (int row = 1; row <= lines; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

/*
 * Enter number of lines:
 * 7
 * 
 * Result:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 */
