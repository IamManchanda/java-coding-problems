import java.util.*;

/**
 * Problem: Trapping rain water
 * https://leetcode.com/problems/trapping-rain-water/description/
 * 
 * Approach: Using stack
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int trappedWater = 0, n = height.length;

        for (int i = 0; i <= n - 1; i++) {
            while (!st.isEmpty() && height[st.peek()] < height[i]) {
                int topHeight = height[st.pop()];

                if (st.isEmpty()) {
                    break;
                }

                int distance = i - st.peek() - 1;
                int waterLevel = Math.min(height[st.peek()], height[i]) - topHeight;
                trappedWater += distance * waterLevel;
            }

            st.push(i);
        }

        return trappedWater;
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
