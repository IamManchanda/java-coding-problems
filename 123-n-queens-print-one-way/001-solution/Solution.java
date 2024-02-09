/**
 * N-Queens: Print one possible solution for
 * placing n queens on an n x n chessboard.
 */

public class Solution {
    public void nQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                board[i][j] = 'x';
            }
        }

        if (checkNQueens(board, 0)) {
            System.out.println("Solution exists.");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    private boolean checkNQueens(char[][] board, int i) {
        int n = board.length;

        if (i == n) {
            return true;
        }

        for (int j = 0; j <= n - 1; j++) {
            if (isSafe(board, i, j)) {
                board[i][j] = 'Q';

                if (checkNQueens(board, i + 1)) {
                    return true;
                }

                board[i][j] = 'x';
            }
        }

        return false;
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

    private void printBoard(char[][] board) {
        int n = board.length;

        System.out.println("-----Chess Board-----");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
 * Enter n:
 * 4
 * 
 * Result:
 * Solution exists.
 * -----Chess Board-----
 * x Q x x
 * x x x Q
 * Q x x x
 * x x Q x
 */

/*
 * Enter n:
 * 3
 * 
 * Result:
 * No solution exists.
 */
