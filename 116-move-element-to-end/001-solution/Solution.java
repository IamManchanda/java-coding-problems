import java.util.*;

/**
 * Move Element To End
 * https://www.algoexpert.io/questions/move-element-to-end
 * 
 * Approach: Two Pointers
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 */

public class Solution {
    public List<Integer> moveElementToEnd(
            List<Integer> array, int toMove) {
        int l = 0, r = array.size() - 1;

        while (l < r) {
            while (l < r && array.get(r) == toMove) {
                r--;
            }

            if (array.get(l) == toMove) {
                swap(l, r, array);
            }

            l++;
        }

        return array;
    }

    private void swap(int i, int j, List<Integer> array) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
}

/*
 * Entered `array`:
 * [2, 1, 2, 2, 2, 3, 4, 2]
 * 
 * Enter `toMove`:
 * 2
 * 
 * Result:
 * [4, 1, 3, 2, 2, 2, 2, 2]
 */
