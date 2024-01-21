/**
 * Matrix Diagonal Sum
 * https://leetcode.com/problems/matrix-diagonal-sum/description/
 * (Not submitted as it's a brute force solution)
 * 
 * Approach: Brute Force
 * - Time Complexity: O(n^2)
 * - Space Complexity: O(1)
 */

public class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (i == j) {
                    sum += mat[i][j];
                } else if (i + j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }

        return sum;
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
 * 25
 */

/*
 * Enter number of rows in matrix:
 * 4
 * 
 * Enter number of columns in matrix:
 * 4
 * 
 * Enter row 1 (row index 0) :
 * Enter item 1 (column index 0) : 1
 * Enter item 2 (column index 1) : 2
 * Enter item 3 (column index 2) : 3
 * Enter item 4 (column index 3) : 4
 * 
 * Enter row 2 (row index 1) :
 * Enter item 1 (column index 0) : 5
 * Enter item 2 (column index 1) : 6
 * Enter item 3 (column index 2) : 7
 * Enter item 4 (column index 3) : 8
 * 
 * Enter row 3 (row index 2) :
 * Enter item 1 (column index 0) : 9
 * Enter item 2 (column index 1) : 10
 * Enter item 3 (column index 2) : 11
 * Enter item 4 (column index 3) : 12
 * 
 * Enter row 4 (row index 3) :
 * Enter item 1 (column index 0) : 13
 * Enter item 2 (column index 1) : 14
 * Enter item 3 (column index 2) : 15
 * Enter item 4 (column index 3) : 16
 * 
 * Original Input (as a 2d array):
 * [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
 * 
 * Result:
 * 68
 */