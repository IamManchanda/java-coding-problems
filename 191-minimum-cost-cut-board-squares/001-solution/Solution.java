import java.util.*;

/**
 * Minimum Cost to cut a board into squares
 * https://www.geeksforgeeks.org/problems/minimum-cost-to-cut-a-board-into-squares/1
 * 
 * Approach: Greedy algorithm
 * - Time complexity: O((M + N) * log(M + N))
 * - Space complexity: O(M + N)
 */
public class Solution {
    public int minimumCostOfBreaking(int[] X, int[] Y, int M, int N) {
        Integer[] hc = sort(X), vc = sort(Y);
        int hpt = 0, vpt = 0, hpc = 1, vpc = 1,
                hcn = hc.length, vcn = vc.length, cost = 0;

        while (hpt < hcn && vpt < vcn) {
            if (vc[vpt] <= hc[hpt]) {
                cost += hc[hpt++] * vpc;
                hpc++;
            } else {
                cost += vc[vpt++] * hpc;
                vpc++;
            }
        }

        while (hpt < hcn) {
            cost += hc[hpt++] * vpc;
            hpc++;
        }

        while (vpt < vcn) {
            cost += vc[vpt++] * hpc;
            vpc++;
        }

        return cost;
    }

    private Integer[] sort(int[] arr) {
        return Arrays.stream(arr).boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);
    }
}

/*
 * Entered `M`:
 * 6
 * 
 * Entered `N`:
 * 4
 * 
 * Entered `X[]`:
 * [2, 1, 3, 1, 4]
 * 
 * Entered `Y[]`:
 * [4, 1, 2]
 * 
 * Result:
 * 42
 */

/*
 * Entered `M`:
 * 4
 * 
 * Entered `N`:
 * 4
 * 
 * Entered `X[]`:
 * [1, 1, 1]
 * 
 * Entered `Y[]`:
 * [1, 1, 1]
 * 
 * Result:
 * 15
 */
