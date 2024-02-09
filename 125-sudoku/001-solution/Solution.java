/**
 * Sudoku Solver
 * https://leetcode.com/problems/sudoku-solver/description/
 */

public class Solution {
    private static int n = 9; // 9x9 sudoku
    private static char nd = (char) (n + '0');

    public void solveSudoku(char[][] board) {
        solveSudoku(board, 0, 0);
    }

    private boolean solveSudoku(char[][] sudoku, int i, int j) {
        if (i == n) {
            return true;
        }

        int ni = i, nj = j + 1;

        if (nj == n) {
            ni = i + 1;
            nj = 0;
        }

        if (sudoku[i][j] != '.') {
            return solveSudoku(sudoku, ni, nj);
        }

        for (char d = '1'; d <= nd; d++) {
            if (isSafe(sudoku, i, j, d)) {
                sudoku[i][j] = d;

                if (solveSudoku(sudoku, ni, nj)) {
                    return true;
                }

                sudoku[i][j] = '.';
            }
        }

        return false;
    }

    private boolean isSafe(char[][] sudoku, int i, int j, char d) {
        // Check column
        for (int x = 0; x <= n - 1; x++) {
            if (sudoku[i][x] == d) {
                return false;
            }
        }

        // Check row
        for (int y = 0; y <= n - 1; y++) {
            if (sudoku[y][j] == d) {
                return false;
            }
        }

        // Check sub-grid
        int si = (i / 3) * 3;
        int sj = (j / 3) * 3;
        for (int x = si; x <= si + 2; x++) {
            for (int y = sj; y <= sj + 2; y++) {
                if (sudoku[x][y] == d) {
                    return false;
                }
            }
        }

        return true;
    }
}

/*
 * Input `board`:
 * 5 3 . . 7 . . . .
 * 6 . . 1 9 5 . . .
 * . 9 8 . . . . 6 .
 * 8 . . . 6 . . . 3
 * 4 . . 8 . 3 . . 1
 * 7 . . . 2 . . . 6
 * . 6 . . . . 2 8 .
 * . . . 4 1 9 . . 5
 * . . . . 8 . . 7 9
 * 
 * Output `board`:
 * 5 3 4 6 7 8 9 1 2
 * 6 7 2 1 9 5 3 4 8
 * 1 9 8 3 4 2 5 6 7
 * 8 5 9 7 6 1 4 2 3
 * 4 2 6 8 5 3 7 9 1
 * 7 1 3 9 2 4 8 5 6
 * 9 6 1 5 3 7 2 8 4
 * 2 8 7 4 1 9 6 3 5
 * 3 4 5 2 8 6 1 7 9
 */