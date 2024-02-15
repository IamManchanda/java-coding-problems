/**
 * Majority Element
 * https://leetcode.com/problems/majority-element/
 * 
 * Approach: Boyer-Moore Majority Voting Algorithm
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int answer = nums[0];

        for (int num : nums) {
            if (count == 0) {
                answer = num;
            }

            if (answer == num) {
                count++;
            } else {
                count--;
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
