import java.util.*;

/**
 * Max length chain
 * https://www.geeksforgeeks.org/problems/max-length-chain/1
 * 
 * Approach: Sorting + Greedy
 * - Time complexity: O(n log n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int maxChainLength(Pair arr[], int n) {
        int maxChain, lastPairEnd;

        int[][] pairs = new int[n][2];

        for (int i = 0; i <= n - 1; i++) {
            pairs[i][0] = arr[i].x;
            pairs[i][1] = arr[i].y;
        }

        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

        maxChain = 1;
        lastPairEnd = pairs[0][1];

        for (int i = 1; i <= n - 1; i++) {
            if (pairs[i][0] > lastPairEnd) {
                maxChain++;
                lastPairEnd = pairs[i][1];
            }
        }

        return maxChain;
    }
}

/*
 * Entered `Pair[] arr`:
 * [[5, 24], [39, 60], [15, 28], [27, 40], [50, 90]]
 * 
 * Entered number of items `n`:
 * 5
 * 
 * Result:
 * 3
 */

/*
 * Entered `Pair[] arr`:
 * [[5, 10], [1, 11]]
 * 
 * Entered number of items `n`:
 * 2
 * 
 * Result:
 * 1
 */
