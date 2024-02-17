/**
 * First Non-Repeating Character
 * https://www.algoexpert.io/questions/first-non-repeating-character
 * 
 * Approach: Brute Force
 * - Time complexity: O(n^2)
 * - Space complexity: O(1)
 */

public class Solution {
    public int firstNonRepeatingCharacter(String string) {
        int n = string.length();

        for (int i = 0; i <= n - 1; i++) {
            boolean found = false;

            for (int j = 0; j <= n - 1; j++) {
                if (i == j) {
                    continue;
                }

                char ci = string.charAt(i), cj = string.charAt(j);

                if (ci == cj) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return i;
            }
        }

        return -1;
    }
}

/*
 * Enter String `string`:
 * abcdcaf
 * 
 * Result:
 * 1
 */
