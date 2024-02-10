/**
 * Product of Array Except Self
 * https://leetcode.com/problems/product-of-array-except-self/
 * (Not submitted as I ended up coding a better solution)
 * 
 * Approach: Left and Right Product Lists
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        int currentLeftProduct = 1;
        for (int i = 0; i <= n - 1; i++) {
            left[i] = currentLeftProduct;
            currentLeftProduct *= nums[i];
        }

        int currentRightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = currentRightProduct;
            currentRightProduct *= nums[i];
        }

        for (int i = 0; i <= n - 1; i++) {
            result[i] = left[i] * right[i];
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
