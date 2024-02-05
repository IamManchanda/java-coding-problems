import java.util.*;

/**
 * Smallest Difference
 * https://www.algoexpert.io/questions/smallest-difference
 * 
 * Approach: Sort and Two Pointers
 * - Time Complexity: O(n log(n) + m log(m))
 * - Space Complexity: O(1)
 * where, n = length of `arrayOne`
 * and, m = length of `arrayTwo`
 */

public class Solution {
    public int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int idxOne = 0,
                idxTwo = 0,
                smallest = Integer.MAX_VALUE,
                currentSmallest = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];

        while (idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
            int numOne = arrayOne[idxOne], numTwo = arrayTwo[idxTwo];

            if (numOne < numTwo) {
                currentSmallest = numTwo - numOne;
                idxOne++;
            } else if (numTwo < numOne) {
                currentSmallest = numOne - numTwo;
                idxTwo++;
            } else {
                int[] pair = { numOne, numTwo };
                return pair;
            }

            if (smallest > currentSmallest) {
                smallest = currentSmallest;
                smallestPair[0] = numOne;
                smallestPair[1] = numTwo;
            }
        }

        return smallestPair;
    }
}

/*
 * Entered `arrayOne`:
 * [-1, 5, 10, 20, 28, 3]
 * 
 * Entered `arrayTwo`:
 * [26, 134, 135, 15, 17]
 * 
 * Result:
 * [28, 26]
 */
