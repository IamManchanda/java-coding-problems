/**
 * Counting Sort
 * 
 * Time Complexity: O(n + k)
 * Space Complexity: O(k)
 */

public class Solution {
    public int[] countingSort(int[] numbers, boolean isDescending) {
        int n = numbers.length;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i <= n - 1; i++) {
            largest = Math.max(largest, numbers[i]);
        }

        int[] frequency = new int[largest + 1];
        for (int i = 0; i <= n - 1; i++) {
            frequency[numbers[i]]++;
        }

        int fn = frequency.length;
        if (isDescending) {
            int counterDesc = 0;
            for (int i = fn - 1; i >= 0; i--) {
                counterDesc = fillNumbers(numbers, frequency, i, counterDesc);
            }
        } else {
            int counterAsc = 0;
            for (int i = 0; i <= fn - 1; i++) {
                counterAsc = fillNumbers(numbers, frequency, i, counterAsc);
            }
        }

        return numbers;
    }

    private int fillNumbers(int[] numbers, int[] frequency, int index, int counter) {
        while (frequency[index] > 0) {
            numbers[counter] = index;
            counter++;
            frequency[index]--;
        }

        return counter;
    }
}

/*
 * Enter number of items:
 * 5
 * 
 * Enter items:
 * Enter item 1: 5
 * Enter item 2: 4
 * Enter item 3: 1
 * Enter item 4: 3
 * Enter item 5: 2
 * 
 * Enter the sorting order (1 for ASC, 2 for DESC):
 * 1
 * 
 * Sorting order: ASC
 * 
 * Original Input (as an array):
 * [5, 4, 1, 3, 2]
 * 
 * Result (as an array):
 * [1, 2, 3, 4, 5]
 */

/*
 * Enter number of items:
 * 5
 * 
 * Enter items:
 * Enter item 1: 5
 * Enter item 2: 4
 * Enter item 3: 1
 * Enter item 4: 3
 * Enter item 5: 2
 * 
 * Enter the sorting order (1 for ASC, 2 for DESC):
 * 2
 * 
 * Sorting order: DESC
 * 
 * Original Input (as an array):
 * [5, 4, 1, 3, 2]
 * 
 * Result (as an array):
 * [5, 4, 3, 2, 1]
 */
