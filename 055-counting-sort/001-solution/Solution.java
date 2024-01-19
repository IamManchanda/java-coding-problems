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
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 1; i++) {
            largest = Math.max(largest, numbers[i]);
            smallest = Math.min(smallest, numbers[i]);
        }

        int offset = -smallest;
        int[] frequency = new int[largest + offset + 1];

        for (int i = 0; i <= n - 1; i++) {
            frequency[numbers[i] + offset]++;
        }

        int fn = frequency.length;
        int counter = 0;
        int start = isDescending ? fn - 1 : 0;
        int end = isDescending ? -1 : fn;
        int step = isDescending ? -1 : 1;

        for (int i = start; i != end; i += step) {
            counter = fillNumbers(numbers, frequency, i, counter, offset);
        }

        return numbers;
    }

    private int fillNumbers(int[] numbers, int[] frequency, int index, int counter, int offset) {
        while (frequency[index] > 0) {
            numbers[counter++] = index - offset;
            frequency[index]--;
        }

        return counter;
    }
}

/*
 * Enter number of items:
 * 7
 * 
 * Enter items:
 * Enter item 1: 5
 * Enter item 2: -2
 * Enter item 3: 3
 * Enter item 4: -4
 * Enter item 5: 7
 * Enter item 6: 1
 * Enter item 7: -6
 * 
 * Enter the sorting order (1 for ASC, 2 for DESC):
 * 1
 * 
 * Sorting order: ASC
 * 
 * Original Input (as an array):
 * [5, -2, 3, -4, 7, 1, -6]
 * 
 * Result (as an array):
 * [-6, -4, -2, 1, 3, 5, 7]
 */

/*
 * Enter number of items:
 * 7
 * 
 * Enter items:
 * Enter item 1: 5
 * Enter item 2: -2
 * Enter item 3: 3
 * Enter item 4: -4
 * Enter item 5: 7
 * Enter item 6: 1
 * Enter item 7: -6
 * 
 * Enter the sorting order (1 for ASC, 2 for DESC):
 * 2
 * 
 * Sorting order: DESC
 * 
 * Original Input (as an array):
 * [5, -2, 3, -4, 7, 1, -6]
 * 
 * Result (as an array):
 * [7, 5, 3, 1, -2, -4, -6]
 */
