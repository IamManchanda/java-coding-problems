/**
 * Missing Numbers
 * https://www.algoexpert.io/questions/missingNumbers
 * 
 * Approach: Mathematically calculate the Missing Numbers
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int[] missingNumbers(int[] nums) {
        int n = nums.length;
        int total = 0;
        int numsTotal = 0;

        for (int i = 1; i <= n + 2; i++) {
            total += i;
        }

        for (int num : nums) {
            numsTotal += num;
        }

        int diff = total - numsTotal;
        int avr = diff / 2;
        int foundFirstHalf = 0;
        int foundSecondHalf = 0;

        for (int num : nums) {
            if (num <= avr) {
                foundFirstHalf += num;
            } else {
                foundSecondHalf += num;
            }
        }

        int expectedFirstHalf = 0;

        for (int i = 1; i <= avr; i++) {
            expectedFirstHalf += i;
        }

        int expectedSecondHalf = 0;

        for (int i = avr + 1; i <= n + 2; i++) {
            expectedSecondHalf += i;
        }

        int diffFirstHalf = expectedFirstHalf - foundFirstHalf;
        int diffSecondHalf = expectedSecondHalf - foundSecondHalf;

        return new int[] { diffFirstHalf, diffSecondHalf };
    }
}

/*
 * Entered `nums`
 * [1, 4, 3]
 * 
 * Result:
 * [2, 5]
 */
