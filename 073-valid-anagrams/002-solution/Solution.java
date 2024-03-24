import java.util.*;

/**
 * Valid Anagrams
 * https://leetcode.com/problems/valid-anagram/description/
 * 
 * Approach: Hash Table (HashMap) with Unicode characters
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public boolean isAnagram(String s, String t) {
        int sn = s.length(), tn = t.length();

        if (sn != tn) {
            return false;
        }

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i <= sn - 1; i++) { // sn == tn
            char sc = s.charAt(i);
            int scv = countMap.getOrDefault(sc, 0);
            countMap.put(sc, scv + 1);

            char tc = t.charAt(i);
            int tcv = countMap.getOrDefault(tc, 0);
            countMap.put(tc, tcv - 1);
        }

        for (int v : countMap.values()) {
            if (v != 0) {
                return false;
            }
        }

        return true;
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

/*
 * Enter the String s:
 * 
 * @n@gram
 * 
 * Enter the String t:
 * n@g@ram
 * 
 * Result:
 * true
 */
