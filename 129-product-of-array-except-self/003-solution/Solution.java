/**
 * Product of Array Except Self
 * https://leetcode.com/problems/product-of-array-except-self/
 * { Submitted Optimized Solution }
 * 
 * Approach: Left and Right Product Lists (Optimized)
 * - Time complexity: O(n)
 * - Space complexity: O(n) { O(1) extra space }
 */

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int currentLeftProduct = 1;
        for (int i = 0; i <= n - 1; i++) {
            result[i] = currentLeftProduct;
            currentLeftProduct *= nums[i];
        }

        int currentRightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= currentRightProduct;
            currentRightProduct *= nums[i];
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
