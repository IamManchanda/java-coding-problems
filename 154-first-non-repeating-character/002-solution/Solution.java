import java.util.*;

/**
 * First Non-Repeating Character
 * https://www.algoexpert.io/questions/first-non-repeating-character
 * 
 * Approach: Hash Table (HashMap)
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 * where, n is the length of the input string.
 * 
 * Note: The space complexity is O(1) because the input string contains only
 * lowercase English-alphabet letters (26 characters).
 */

public class Solution {
    public int firstNonRepeatingCharacter(String string) {
        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : string.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < string.length(); i++) {
            if (charCounts.get(string.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
