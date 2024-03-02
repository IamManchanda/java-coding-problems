import java.util.*;

/**
 * Largest Rectangle in Histogram
 * https://leetcode.com/problems/largest-rectangle-in-histogram/description/
 * 
 * Approach: Using Stack (ArrayDeque)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0, n = heights.length, height, width, currArea;
        int[] nsr = nextSmaller(heights, n, true),
                nsl = nextSmaller(heights, n, false);

        for (int i = 0; i <= n - 1; i++) {
            height = heights[i];
            width = nsr[i] - nsl[i] - 1;
            currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }

    private int[] nextSmaller(int[] heights, int n, boolean toRight) {
        int defaultIndex = toRight ? n : -1;
        int[] result = new int[n];
        ArrayDeque<Integer> st = new ArrayDeque<>();

        for (int i = toRight ? n - 1 : 0; toRight ? i >= 0 : i <= n - 1; i += toRight ? -1 : 1) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            result[i] = st.isEmpty() ? defaultIndex : st.peek();

            st.push(i);
        }

        return result;
    }
}

/*
 * Entered `heights`:
 * [2, 1, 5, 6, 2, 3]
 * 
 * Result:
 * 10
 */

/*
 * Entered `heights`:
 * [2, 4]
 * 
 * Result:
 * 4
 */
