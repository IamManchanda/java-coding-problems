/**
 * Problem: Print star pattern.
 * 
 * - Time complexity: O(n^2)
 * - Space complexity: O(1)
 */

public class Solution {
    public void printStarPattern(int lines) {
        for (int row = 1; row <= lines; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * Enter number:
 * 6
 * 
 * Result:
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 */
