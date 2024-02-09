/**
 * N-Queens: Count all possible solutions for
 * placing n queens on an n x n chessboard.
 * 
 * Approach: Backtracking
 * - Time Complexity: O(n!)
 * - Space Complexity: O(n^2)
 * Note: For learning purposes, Bad time/space complexity is expected.
 */

public class Solution {
    private static int count = 0;

    public int nQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);

        return count;
    }

    private void nQueens(char[][] board, int i) {
        int n = board.length;

        if (i == n) {
            count++;
            return;
        }

        for (int j = 0; j <= n - 1; j++) {
            if (isSafe(board, i, j)) {
                board[i][j] = 'Q';
                nQueens(board, i + 1);
                board[i][j] = 'x';
            }
        }
    }

    private boolean isSafe(char[][] board, int i, int j) {
        int n = board.length;

        // Check vertically up
        for (int k = n - 1; k >= 0; k--) {
            if (board[k][j] == 'Q') {
                return false;
            }
        }

        // Check diagonally left up
        for (int k = i - 1, l = j - 1; k >= 0 && l >= 0; k--, l--) {
            if (board[k][l] == 'Q') {
                return false;
            }
        }

        // Check diagonally right up
        for (int k = i - 1, l = j + 1; k >= 0 && l <= n - 1; k--, l++) {
            if (board[k][l] == 'Q') {
                return false;
            }
        }

        return true;
    }
}

/*
 * Enter n:
 * 4
 * 
 * Result:
 * 2
 */

/*
 * Enter n:
 * 5
 * 
 * Result:
 * 10
 */
