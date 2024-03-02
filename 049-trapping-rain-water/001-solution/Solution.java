/**
 * Problem: Trapping rain water
 * https://leetcode.com/problems/trapping-rain-water/description/
 * 
 * Approach: Using arrays, store left right max boundaries
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int trap(int[] height) {
        int trappedWater = 0, n = height.length;
        int[] leftMax = getLeftMaxBoundaryList(height, n),
                rightMax = getRightMaxBoundaryList(height, n);

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    private int[] getLeftMaxBoundaryList(int[] height, int n) {
        int[] leftMax = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        return leftMax;
    }

    private int[] getRightMaxBoundaryList(int[] height, int n) {
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        return rightMax;
    }
}

/*
 * Entered `height` array:
 * [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
 * 
 * Result:
 * 6
 */

/*
 * Entered `height` array:
 * [4, 2, 0, 3, 2, 5]
 * 
 * Result:
 * 9
 */
