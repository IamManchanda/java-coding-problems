import java.util.*;

/**
 * Zigzag Traverse
 * https://www.algoexpert.io/questions/zigzag-traverse
 * 
 * Approach: Pattern Recognition
 * - Time Complexity: O(n)
 * - Space Complexity: O(1) auxiliary
 */

public class Solution {
    public List<Integer> zigzagTraverse(List<List<Integer>> array) {
        int i = 0, j = 0,
                ei = array.size() - 1,
                ej = array.get(0).size() - 1;
        List<Integer> result = new ArrayList<>();
        boolean goingDown = true;

        while (!isOutOfBounds(i, j, ei, ej)) {
            result.add(array.get(i).get(j));

            if (goingDown) {
                if (j > 0 && i < ei) {
                    // diagonally down left
                    i++; // move down
                    j--; // move left
                } else { // j == 0 || i == ei
                    goingDown = false;

                    if (i == ei) {
                        j++; // move right
                    } else { // j == 0
                        i++; // move down
                    }
                }
            } else {
                if (i > 0 && j < ej) {
                    // diagonally up right
                    i--; // move up
                    j++; // move right
                } else { // i == 0 || j == ej
                    goingDown = true;

                    if (j == ej) {
                        i++; // move down
                    } else { // i == 0
                        j++; // move right
                    }
                }
            }
        }

        return result;
    }

    private boolean isOutOfBounds(int i, int j, int ei, int ej) {
        return i < 0 || i > ei || j < 0 || j > ej;
    }
}

/*
 * Entered `array`:
 * [[1, 3, 4, 10], [2, 5, 9, 11], [6, 8, 12, 15], [7, 13, 14, 16]]
 * 
 * Result:
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
 */
