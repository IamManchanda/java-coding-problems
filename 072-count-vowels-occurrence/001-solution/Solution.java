/**
 * Count the number of vowels in a string.
 */

public class Solution {
    public int countVowels(String str) {
        int count = 0, n = str.length();

        for (int i = 0; i <= n - 1; i++) {
            char chr = str.charAt(i);
            boolean charIsVowel = isVowel(chr);

            if (charIsVowel) {
                count++;
            }
        }

        return count;
    }

    private boolean isVowel(char chr) {
        char ch = Character.toLowerCase(chr);
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
}

/*
 * Enter the String:
 * Amazon Web Services
 * 
 * Result:
 * 7
 */
