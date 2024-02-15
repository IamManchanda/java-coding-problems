import java.util.*;

/**
 * Check Permutation
 * 
 * Approach: Sort the strings
 * - Time complexity: O(n log n)
 * - Space complexity: O(n)
 */
public class Solution {
    public boolean permutation(String s, String t) {
        int sn = s.length(), tn = t.length();

        if (sn != tn) {
            return false;
        }

        return sort(s).equals(sort(t));
    }

    private String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
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
