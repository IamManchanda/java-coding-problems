import java.util.*;

/**
 * Group Anagrams
 * https://www.algoexpert.io/questions/group-anagrams
 * 
 * Approach: Hash Table (HashMap) + Sorting
 * - Time complexity: O(w * n * log(n))
 * - Space complexity: O(w * n)
 * where, w is the number of words
 * and, n is the length of the longest word
 */

public class Solution {
    public List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String word : words) {
            String sortedWord = sort(word);

            if (anagramsMap.containsKey(sortedWord)) {
                anagramsMap.get(sortedWord).add(word);
            } else {
                List<String> newAnagramList = new ArrayList<>();
                newAnagramList.add(word);
                anagramsMap.put(sortedWord, newAnagramList);
            }
        }

        return new ArrayList<>(anagramsMap.values());
    }

    private String sort(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}

/*
 * Entered `words`
 * [yo, act, flop, tac, foo, cat, oy, olfp]
 * 
 * Result:
 * [[act, tac, cat], [flop, olfp], [foo], [yo, oy]]
 */
