/**
 * Selection Sort
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

public class Solution {
    public int[] selectionSort(int[] numbers, String sortingOrder) {
        int n = numbers.length;

        for (int i = 0; i <= n - 2; i++) {
            int minPos = i;

            for (int j = i + 1; j <= n - 1; j++) {
                if (sortingOrder.equals("ASC")) {
                    if (numbers[minPos] > numbers[j]) {
                        minPos = j;
                    }
                } else { // sortingOrder.equals("DESC")
                    if (numbers[minPos] < numbers[j]) {
                        minPos = j;
                    }
                }
            }

            swap(numbers, i, minPos);
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
