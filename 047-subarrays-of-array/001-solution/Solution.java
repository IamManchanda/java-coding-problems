/**
 * Problem: Subarrays of an array
 */

public class Solution {
    public String[] listSubarrays(int[] numbers) {
        int n = numbers.length;
        int resultsSize = getSubarraysCount(n);
        String[] results = new String[resultsSize];
        int resultsIndex = 0;

        for (int i = 0; i < n; i++) {
            int start = i;

            for (int j = start; j < n; j++) {
                int end = j;
                results[resultsIndex] = "[";

                for (int k = start; k <= end; k++) {
                    if (k == end) {
                        results[resultsIndex] += numbers[k];
                    } else {
                        results[resultsIndex] += numbers[k] + ", ";
                    }
                }

                results[resultsIndex] += "]";
                resultsIndex++;
            }
        }

        return results;
    }

    private int getSubarraysCount(int n) {
        return n * (n + 1) / 2;
    }
}

/*
 * Enter number of items in an array:
 * 5
 * 
 * Enter items:
 * Enter item 1: 2
 * Enter item 2: 4
 * Enter item 3: 6
 * Enter item 4: 8
 * Enter item 5: 10
 * 
 * Original Input (as an array):
 * [2, 4, 6, 8, 10]
 * 
 * List of Subarrays (as an array):
 * [[2], [2, 4], [2, 4, 6], [2, 4, 6, 8], [2, 4, 6, 8, 10], [4], [4, 6],
 * [4, 6, 8], [4, 6, 8, 10], [6], [6, 8], [6, 8, 10], [8], [8, 10], [10]]
 */
