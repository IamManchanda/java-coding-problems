import java.util.*;

/**
 * Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/description/
 * 
 * Approach: Using Sets
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
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
