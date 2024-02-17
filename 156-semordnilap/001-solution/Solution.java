import java.util.*;

/**
 * Semordnilap
 * https://www.algoexpert.io/questions/semordnilap
 * 
 * Approach: Hash Table (HashSet)
 * - Time complexity: O(n * m)
 * - Space complexity: O(n)
 * where, n is the number of words
 * and m is the length of the longest word
 */

public class Solution {
    public ArrayList<ArrayList<String>> semordnilap(String[] words) {
        Set<String> wordsSet = transform(words);
        ArrayList<ArrayList<String>> pairs = new ArrayList<>();

        for (String word : words) {
            String reverse = getReverse(word);

            if (wordsSet.contains(reverse) && !word.equals(reverse)) {
                ArrayList<String> currentPair = new ArrayList<>();

                currentPair.add(word);
                currentPair.add(reverse);
                pairs.add(currentPair);

                wordsSet.remove(word);
                wordsSet.remove(reverse);
            }
        }

        wordsSet.clear(); // free memory

        return pairs;
    }

    private Set<String> transform(String[] words) {
        return new HashSet<>(Arrays.asList(words));
    }

    private String getReverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}

/*
 * Entered `words`
 * [diaper, abc, test, cba, repaid]
 * 
 * Result:
 * [[diaper, repaid], [abc, cba]]
 */
