/**
 * Problem: Trapping rain water
 * https://leetcode.com/problems/trapping-rain-water/description/
 * 
 * Time complexity: O(n)
 * Space complexity: O(n)
 */

public class Solution {
    public int trap(int[] height) {
        int trappedWater = 0;
        int n = height.length;
        int[] leftMax = getLeftMaxBoundaryList(height, n);
        int[] rightMax = getRightMaxBoundaryList(height, n);

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
 * Enter number of items in the `height` array:
 * 12
 * 
 * Enter items:
 * Enter item 1: 0
 * Enter item 2: 1
 * Enter item 3: 0
 * Enter item 4: 2
 * Enter item 5: 1
 * Enter item 6: 0
 * Enter item 7: 1
 * Enter item 8: 3
 * Enter item 9: 2
 * Enter item 10: 1
 * Enter item 11: 2
 * Enter item 12: 1
 * 
 * Original Input (`height` array):
 * [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
 * 
 * Result:
 * 6
 */

/*
 * Enter number of items in the `height` array:
 * 6
 * 
 * Enter items:
 * Enter item 1: 4
 * Enter item 2: 2
 * Enter item 3: 0
 * Enter item 4: 3
 * Enter item 5: 2
 * Enter item 6: 5
 * 
 * Original Input (`height` array):
 * [4, 2, 0, 3, 2, 5]
 * 
 * Result:
 * 9
 */
