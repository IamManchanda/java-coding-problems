/**
 * Insertion Sort
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

public class Solution {
    public int[] insertionSort(int[] numbers, boolean isDescending) {
        int n = numbers.length;

        for (int i = 1; i <= n - 1; i++) {
            int currElem = numbers[i];
            int prevIdx = i - 1;

            while (prevIdx >= 0 && (isDescending
                    ? numbers[prevIdx] < currElem
                    : numbers[prevIdx] > currElem)) {
                numbers[prevIdx + 1] = numbers[prevIdx];
                prevIdx--;
            }

            numbers[prevIdx + 1] = currElem;
        }

        return numbers;
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
