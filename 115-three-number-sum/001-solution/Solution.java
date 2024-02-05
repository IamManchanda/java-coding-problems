import java.util.*;

/**
 * Three Number Sum
 * https://www.algoexpert.io/questions/three-number-sum
 * 
 * Approach: Two Pointers
 * - Time Complexity: O(n^2)
 * - Space Complexity: O(1)
 */

public class Solution {
    public List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);

        List<Integer[]> triplets = new ArrayList<Integer[]>();
        int n = array.length;

        for (int i = 0; i <= n - 3; i++) {
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int currentSum = array[i] + array[l] + array[r];

                if (currentSum == targetSum) {
                    Integer[] triplet = { array[i], array[l], array[r] };
                    triplets.add(triplet);
                    l++;
                    r--;
                } else if (currentSum < targetSum) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return triplets;
    }
}

/*
 * Entered `array`:
 * [12, 3, 1, 2, -6, 5, -8, 6]
 * 
 * Enter `targetSum`:
 * 0
 * 
 * Result:
 * [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
 */
