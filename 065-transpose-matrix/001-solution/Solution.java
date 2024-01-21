/**
 * Transpose Matrix
 * https://leetcode.com/problems/transpose-matrix/description/
 * 
 * - Time Complexity: O(n * m)
 * - Space Complexity: O(n * m)
 * where,
 * n = number of rows in matrix
 * m = number of columns in matrix
 */

public class Solution {
    public int[][] transpose(int[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;

        int[][] transposedMatrix = new int[y][x];

        for (int i = 0; i <= x - 1; i++) {
            for (int j = 0; j <= y - 1; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }
}

/*
 * Enter number of rows in matrix:
 * 3
 * 
 * Enter number of columns in matrix:
 * 3
 * 
 * Enter row 1 (row index 0) :
 * Enter item 1 (column index 0) : 1
 * Enter item 2 (column index 1) : 2
 * Enter item 3 (column index 2) : 3
 * 
 * Enter row 2 (row index 1) :
 * Enter item 1 (column index 0) : 4
 * Enter item 2 (column index 1) : 5
 * Enter item 3 (column index 2) : 6
 * 
 * Enter row 3 (row index 2) :
 * Enter item 1 (column index 0) : 7
 * Enter item 2 (column index 1) : 8
 * Enter item 3 (column index 2) : 9
 * 
 * Original Input (as a 2d array):
 * [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
 * 
 * Result:
 * [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
 */

/*
 * Enter number of rows in matrix:
 * 2
 * 
 * Enter number of columns in matrix:
 * 3
 * 
 * Enter row 1 (row index 0) :
 * Enter item 1 (column index 0) : 1
 * Enter item 2 (column index 1) : 2
 * Enter item 3 (column index 2) : 3
 * 
 * Enter row 2 (row index 1) :
 * Enter item 1 (column index 0) : 4
 * Enter item 2 (column index 1) : 5
 * Enter item 3 (column index 2) : 6
 * 
 * Original Input (as a 2d array):
 * [[1, 2, 3], [4, 5, 6]]
 * 
 * Result:
 * [[1, 4], [2, 5], [3, 6]]
 */