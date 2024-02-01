/**
 * Remove Duplicate Letters
 * https://leetcode.com/problems/remove-duplicate-letters/description/
 * (Not submitted as it is not a valid solution: it does not sort the letters)
 * 
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class Solution {
    public String removeDuplicateLetters(String s) {
        int startIdx = 0;
        StringBuilder sb = new StringBuilder();
        boolean[] map = new boolean[26];
        return removeDuplicateLetters(s, startIdx, sb, map);
    }

    private String removeDuplicateLetters(
            String s, int idx, StringBuilder sb, boolean[] map) {
        if (idx == s.length()) {
            return sb.toString();
        }

        char c = s.charAt(idx);
        int cIdx = c - 'a';

        if (!map[cIdx]) {
            map[cIdx] = true;
            sb.append(c);
        }

        return removeDuplicateLetters(s, idx + 1, sb, map);
    }
}

/*
 * Enter String `s`:
 * bcabc
 * 
 * Result:
 * bca
 */

/*
 * Enter String `s`:
 * cbacdcbc
 * 
 * Result:
 * cbad
 */
