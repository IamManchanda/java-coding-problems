/**
 * Selection Sort
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

public class Solution {
    public int[] selectionSort(int[] numbers, boolean isDescending) {
        return isDescending
                ? selectionSortDescending(numbers)
                : selectionSortAscending(numbers);
    }

    private int[] selectionSortAscending(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i <= n - 2; i++) {
            int minPos = i;

            for (int j = i + 1; j <= n - 1; j++) {
                if (numbers[minPos] > numbers[j]) {
                    minPos = j;
                }
            }

            swap(numbers, i, minPos);
        }

        return numbers;
    }

    private int[] selectionSortDescending(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i <= n - 2; i++) {
            int maxPos = i;

            for (int j = i + 1; j <= n - 1; j++) {
                if (numbers[maxPos] < numbers[j]) {
                    maxPos = j;
                }
            }

            swap(numbers, i, maxPos);
        }

        return numbers;
    }

    private void swap(int[] numbers, int x, int y) {
        int temp = numbers[x];
        numbers[x] = numbers[y];
        numbers[y] = temp;
    }
}

/**
 * Sorting order: ASC
 * 
 * Original Input (as an array):
 * [5, 4, 1, 3, 2]
 * 
 * Result (as an array):
 * [1, 2, 3, 4, 5]
 */

/**
 * Sorting order: DESC
 * 
 * Original Input (as an array):
 * [5, 4, 1, 3, 2]
 * 
 * Result (as an array):
 * [5, 4, 3, 2, 1]
 */
