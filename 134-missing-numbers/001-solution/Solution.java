import java.util.*;

/**
 * Missing Numbers
 * https://www.algoexpert.io/questions/missingNumbers
 * 
 * Approach: Hash Table (HashSet)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int[] missingNumbers(int[] nums) {
        int n = nums.length;
        int[] solution = new int[] { -1, -1 };
        Set<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            numsSet.add(num);
        }

        for (int i = 1; i <= n + 2; i++) {
            if (!numsSet.contains(i)) {
                if (solution[0] == -1) {
                    solution[0] = i;
                } else {
                    solution[1] = i;
                    break;
                }
            }
        }

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
