/**
 * Transpose Matrix
 * https://www.algoexpert.io/questions/transpose-matrix
 * 
 * Approach: Iterative
 * - Time Complexity: O(n * m)
 * - Space Complexity: O(n * m)
 * where, n = number of rows,
 * and, m = number of columns
 */

public class Solution {
    public int[][] transposeMatrix(int[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;
        int[][] transposedMatrix = new int[y][x];

        for (int j = 0; j <= y - 1; j++) {
            for (int i = 0; i <= x - 1; i++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }
}

/*
 * Entered `matrix`:
 * [[1, 2, 3], [4, 5, 6]]
 * 
 * Result:
 * [[1, 4], [2, 5], [3, 6]]
 */
