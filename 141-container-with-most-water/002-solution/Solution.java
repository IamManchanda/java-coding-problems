/**
 * Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/description/
 * 
 * Approach: Two Pointers
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int maxArea(int[] height) {
        int n = height.length,
                max = 0,
                l = 0,
                r = n - 1;

        while (l < r) {
            int h = Math.min(height[l], height[r]),
                    w = r - l,
                    area = h * w;
            max = Math.max(max, area);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
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