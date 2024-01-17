import java.util.*;

/**
 * Problem: Find the largest and smallest number in an array.
 */

public class Solution {
    public Map<String, Integer> findLargestSmallestNumber(int[] numbers) {
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }

            if (numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
            }
        }

        Map<String, Integer> result = new HashMap<>();
        result.put("largestNumber", largestNumber);
        result.put("smallestNumber", smallestNumber);

        return result;
    }
}

/*
 * Enter number of items:
 * 8
 * 
 * Enter items:
 * Enter item 1: 2
 * Enter item 2: 3
 * Enter item 3: 5
 * Enter item 4: 8
 * Enter item 5: 7
 * Enter item 6: 6
 * Enter item 7: 1
 * Enter item 8: 4
 * 
 * Result:
 * Largest number: 8
 * Smallest number: 1
 */
