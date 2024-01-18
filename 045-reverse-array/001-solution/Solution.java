/**
 * Problem: Reverse an array
 * Target: Time complexity O(n), space complexity O(1)
 */

public class Solution {
    public int[] reverseArray(int[] numbers) {
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }

        return numbers;
    }
}

/*
 * Enter number of items:
 * 10
 * 
 * Enter items:
 * Enter item 1: 4
 * Enter item 2: 5
 * Enter item 3: 3
 * Enter item 4: 2
 * Enter item 5: 8
 * Enter item 6: 9
 * Enter item 7: 7
 * Enter item 8: 10
 * Enter item 9: 1
 * Enter item 10: 6
 * 
 * Original Array:
 * [4, 5, 3, 2, 8, 9, 7, 10, 1, 6]
 * Reversed Array:
 * [6, 1, 10, 7, 9, 8, 2, 3, 5, 4]
 */