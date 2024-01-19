import java.util.*;

/**
 * 3Sum
 * https://leetcode.com/problems/3sum/description/
 * (Not submitted as it is a brute force solution)
 * 
 * Approach: Brute Force
 * - Time complexity: O(n^3)
 * - Space complexity: O(n)
 */

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> results = new ArrayList<List<Integer>>();

        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                for (int k = j + 1; k <= n - 1; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        results.add(triplet);
                    }
                }
            }
        }

        // Remove duplicates using LinkedHashSet
        results = new ArrayList<List<Integer>>(
                new LinkedHashSet<List<Integer>>(results));

        return results;
    }
}

/*
 * Enter number of items:
 * 6
 * 
 * Enter items:
 * Enter item 1: -1
 * Enter item 2: 0
 * Enter item 3: 1
 * Enter item 4: 2
 * Enter item 5: -1
 * Enter item 6: -4
 * 
 * Original Input (as an array):
 * [-1, 0, 1, 2, -1, -4]
 * 
 * Result:
 * [[-1, 0, 1], [-1, -1, 2]]
 */

/*
 * Enter number of items:
 * 3
 * 
 * Enter items:
 * Enter item 1: 0
 * Enter item 2: 1
 * Enter item 3: 1
 * 
 * Original Input (as an array):
 * [0, 1, 1]
 * 
 * Result:
 * []
 */

/*
 * Enter number of items:
 * 3
 * 
 * Enter items:
 * Enter item 1: 0
 * Enter item 2: 0
 * Enter item 3: 0
 * 
 * Original Input (as an array):
 * [0, 0, 0]
 * 
 * Result:
 * [[0, 0, 0]]
 */
