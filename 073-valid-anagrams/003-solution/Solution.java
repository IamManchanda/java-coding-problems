/**
 * Valid Anagrams
 * https://leetcode.com/problems/valid-anagram/description/
 * 
 * Approach: Hash Table (Map) without Unicode characters
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public boolean isAnagram(String s, String t) {
        int sn = s.length(), tn = t.length();

        if (sn != tn) {
            return false;
        }

        int[] countMap = new int[26];

        for (int i = 0; i <= sn - 1; i++) { // sn == tn
            char sc = s.charAt(i);
            int sci = sc - 'a';
            countMap[sci]++;

            char tc = t.charAt(i);
            int tci = tc - 'a';
            countMap[tci]--;
        }

        for (int v : countMap) {
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
