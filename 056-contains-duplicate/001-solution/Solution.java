/**
 * Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/description/
 * (Not submitted as it is a brute force solution)
 * 
 * Approach: Brute force
 * - Time complexity: O(n^2)
 * - Space complexity: O(1)
 */

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}

/*
 * Enter number of items:
 * 4
 * 
 * Enter items:
 * Enter item 1: 1
 * Enter item 2: 2
 * Enter item 3: 3
 * Enter item 4: 1
 * 
 * Original Input (as an array):
 * [1, 2, 3, 1]
 * 
 * Result:
 * true
 */

/*
 * Enter number of items:
 * 4
 * 
 * Enter items:
 * Enter item 1: 1
 * Enter item 2: 2
 * Enter item 3: 3
 * Enter item 4: 4
 * 
 * Original Input (as an array):
 * [1, 2, 3, 4]
 * 
 * Result:
 * false
 */

/*
 * Enter number of items:
 * 10
 * 
 * Enter items:
 * Enter item 1: 1
 * Enter item 2: 1
 * Enter item 3: 1
 * Enter item 4: 3
 * Enter item 5: 3
 * Enter item 6: 4
 * Enter item 7: 3
 * Enter item 8: 2
 * Enter item 9: 4
 * Enter item 10: 2
 * 
 * Original Input (as an array):
 * [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
 * 
 * Result:
 * true
 */