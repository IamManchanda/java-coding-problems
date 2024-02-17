import java.util.*;

/**
 * Common Characters
 * https://www.algoexpert.io/questions/common-characters
 * 
 * Approach: Hash Table (HashSet)
 * - Time Complexity: O(n * m)
 * - Space Complexity: O(m)
 * where, n is the number of strings
 * and, m is the average length of strings
 */

public class Solution {
    public String[] commonCharacters(String[] strings) {
        Set<Character> commonChars = getCommonCharsFromSmallest(strings);

        for (String string : strings) {
            removeNonCommonChars(commonChars, string);
        }

        return transform(commonChars);
    }

    private Set<Character> getCommonCharsFromSmallest(String[] strings) {
        String smallestString = strings[0];
        Set<Character> commonChars = new HashSet<>();

        for (String string : strings) {
            if (string.length() < smallestString.length()) {
                smallestString = string;
            }
        }

        for (int i = 0; i <= smallestString.length() - 1; i++) {
            commonChars.add(smallestString.charAt(i));
        }

        return commonChars;
    }

    private void removeNonCommonChars(Set<Character> commonChars, String string) {
        Set<Character> uniqueChars = new HashSet<>();

        for (int i = 0; i <= string.length() - 1; i++) {
            uniqueChars.add(string.charAt(i));
        }

        commonChars.retainAll(uniqueChars);
    }

    private String[] transform(Set<Character> commonChars) {
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
