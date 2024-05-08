/**
 * Flood Fill
 * https://leetcode.com/problems/flood-fill/description/
 * 
 * Approach: DFS
 * - Time complexity: O(n * m)
 * - Space complexity: O(n * m)
 */

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        int ogColor = image[sr][sc];

        dfs(image, sr, sc, color, vis, ogColor);

        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int color,
            boolean[][] vis, int ogColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length
                || vis[sr][sc] || image[sr][sc] != ogColor) {
            return;
        }

        vis[sr][sc] = true;
        image[sr][sc] = color;

        dfs(image, sr, sc - 1, color, vis, ogColor); // left
        dfs(image, sr, sc + 1, color, vis, ogColor); // right
        dfs(image, sr - 1, sc, color, vis, ogColor); // up
        dfs(image, sr + 1, sc, color, vis, ogColor); // down
    }
}

/*
 * Entered `image[][]` matrix:
 * [[1, 1, 1], [1, 1, 0], [1, 0, 1]]
 * 
 * Enter `sr` (row index) :
 * 1
 * 
 * Enter `sc` (column index) :
 * 1
 * 
 * Enter `color` :
 * 2
 * 
 * Result:
 * [[2, 2, 2], [2, 2, 0], [2, 0, 1]]
 */

/*
 * Entered `image[][]` matrix:
 * [[0, 0, 0], [0, 0, 0]]
 * 
 * Enter `sr` (row index) :
 * 0
 * 
 * Enter `sc` (column index) :
 * 0
 * 
 * Enter `color` :
 * 0
 * 
 * Result:
 * [[0, 0, 0], [0, 0, 0]]
 */