import java.util.*;

/**
 * Minimum Characters For Words
 * https://www.algoexpert.io/questions/minimum-characters-for-words
 * 
 * Approach: Hash Table (HashMap)
 * - Time Complexity: O(n * l)
 * - Space Complexity: O(c)
 * where, n is the number of words,
 * and, l is the length of the longest word
 * and, c is the number of unique characters in all words
 */

public class Solution {
    public char[] minimumCharactersForWords(String[] words) {
        Map<Character, Integer> maxCharFrequencies = new HashMap<>();

        for (String word : words) {
            Map<Character, Integer> charFrequencies = countFrequencies(word);

            for (Map.Entry<Character, Integer> entry : charFrequencies.entrySet()) {
                char character = entry.getKey();
                int frequency = entry.getValue();

                int current = maxCharFrequencies.getOrDefault(character, 0);
                int max = Math.max(current, frequency);
                maxCharFrequencies.put(character, max);
            }
        }

        return buildArrayFromCharFrequencies(maxCharFrequencies);
    }

    private Map<Character, Integer> countFrequencies(String word) {
        Map<Character, Integer> frequencies = new HashMap<>();

        for (char character : word.toCharArray()) {
            int charFrequency = frequencies.getOrDefault(character, 0);
            frequencies.put(character, charFrequency + 1);
        }

        return frequencies;
    }

    private char[] buildArrayFromCharFrequencies(Map<Character, Integer> frequencies) {
        List<Character> characters = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            char character = entry.getKey();
            int frequency = entry.getValue();

            for (int i = 0; i <= frequency - 1; i++) {
                characters.add(character);
            }
        }

        return transformListToArray(characters);
    }

    private char[] transformListToArray(List<Character> list) {
        int n = list.size();
        char[] array = new char[n];

        for (int i = 0; i <= n - 1; i++) {
            array[i] = list.get(i);
        }

        return array;
    }
}

/*
 * Entered `words`
 * [this, that, did, deed, them!, a]
 * 
 * Result:
 * [a, !, s, t, t, d, d, e, e, h, i, m]
 */
