import java.util.*;

/**
 * Four Number Sum
 * https://www.algoexpert.io/questions/four-number-sum
 * 
 * Approach: Hash Table (HashMap)
 * - Time Complexity: O(n^2) average, O(n^3) worst case
 * - Space Complexity: O(n^2)
 */

public class Solution {
    public List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        int n = array.length;
        Map<Integer, List<Integer[]>> allPairSums = new HashMap<>();
        List<Integer[]> quadruplets = new ArrayList<>();

        for (int i = 1; i <= n - 2; i++) {
            if (i != 1) {
                for (int j = i + 1; j <= n - 1; j++) {
                    int currentSum = array[i] + array[j];
                    int difference = targetSum - currentSum;

                    if (allPairSums.containsKey(difference)) {
                        List<Integer[]> pairGroup = allPairSums.get(difference);

                        for (Integer[] pair : pairGroup) {
                            Integer[] newQuadruplet = { pair[0], pair[1], array[i], array[j] };
                            quadruplets.add(newQuadruplet);
                        }
                    }
                }
            }

            for (int k = 0; k <= i - 1; k++) {
                int currentSum = array[k] + array[i];
                Integer[] pair = { array[k], array[i] };

                if (!allPairSums.containsKey(currentSum)) {
                    List<Integer[]> newPairGroup = new ArrayList<>();
                    newPairGroup.add(pair);
                    allPairSums.put(currentSum, newPairGroup);
                } else {
                    allPairSums.get(currentSum).add(pair);
                }
            }
        }

        allPairSums.clear(); // Free up memory

        return quadruplets;
    }
}

/*
 * Entered `array`
 * [7, 6, 4, -1, 1, 2]
 * 
 * Enter `targetSum`:
 * 16
 * 
 * Result:
 * [[7, 6, 4, -1], [7, 6, 1, 2]]
 */
