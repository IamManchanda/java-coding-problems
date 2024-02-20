import java.util.*;

/**
 * Min Rewards
 * https://www.algoexpert.io/questions/min-rewards
 * 
 * Approach: Brute Force
 * - Time complexity: O(n^2)
 * - Space complexity: O(n)
 * where, n is the length of the `scores` array.
 */

public class Solution {
    public int minRewards(int[] scores) {
        int n = scores.length;
        int[] rewards = new int[n];

        Arrays.fill(rewards, 1);

        for (int i = 1; i <= n - 1; i++) {
            int j = i - 1;

            if (scores[i] > scores[j]) {
                rewards[i] = rewards[j] + 1;
            } else {
                while (j >= 0 && scores[j] > scores[j + 1]) {
                    rewards[j] = Math.max(rewards[j], rewards[j + 1] + 1);
                    j--;
                }
            }
        }

        return Arrays.stream(rewards).sum();
    }
}

/*
 * Entered `scores`:
 * [8, 4, 2, 1, 3, 6, 7, 9, 5]
 * 
 * Result:
 * 25
 */
