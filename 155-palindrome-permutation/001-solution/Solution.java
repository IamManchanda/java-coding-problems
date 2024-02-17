import java.util.*;

/**
 * Palindrome Permutation
 * 
 * Approach: Hash Table (HashMap)
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public boolean isPermutationOfPalindrome(String phrase) {
        Map<Character, Integer> table = buildCharFrequencyTable(phrase);

        return checkMaxOneOdd(table);
    }

    private Map<Character, Integer> buildCharFrequencyTable(String phrase) {
        Map<Character, Integer> table = new HashMap<>();

        for (char c : phrase.toCharArray()) {
            if (Character.isLetter(c)) {
                char lc = Character.toLowerCase(c);
                table.put(lc, table.getOrDefault(lc, 0) + 1);
            }
        }

        return table;
    }

    private boolean checkMaxOneOdd(Map<Character, Integer> table) {
        boolean foundOdd = false;

        for (int count : table.values()) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }

                foundOdd = true;
            }
        }

        return true;
    }
}

/*
 * Enter String `phrase`:
 * Tact Coa
 * 
 * Result:
 * true
 */

/*
 * Enter String `phrase`:
 * race a car
 * 
 * Result:
 * false
 */

/*
 * Enter String `phrase`:
 * abc cba
 * 
 * Result:
 * true
 */
