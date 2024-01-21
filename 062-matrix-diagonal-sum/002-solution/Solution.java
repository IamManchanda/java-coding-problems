/**
 * Matrix Diagonal Sum
 * https://leetcode.com/problems/matrix-diagonal-sum/description/
 * 
 * Approach: Linear Scan (Optimized)
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 */

public class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i <= n - 1; i++) {
            sum += mat[i][i];

            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
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
 * Enter item 2 (column index 1) : 1
 * Enter item 3 (column index 2) : 1
 * Enter item 4 (column index 3) : 1
 * 
 * Enter row 2 (row index 1) :
 * Enter item 1 (column index 0) : 1
 * Enter item 2 (column index 1) : 1
 * Enter item 3 (column index 2) : 1
 * Enter item 4 (column index 3) : 1
 * 
 * Enter row 3 (row index 2) :
 * Enter item 1 (column index 0) : 1
 * Enter item 2 (column index 1) : 1
 * Enter item 3 (column index 2) : 1
 * Enter item 4 (column index 3) : 1
 * 
 * Enter row 4 (row index 3) :
 * Enter item 1 (column index 0) : 1
 * Enter item 2 (column index 1) : 1
 * Enter item 3 (column index 2) : 1
 * Enter item 4 (column index 3) : 1
 * 
 * Original Input (as a 2d array):
 * [[1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1]]
 * 
 * Result:
 * 8
 */

/*
 * Enter number of rows in matrix:
 * 1
 * 
 * Enter number of columns in matrix:
 * 1
 * 
 * Enter row 1 (row index 0) :
 * Enter item 1 (column index 0) : 5
 * 
 * Original Input (as a 2d array):
 * [[5]]
 * 
 * Result:
 * 5
 */
