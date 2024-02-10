/**
 * Rat in a Maze
 */

public class Solution {
    public void solveMaze(int[][] maze) {
        int n = maze.length;
        int[][] sol = new int[n][n];

        if (solveMaze(maze, 0, 0, sol) == false) {
            System.out.println("Solution doesn't exist");
            return;
        }

        System.out.println("Solution exists:");
        Helpers.printMaze(sol);
    }

    private boolean solveMaze(int[][] maze, int x, int y, int[][] sol) {
        int n = maze.length;

        if (x == n - 1 && y == n - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            if (sol[x][y] == 1) {
                return false;
            }

            sol[x][y] = 1;

            // Move right
            if (solveMaze(maze, x + 1, y, sol)) {
                return true;
            }

            // Move down
            if (solveMaze(maze, x, y + 1, sol)) {
                return true;
            }

            sol[x][y] = 0;

            return false;
        }

        return false;
    }

    private boolean isSafe(int[][] maze, int x, int y) {
        int n = maze.length;
        boolean xBound = x >= 0 && x <= n - 1;
        boolean yBound = y >= 0 && y <= n - 1;

        return xBound && yBound && maze[x][y] == 1;
    }
}

/*
 * Input `maze`:
 * 1 0 0 0
 * 1 1 0 1
 * 0 1 0 0
 * 1 1 1 1
 * 
 * Result:
 * Solution exists:
 * 1 0 0 0
 * 1 1 0 0
 * 0 1 0 0
 * 0 1 1 1
 */
