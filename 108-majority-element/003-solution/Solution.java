/**
 * Majority Element
 * https://leetcode.com/problems/majority-element/
 * 
 * Approach: Bit Manipulation
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int majorityElement(int[] nums) {
        int answer = 0, bitLimit = 32;

        for (int i = 0; i <= bitLimit - 1; i++) {
            int value = 1 << i;
            int onesCount = 0;

            for (int num : nums) {
                if ((num & value) != 0) {
                    onesCount++;
                }
            }

            if (onesCount > nums.length / 2) {
                answer += value;
            }
        }

        return answer;
    }
}

/*
 * Entered `nums`:
 * [3, 2, 3]
 * 
 * Result:
 * 3
 */

/*
 * Entered `nums`:
 * [2, 2, 1, 1, 1, 2, 2]
 * 
 * Result:
 * 2
 */
