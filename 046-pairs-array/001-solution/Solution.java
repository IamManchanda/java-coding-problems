/**
 * Problem: Pairs in an array
 */

public class Solution {
    public String[] pairsArray(int[] numbers) {
        int resultsSize = getPairsCount(numbers.length);
        String[] results = new String[resultsSize];
        int resultsIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                int next = numbers[j];
                results[resultsIndex] = "(" + current + ", " + next + ")";
                resultsIndex++;
            }
        }

        return results;
    }

    private int getPairsCount(int n) {
        return n * (n - 1) / 2;
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
 * Result (as an array):
 * [(2, 4), (2, 6), (2, 8), (2, 10), (4, 6),
 * (4, 8), (4, 10), (6, 8), (6, 10), (8, 10)]
 */
