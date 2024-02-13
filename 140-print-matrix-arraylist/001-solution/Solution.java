import java.util.List;

/**
 * Print matrix using ArrayList
 */

public class Solution {
    public void printMatrix(List<List<Integer>> mainList) {
        int n = mainList.size();
        for (int i = 0; i <= n - 1; i++) {
            List<Integer> currList = mainList.get(i);
            int m = currList.size();
            for (int j = 0; j <= m - 1; j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}

/*
 * Entered `mainList`
 * [[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15]]
 * 
 * Result:
 * 1 2 3 4 5
 * 2 4 6 8 10
 * 3 6 9 12 15
 */
