/**
 * Problem: Print a floyd's triangle pattern.
 */

public class Solution {
    public void printFloydsTriangle(int lines) {
        int counter = 1;
        for (int row = 1; row <= lines; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(counter + " ");
                counter++;
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
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 * 16 17 18 19 20 21
 * 22 23 24 25 26 27 28
 */
