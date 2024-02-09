public class Helpers {
    private static int n = 9; // 9x9 sudoku

    public static void printSudoku(char[][] sudoku) {
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}
