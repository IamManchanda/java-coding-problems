import java.util.*;

/**
 * Beautiful Array
 * https://leetcode.com/problems/beautiful-array/description/
 * 
 * Approach: Iterative
 * - Time complexity: O(n log(n))
 * - Space complexity: O(n)
 */

public class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);

        for (int i = 2; i <= n; i++) {
            List<Integer> temp = new ArrayList<>();

            for (Integer e : ans) {
                if (2 * e <= n) {
                    temp.add(2 * e);
                }
            }

            for (Integer e : ans) {
                if (2 * e - 1 <= n) {
                    temp.add(2 * e - 1);
                }
            }

            ans = temp;
        }

        return transform(ans);
    }

    private int[] transform(List<Integer> list) {
        return list.stream().mapToInt(i -> i).toArray();
    }
}

/*
 * Enter `n`:
 * 4
 * 
 * Result:
 * [4, 2, 3, 1]
 */

/*
 * Enter `n`:
 * 5
 * 
 * Result:
 * [4, 2, 3, 5, 1]
 */
