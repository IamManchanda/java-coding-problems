import java.util.*;

/**
 * Generate Document
 * https://www.algoexpert.io/questions/generate-document
 * 
 * Approach: Count and Compare
 * - Time Complexity: O((n + m) * c)
 * - Space Complexity: O(c)
 * where, n is the length of `characters`
 * and, m is the length of `document`
 * and, c is the number of unique characters in `document`
 */

public class Solution {
    public boolean generateDocument(String characters, String document) {
        Set<Character> alreadyCounted = new HashSet<>();

        for (char character : document.toCharArray()) {
            if (alreadyCounted.contains(character)) {
                continue;
            }

            int documentOccurrences = countOccurrences(document, character);
            int charactersOccurrences = countOccurrences(characters, character);

            if (documentOccurrences > charactersOccurrences) {
                return false;
            }

            alreadyCounted.add(character);
        }

        return true;
    }

    private int countOccurrences(String str, char character) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == character) {
                count++;
            }
        }

        return count;
    }
}

/*
 * Enter String `characters`:
 * Bste!hetsi_ogEAxpelrt_x_
 * 
 * Enter String `document`:
 * AlgoExpert_is_the_Best!
 * 
 * Result:
 * true
 * 
 * Note: _ denotes space
 */
