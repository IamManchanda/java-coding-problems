import java.util.*;

/**
 * Valid Anagrams
 * https://leetcode.com/problems/valid-anagram/description/
 * 
 * Approach: Sorting
 * - Time complexity: O(n log'n)
 * - Space complexity: O(n)
 */

public class Solution {
    public boolean isAnagram(String s, String t) {
        int sn = s.length(), tn = t.length();

        if (sn != tn) {
            return false;
        }

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        return Arrays.equals(sc, tc);
    }
}

/*
 * Enter the String s:
 * anagram
 * 
 * Enter the String t:
 * nagaram
 * 
 * Result:
 * true
 */

/*
 * Enter the String s:
 * rat
 * 
 * Enter the String t:
 * car
 * 
 * Result:
 * false
 */
