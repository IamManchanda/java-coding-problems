import java.util.*;

/**
 * Longest Increasing Subsequence
 * https://leetcode.com/problems/longest-increasing-subsequence/
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-Up / Tabulation)
 * - Time complexity: O(n^2)
 * - Space complexity: O(n^2)
 * where, n is the length of the input array `nums[]`.
 */

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] sortedNums = getSortedNums(nums);

        return longestCommonSubsequence(nums, sortedNums);
    }

    private int[] getSortedNums(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;

        for (int num : set) {
            result[i++] = num;
        }

        Arrays.sort(result);

        return result;
    }

    private int longestCommonSubsequence(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[][] dp = new int[n1 + 1][n2 + 1];
        fill(dp, 0); // can be omitted, default value is 0

        for (int i = 1; i <= n1; i++) {
            int li1 = i - 1;

            for (int j = 1; j <= n2; j++) {
                int li2 = j - 1;

                if (arr1[li1] == arr2[li2]) {
                    dp[i][j] = dp[li1][li2] + 1;
                } else {
                    dp[i][j] = Math.max(dp[li1][j], dp[i][li2]);
                }
            }
        }

        return dp[n1][n2];
    }

    private void fill(int[][] dp, int value) {
        // fills every item in the first row and first column
        // of the 2D array with the given value
        Arrays.fill(dp[0], value); // fills first row
        Arrays.stream(dp).forEach(row -> row[0] = value); // fills first column
    }
}

/**
 * Entered `nums[]`:
 * [10, 9, 2, 5, 3, 7, 101, 18]
 * 
 * Result:
 * 4
 */

/*
 * Entered `nums[]`:
 * [0, 1, 0, 3, 2, 3]
 * 
 * Result:
 * 4
 */

/*
 * Entered `nums[]`:
 * [7, 7, 7, 7, 7, 7, 7]
 * 
 * Result:
 * 1
 */
