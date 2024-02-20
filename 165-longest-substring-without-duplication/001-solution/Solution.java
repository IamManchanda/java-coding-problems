import java.util.*;

/**
 * Longest Substring Without Duplication
 * https://www.algoexpert.io/questions/longest-substring-without-duplication
 * 
 * Approach: Hash Table (HashMap)
 * - Time Complexity: O(n)
 * - Space Complexity: O(min(n, a))
 * where, n is the length of the input string
 * and, a is the length of unique characters in the input string
 */

public class Solution {
    public String longestSubstringWithoutDuplication(String str) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int[] longest = { 0, 1 };
        int start = 0, longestDiff, currentDiff;
        char c;

        for (int i = 0; i <= str.length() - 1; i++) {
            c = str.charAt(i);
            longestDiff = longest[1] - longest[0];

            if (lastSeen.containsKey(c)) {
                start = Math.max(start, lastSeen.get(c) + 1);
            }

            currentDiff = i + 1 - start;

            if (longestDiff < currentDiff) {
                longest[0] = start;
                longest[1] = i + 1;
            }

            lastSeen.put(c, i);
        }

        lastSeen.clear(); // Free up memory

        return str.substring(longest[0], longest[1]);
    }
}

/*
 * Enter `str`:
 * clementisacap
 * 
 * Result:
 * mentisac
 */
