import java.util.*;

/**
 * Next Greater Element
 * 
 * Approach: Using Stack
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] nextGreater = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }

            nextGreater[i] = st.isEmpty() ? -1 : nums[st.peek()];

            st.push(i);
        }

        return nextGreater;
    }
}

/*
 * Entered items in `nums`:
 * [6, 8, 0, 1, 3]
 * 
 * Result:
 * [8, -1, 1, 3, -1]
 */
