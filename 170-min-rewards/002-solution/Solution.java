import java.util.*;

/**
 * Min Rewards
 * https://www.algoexpert.io/questions/min-rewards
 * 
 * Approach: Two Pass (Optimal)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 * where, n is the length of the `scores` array.
 */

public class Solution {
    public int minRewards(int[] scores) {
        int n = scores.length;
        int[] rewards = new int[n];

        Arrays.fill(rewards, 1);

        for (int i = 1; i <= n - 1; i++) {
            if (scores[i] > scores[i - 1]) {
                rewards[i] = rewards[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (scores[i] > scores[i + 1]) {
                rewards[i] = Math.max(rewards[i], rewards[i + 1] + 1);
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
