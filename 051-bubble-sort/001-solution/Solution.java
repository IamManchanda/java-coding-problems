/**
 * Bubble Sort
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

public class Solution {
    public int[] bubbleSort(int[] numbers) {
        int n = numbers.length;
        boolean swapped;

        for (int i = 0; i <= n - 2; i++) {
            swapped = false;
            for (int j = 0; j <= n - 2 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        return numbers;
    }

    private void swap(int[] numbers, int x, int y) {
        int temp = numbers[x];
        numbers[x] = numbers[y];
        numbers[y] = temp;
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
 * Original Input (as an array):
 * [5, 4, 1, 3, 2]
 * 
 * Result (as an array):
 * [1, 2, 3, 4, 5]
 */
