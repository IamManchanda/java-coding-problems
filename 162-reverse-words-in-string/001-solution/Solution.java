import java.util.*;

/**
 * Reverse Words In String
 * https://www.algoexpert.io/questions/reverse-words-in-string
 * 
 * Approach: Iterative (Pointer)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public String reverseWordsInString(String string) {
        List<String> words = new ArrayList<>();
        int s = 0, n = string.length();
        char ci, cs;

        for (int i = 0; i <= n - 1; i++) {
            ci = string.charAt(i);
            cs = string.charAt(s);

            if (ci == ' ' || cs == ' ') {
                words.add(string.substring(s, i));
                s = i;
            }
        }

        words.add(string.substring(s, n));
        Collections.reverse(words);

        return String.join("", words);
    }
}

/*
 * Enter String `string`:
 * AlgoExpert is the best!
 * 
 * Result:
 * best! the is AlgoExpert
 */
