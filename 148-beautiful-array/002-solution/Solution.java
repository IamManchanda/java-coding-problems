import java.util.*;

/**
 * Beautiful Array
 * https://leetcode.com/problems/beautiful-array/description/
 * 
 * Approach: Divide and Conquer
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> res = new ArrayList<>();

        divideAndConquer(1, 1, res, n);

        return transform(res);
    }

    private void divideAndConquer(int start, int increment, List<Integer> res, int n) {
        if (start + increment > n) {
            res.add(start);
            return;
        }

        divideAndConquer(start, increment * 2, res, n);
        divideAndConquer(start + increment, increment * 2, res, n);
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
 * [1, 3, 2, 4]
 */

/*
 * Enter `n`:
 * 5
 * 
 * Result:
 * [1, 5, 3, 2, 4]
 */
