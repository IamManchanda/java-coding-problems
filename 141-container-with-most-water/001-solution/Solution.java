/**
 * Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/description/
 * (Not submitted as it's a brute force solution)
 * 
 * Approach: Brute Force
 * - Time complexity: O(n^2)
 * - Space complexity: O(1)
 */

public class Solution {
    public int maxArea(int[] height) {
        int n = height.length, max = 0;

        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                int h = Math.min(height[i], height[j]),
                        w = j - i,
                        area = h * w;
                max = Math.max(max, area);
            }
        }

        return max;
    }
}

/*
 * Entered `height`
 * [1, 8, 6, 2, 5, 4, 8, 3, 7]
 * 
 * Result:
 * 49
 */

/*
 * Entered `height`
 * [1, 1]
 * 
 * Result:
 * 1
 */