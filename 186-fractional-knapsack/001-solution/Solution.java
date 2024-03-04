import java.util.*;

/**
 * Fractional Knapsack
 * https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
 * 
 * Approach: Greedy Algorithm
 * - Time complexity: O(n log n)
 * - Space complexity: O(n)
 */

public class Solution {
    public double fractionalKnapsack(int W, Item[] arr, int n) {
        double maxProfit = 0.0;
        double[][] ratio = new double[n][2];

        for (int i = 0; i <= n - 1; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) arr[i].value / arr[i].weight;
        }

        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        for (int i = 0; i <= n - 1; i++) {
            int idx = (int) ratio[i][0];

            if (arr[idx].weight <= W) {
                maxProfit += arr[idx].value;
                W -= arr[idx].weight;
            } else {
                maxProfit += (double) arr[idx].value * W / arr[idx].weight;
                W = 0;
                break;
            }
        }

        return maxProfit;
    }
}

/*
 * Enter maximum weight `W`:
 * 50
 * 
 * Entered `int[] value`:
 * [60, 100, 120]
 * 
 * Entered `int[] weight`:
 * [10, 20, 30]
 * 
 * Entered `Item[] arr`:
 * [[60, 10], [100, 20], [120, 30]]
 * 
 * Entered number of items `n`:
 * 3
 * 
 * Result:
 * 240.0
 */

/*
 * Enter maximum weight `W`:
 * 50
 * 
 * Entered `int[] value`:
 * [60, 100]
 * 
 * Entered `int[] weight`:
 * [10, 20]
 * 
 * Entered `Item[] arr`:
 * [[60, 10], [100, 20]]
 * 
 * Entered number of items `n`:
 * 2
 * 
 * Result:
 * 160.0
 */
