/**
 * Count Occurrences in a 2D Matrix
 */

public class Solution {
    public int countOccurrencesInMatrix(int[][] matrix, int target) {
        int x = matrix.length;
        int y = matrix[0].length;

        int count = 0;

        for (int i = 0; i <= x - 1; i++) {
            for (int j = 0; j <= y - 1; j++) {
                if (matrix[i][j] == target) {
                    count++;
                }
            }
        }

        return count;
    }
}

/*
 * Enter number of rows in matrix:
 * 2
 * 
 * Enter number of columns in matrix:
 * 3
 * 
 * Enter row 1 (row index 0) :
 * Enter item 1 (column index 0) : 4
 * Enter item 2 (column index 1) : 7
 * Enter item 3 (column index 2) : 8
 * 
 * Enter row 2 (row index 1) :
 * Enter item 1 (column index 0) : 8
 * Enter item 2 (column index 1) : 8
 * Enter item 3 (column index 2) : 7
 * 
 * Enter target to count for:
 * 7
 * 
 * Original Input (as a 2d array):
 * [[4, 7, 8], [8, 8, 7]]
 * 
 * Target to count for: 7
 * 
 * Result:
 * 2
 */