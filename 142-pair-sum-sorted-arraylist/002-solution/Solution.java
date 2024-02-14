import java.util.List;

/**
 * Pair Sum for the Sorted ArrayList
 * 
 * Approach: Two Pointers
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public boolean pairSum(List<Integer> list, int target) {
        int l = 0, r = list.size() - 1;

        while (l < r) {
            int sum = list.get(l) + list.get(r);

            if (sum == target) {
                return true;
            } else if (sum < target) {
                l++;
            } else { // sum > target
                r--;
            }
        }

        return false;
    }
}

/*
 * Entered `list`
 * [1, 2, 3, 4, 5, 6]
 * 
 * Enter `target`:
 * 5
 * 
 * Result:
 * true
 */
