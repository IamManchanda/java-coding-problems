import java.util.*;

/**
 * Common Characters
 * https://www.algoexpert.io/questions/common-characters
 * 
 * Approach: Hash Table (HashMap and HashSet)
 * - Time Complexity: O(n * m)
 * - Space Complexity: O(c)
 * where, n is the number of strings
 * and, m is the length of the longest string
 * and, c is the number of unique characters across all strings
 */

public class Solution {
    public String[] commonCharacters(String[] strings) {
        Map<Character, Integer> charCounts = new HashMap<>();
        List<Character> commonChars = new ArrayList<>();

        for (String string : strings) {
            Set<Character> uniqueChars = new HashSet<>();

            for (int i = 0; i <= string.length() - 1; i++) {
                uniqueChars.add(string.charAt(i));
            }

            for (Character c : uniqueChars) {
                charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            Character c = entry.getKey();
            int count = entry.getValue();

            if (count == strings.length) {
                commonChars.add(c);
            }
        }

        return transform(commonChars);
    }

    private String[] transform(List<Character> commonChars) {
        return commonChars.stream().map(String::valueOf).toArray(String[]::new);
    }
}

/*
 * Entered `strings`
 * [abc, bcd, cbaccd]
 * 
 * Result:
 * [b, c]
 */
