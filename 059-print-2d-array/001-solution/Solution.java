/**
 * Print 2D array
 */

public class Solution {
    public void print2DArray(int[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;

        for (int i = 0; i <= x - 1; i++) {
            for (int j = 0; j <= y - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
 * Enter number of rows in matrix:
 * 3
 * 
 * Enter number of columns in matrix:
 * 3
 * 
 * Enter row 1:
 * Enter item 1: 1
 * Enter item 2: 2
 * Enter item 3: 3
 * 
 * Enter row 2:
 * Enter item 1: 4
 * Enter item 2: 5
 * Enter item 3: 6
 * 
 * Enter row 3:
 * Enter item 1: 7
 * Enter item 2: 8
 * Enter item 3: 9
 * 
 * Original Input (as an array):
 * [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
 * 
 * Result (as a matrix):
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */
