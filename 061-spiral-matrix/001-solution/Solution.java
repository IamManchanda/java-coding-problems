import java.util.*;

/**
 * Spiral Matrix
 * https://leetcode.com/problems/spiral-matrix/description/
 * 
 * Approach: Traverse matrix in spiral order
 * - Time Complexity: O(n * m)
 * - Space Complexity: O(n * m)
 * where,
 * - n = number of rows in matrix
 * - m = number of columns in matrix
 */

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int x = matrix.length;
        int y = matrix[0].length;
        int si = 0, ei = x - 1, sj = 0, ej = y - 1;

        while (si <= ei && sj <= ej) {
            for (int j = sj; j <= ej; j++) {
                result.add(matrix[si][j]);
            }

            for (int i = si + 1; i <= ei; i++) {
                result.add(matrix[i][ej]);
            }

            for (int j = ej - 1; j >= sj; j--) {
                if (si == ei) {
                    break;
                }

                result.add(matrix[ei][j]);
            }

            for (int i = ei - 1; i >= si + 1; i--) {
                if (sj == ej) {
                    break;
                }

                result.add(matrix[i][sj]);
            }

            si++;
            ei--;
            sj++;
            ej--;
        }

        return result;
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
 * [1, 2, 3, 6, 9, 8, 7, 4, 5]
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
 * Original Input (as a 2d array):
 * [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
 * 
 * Result:
 * [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
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
 * [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
 */
