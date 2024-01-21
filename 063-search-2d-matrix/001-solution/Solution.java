/**
 * Search a 2D Matrix
 * https://leetcode.com/problems/search-a-2d-matrix/
 * 
 * - Time Complexity: O(m + n)
 * - Space Complexity: O(1)
 * where,
 * - m = number of rows
 * - n = number of columns
 */

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = n - 1;

        while (i <= m - 1 && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (target < matrix[i][j]) {
                j--;
            } else { // target > matrix[i][j]
                i++;
            }
        }

        return false;
    }
}

/*
 * Enter number of rows in matrix:
 * 3
 * 
 * Enter number of columns in matrix:
 * 4
 * 
 * Enter row 1 (row index 0) :
 * Enter item 1 (column index 0) : 1
 * Enter item 2 (column index 1) : 3
 * Enter item 3 (column index 2) : 5
 * Enter item 4 (column index 3) : 7
 * 
 * Enter row 2 (row index 1) :
 * Enter item 1 (column index 0) : 10
 * Enter item 2 (column index 1) : 11
 * Enter item 3 (column index 2) : 16
 * Enter item 4 (column index 3) : 20
 * 
 * Enter row 3 (row index 2) :
 * Enter item 1 (column index 0) : 23
 * Enter item 2 (column index 1) : 30
 * Enter item 3 (column index 2) : 34
 * Enter item 4 (column index 3) : 60
 * 
 * Enter target to search for:
 * 3
 * 
 * Original Input (as a 2d array):
 * [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]]
 * 
 * Target to search for: 3
 * 
 * Result:
 * true
 */

/*
 * Enter number of rows in matrix:
 * 3
 * 
 * Enter number of columns in matrix:
 * 4
 * 
 * Enter row 1 (row index 0) :
 * Enter item 1 (column index 0) : 1
 * Enter item 2 (column index 1) : 3
 * Enter item 3 (column index 2) : 5
 * Enter item 4 (column index 3) : 7
 * 
 * Enter row 2 (row index 1) :
 * Enter item 1 (column index 0) : 10
 * Enter item 2 (column index 1) : 11
 * Enter item 3 (column index 2) : 16
 * Enter item 4 (column index 3) : 20
 * 
 * Enter row 3 (row index 2) :
 * Enter item 1 (column index 0) : 23
 * Enter item 2 (column index 1) : 30
 * Enter item 3 (column index 2) : 34
 * Enter item 4 (column index 3) : 60
 * 
 * Enter target to search for:
 * 13
 * 
 * Original Input (as a 2d array):
 * [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]]
 * 
 * Target to search for: 13
 * 
 * Result:
 * false
 */