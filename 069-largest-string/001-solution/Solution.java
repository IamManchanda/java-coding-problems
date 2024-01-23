/**
 * Largest String
 */

public class Solution {
    public String largestString(String[] arr) {
        int n = arr.length;
        String largest = arr[0];

        for (int i = 1; i <= n - 1; i++) {
            if (largest.compareTo(arr[i]) < 0) {
                largest = arr[i];
            }
        }

        return largest;
    }
}

/*
 * Enter the number of Strings:
 * 3
 * 
 * Enter the String at index 0:
 * apple
 * 
 * Enter the String at index 1:
 * banana
 * 
 * Enter the String at index 2:
 * mango
 * 
 * Result:
 * mango
 */
