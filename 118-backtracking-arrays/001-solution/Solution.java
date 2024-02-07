import java.util.Arrays;

/**
 * Backtracking Arrays
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int[] changeArr(int[] arr) {
        changeArr(arr, 0, 1);
        return arr;
    }

    private void changeArr(int[] arr, int i, int val) {
        if (i == arr.length) {
            System.out.println();
            System.out.println("Output (during base case):");
            System.out.println(Arrays.toString(arr));
            return;
        }

        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = val - 2;
    }
}

/*
 * Enter number of elements in `arr`:
 * 5
 * 
 * Output (during base case):
 * [1, 2, 3, 4, 5]
 * 
 * Result:
 * [-1, 0, 1, 2, 3]
 */
