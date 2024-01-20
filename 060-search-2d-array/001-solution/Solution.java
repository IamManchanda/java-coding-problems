import java.util.*;

/**
 * Search 2D array
 */

public class Solution {
    public Map<String, Integer> search2DArray(int[][] matrix, int key) {
        int x = matrix.length;
        int y = matrix[0].length;
        Map<String, Integer> result = new HashMap<String, Integer>();

        for (int i = 0; i <= x - 1; i++) {
            for (int j = 0; j <= y - 1; j++) {
                if (matrix[i][j] == key) {
                    result.put("x", i);
                    result.put("y", j);
                    return result;
                }
            }
        }

        result.put("x", -1);
        result.put("y", -1);
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
 * Enter key to search for:
 * 5
 * 
 * Original Input (as a 2d array):
 * [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
 * 
 * Key to search for: 5
 * 
 * Result:
 * Key found at cell: (1, 1)
 */
