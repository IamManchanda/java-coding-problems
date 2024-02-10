/**
 * Product of Array Except Self
 * https://leetcode.com/problems/product-of-array-except-self/
 * (Not submitted as it is brute force)
 * 
 * Approach: Brute Force
 * - Time complexity: O(n^2)
 * - Space complexity: O(n) { O(1) extra space }
 */

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            int product = 1;
            for (int j = 0; j <= n - 1; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }

            result[i] = product;
        }

        return result;
    }
}

/*
 * Entered `nums`
 * [1, 2, 3, 4]
 * 
 * Result:
 * [24, 12, 8, 6]
 */

/*
 * Entered `nums`
 * [-1, 1, 0, -3, 3]
 * 
 * Result:
 * [0, 0, 9, 0, 0]
 */

/*
 * Entered `nums`
 * [5, 1, 4, 2]
 * 
 * Result:
 * [8, 40, 10, 20]
 */
