import java.util.List;

/**
 * Pair Sum for the Sorted ArrayList
 * 
 * Approach: Brute Force
 * - Time complexity: O(n^2)
 * - Space complexity: O(1)
 */

public class Solution {
    public boolean pairSum(List<Integer> list, int target) {
        int n = list.size();
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
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
