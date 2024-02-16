/**
 * Most Frequent Number Following Key in an Array
 * https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/
 * 
 * Approach: Counting frequency and finding maximum
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

public class Solution {
    private final static int MAX_LENGTH = 1000; // constraint

    public int mostFrequent(int[] nums, int key) {
        int n = nums.length;
        int[] result = new int[MAX_LENGTH];

        for (int i = 0; i <= n - 2; i++) {
            if (nums[i] == key) {
                result[nums[i + 1] - 1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (int i = 0; i <= MAX_LENGTH - 1; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;
            }
        }

        return ans;
    }
}

/*
 * Entered `nums`
 * [1, 100, 200, 1, 100]
 * 
 * Enter `key`:
 * 1
 * 
 * Result:
 * 100
 */

/*
 * Entered `nums`
 * [2, 2, 2, 2, 3]
 * 
 * Enter `key`:
 * 1
 * 
 * Result:
 * 1
 */
