/**
 * Caesar Cipher Encryptor
 * https://www.algoexpert.io/questions/caesar-cipher-encryptor
 * 
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class Solution {
    private static final int ALPHABET_SIZE = 26;
    private static final String ALPHABET_STRING_SET = "abcdefghijklmnopqrstuvwxyz";

    public String caesarCypherEncryptor(String str, int key) {
        int n = str.length(), keyMod = key % ALPHABET_SIZE;
        char[] newLetters = new char[n];

        for (int i = 0; i <= n - 1; i++) {
            char letter = str.charAt(i);
            newLetters[i] = getNewLetter(letter, keyMod);
        }

        return transform(newLetters);
    }

    private String transform(char[] letters) {
        return new String(letters);
    }

    private char getNewLetter(char letter, int key) {
        int newLetterCode = ALPHABET_STRING_SET.indexOf(letter) + key;
        int newLetterIndex = newLetterCode % ALPHABET_SIZE;

        return ALPHABET_STRING_SET.charAt(newLetterIndex);
    }
}

/*
 * Enter String `str`:
 * xyz
 * 
 * Enter `key` to shift:
 * 2
 * 
 * Result:
 * zab
 */
