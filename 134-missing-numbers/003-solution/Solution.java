import java.util.Arrays;

/**
 * Missing Numbers
 * https://www.algoexpert.io/questions/missingNumbers
 * 
 * Approach: XOR
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int[] missingNumbers(int[] nums) {
        int n = nums.length;
        int solutionXOR = 0;

        for (int i = 0; i <= n + 2; i++) {
            solutionXOR ^= i;

            if (i < n) {
                solutionXOR ^= nums[i];
            }
        }

        int[] solution = new int[2];
        int setBit = solutionXOR & -solutionXOR;

        for (int i = 0; i <= n + 2; i++) {
            if ((i & setBit) == 0) {
                solution[0] ^= i;
            } else {
                solution[1] ^= i;
            }

            if (i < n) {
                if ((nums[i] & setBit) == 0) {
                    solution[0] ^= nums[i];
                } else {
                    solution[1] ^= nums[i];
                }
            }
        }

        Arrays.sort(solution);

        return solution;
    }
}

/*
 * Entered `nums`
 * [1, 4, 3]
 * 
 * Result:
 * [2, 5]
 */
