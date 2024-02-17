import java.util.*;

/**
 * Generate Document
 * https://www.algoexpert.io/questions/generate-document
 * 
 * Approach: In-Place Counting
 * - Time Complexity: O(n + m)
 * - Space Complexity: O(c)
 * where, n is the length of `characters`
 * and, m is the length of `document`
 * and, c is the number of unique characters in `document`
 */

public class Solution {
    public boolean generateDocument(String characters, String document) {
        Map<Character, Integer> charCounts = new HashMap<>();

        for (char character : characters.toCharArray()) {
            charCounts.put(character, charCounts.getOrDefault(character, 0) + 1);
        }

        for (char character : document.toCharArray()) {
            if (!charCounts.containsKey(character) || charCounts.get(character) == 0) {
                return false;
            }

            charCounts.put(character, charCounts.get(character) - 1);
        }

        return true;
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
