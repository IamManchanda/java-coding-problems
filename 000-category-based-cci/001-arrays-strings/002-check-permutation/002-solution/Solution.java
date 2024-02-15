/**
 * Check Permutation
 * 
 * Approach: Count the characters
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */
public class Solution {
    private static final int ASCII_SIZE = 128;

    public boolean permutation(String s, String t) {
        int sn = s.length(), tn = t.length();

        if (sn != tn) {
            return false;
        }

        int[] letters = new int[ASCII_SIZE];

        for (int i = 0; i <= sn - 1; i++) {
            letters[s.charAt(i)]++;
        }

        for (int i = 0; i <= tn - 1; i++) {
            letters[t.charAt(i)]--;

            if (letters[t.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }
}

/*
 * Enter string `s`:
 * abc
 * 
 * Enter string `t`:
 * bac
 * 
 * Result:
 * true
 */

/*
 * Enter string `s`:
 * 123
 * 
 * Enter string `t`:
 * 321
 * 
 * Result:
 * true
 */

/*
 * Enter string `s`:
 * harry
 * 
 * Enter string `t`:
 * larry
 * 
 * Result:
 * false
 */
