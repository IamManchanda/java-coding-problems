import java.util.*;

/**
 * Non-Constructible Change
 * https://www.algoexpert.io/questions/non-constructible-change
 * 
 * Approach: Greedy Algorithm
 * - Time Complexity: O(n log n)
 * - Space Complexity: O(1)
 */

public class Solution {
    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);

        int change = 0;

        for (int coin : coins) {
            if (coin > change + 1) {
                break;
            }

            change += coin;
        }

        return change + 1;
    }
}

/*
 * Entered `coins`:
 * [5, 7, 1, 1, 2, 3, 22]
 * 
 * Result:
 * 20
 */
