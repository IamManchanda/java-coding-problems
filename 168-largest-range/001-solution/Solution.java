import java.util.*;

/**
 * Largest Range
 * https://www.algoexpert.io/questions/largest-range
 * 
 * Approach: Hash Table (HashMap)
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class Solution {
    public int[] largestRange(int[] array) {
        int[] bestRange = new int[2];
        int largestLength = 0, currentLength, left, right;
        Map<Integer, Boolean> nums = new HashMap<>();

        for (int num : array) {
            nums.put(num, true);
        }

        for (int num : array) {
            if (!nums.get(num)) {
                continue;
            }

            nums.put(num, false);
            currentLength = 1;
            left = num - 1;
            right = num + 1;

            while (nums.containsKey(left)) {
                nums.put(left, false);
                currentLength++;
                left--;
            }

            while (nums.containsKey(right)) {
                nums.put(right, false);
                currentLength++;
                right++;
            }

            if (currentLength > largestLength) {
                largestLength = currentLength;
                bestRange = new int[] { left + 1, right - 1 };
            }

            if (nums.values().stream().allMatch(value -> !value)) {
                break;
            }
        }

        return bestRange;
    }
}

/*
 * Entered `array`:
 * [1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6]
 * 
 * Result:
 * [0, 7]
 */
