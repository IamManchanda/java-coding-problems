import java.util.List;

/**
 * Pair Sum for the Rotated Sorted ArrayList
 * 
 * Approach: Two Pointers (l, r on opposite sides of the pivot)
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public boolean pairSum(List<Integer> list, int target) {
        int n = list.size(), pivot = -1;

        for (int i = 0; i <= n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        int l = pivot + 1, r = pivot;

        while (l != r) {
            int left = list.get(l), right = list.get(r);

            if (left + right == target) {
                return true;
            }

            if (left + right < target) {
                l = (l + 1) % n;
            } else {
                r = (n + r - 1) % n;
            }
        }

        return false;
    }
}

/*
 * Entered `list`
 * [11, 15, 6, 8, 9, 10]
 * 
 * Enter `target`:
 * 16
 * 
 * Result:
 * true
 */
