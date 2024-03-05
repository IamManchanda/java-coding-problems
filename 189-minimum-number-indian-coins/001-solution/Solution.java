import java.util.*;

/**
 * Minimum number of Coins (Indian coins)
 * https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
 * 
 * Approach: Sorting (Descending) + Greedy Algorithm
 * - Time complexity: O(n)
 * - Space complexity: O(1) auxiliary
 * where, n = number of coins
 */

public class Solution {
    private static final Integer[] COINS = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 }; // Indian coins

    public List<Integer> minPartition(int N) {
        Arrays.sort(COINS, Comparator.reverseOrder());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < COINS.length; i++) {
            if (COINS[i] <= N) {
                while (COINS[i] <= N) {
                    result.add(COINS[i]);
                    N -= COINS[i];
                }
            }
        }

        return result;
    }
}

/*
 * Enter Rs `N`:
 * 43
 * 
 * Result:
 * [20, 20, 2, 1]
 */

/*
 * Enter Rs `N`:
 * 1000
 * 
 * Result:
 * [500, 500]
 */
