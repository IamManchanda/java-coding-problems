import java.util.*;

/**
 * Insertion Sort (Inbuilt)
 * 
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

public class Solution {
    public Integer[] inbuiltSort(Integer[] numbers, boolean isDescending) {
        if (isDescending) {
            Arrays.sort(numbers, Collections.reverseOrder());
        } else {
            Arrays.sort(numbers);
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