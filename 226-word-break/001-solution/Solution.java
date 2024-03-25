import java.util.*;

/**
 * Word Break
 * https://leetcode.com/problems/word-break/description/
 * 
 * Approach: Recursion with memoization - Hash Table (HashMap)
 * - Time complexity: O(n^2)
 * - Space complexity: O(n)
 */

public class Solution {
    private Map<String, Boolean> memo = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        return wordBreak(s, wordSet);
    }

    private boolean wordBreak(String s, Set<String> wordSet) {
        int n = s.length();
        if (n == 0) {
            return true;
        }

        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        for (int i = 1; i <= n; i++) {
            if (wordSet.contains(s.substring(0, i)) && wordBreak(s.substring(i), wordSet)) {
                memo.put(s, true);
                return true;
            }
        }

        memo.put(s, false);
        return false;
    }
}

/*
 * Entered string `s`:
 * leetcode
 * 
 * Entered `wordDict[]`:
 * [leet, code]
 * 
 * Result:
 * true
 */

/*
 * Entered string `s`:
 * applepenapple
 * 
 * Entered `wordDict[]`:
 * [apple, pen]
 * 
 * Result:
 * true
 */

/*
 * Entered string `s`:
 * catsandog
 * 
 * Entered `wordDict[]`:
 * [cats, dog, sand, and, cat]
 * 
 * Result:
 * false
 */
