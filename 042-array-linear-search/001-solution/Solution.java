/**
 * Problem: Linear Search in an array.
 */

public class Solution {
    public int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }
}

/*
 * Enter number of items:
 * 8
 * 
 * Enter items:
 * Enter item 1: 2
 * Enter item 2: 4
 * Enter item 3: 6
 * Enter item 4: 8
 * Enter item 5: 10
 * Enter item 6: 12
 * Enter item 7: 14
 * Enter item 8: 16
 * 
 * Enter the key to search:
 * 10
 * 
 * Result:
 * Key found at index 4
 * 
 * Result:
 * Key found at index 4
 */
