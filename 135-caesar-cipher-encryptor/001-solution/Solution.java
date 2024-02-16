/**
 * Caesar Cipher Encryptor
 * https://www.algoexpert.io/questions/caesar-cipher-encryptor
 * 
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class Solution {
    private static final int ALPHABET_SIZE = 26;
    private static final int ASCII_CODE_OF_A = 97;
    private static final int ASCII_CODE_OF_Z = 122;

    public String caesarCypherEncryptor(String str, int key) {
        int n = str.length(), keyMod = key % ALPHABET_SIZE;
        char[] newLetters = new char[n];

        for (int i = 0; i <= n - 1; i++) {
            char letter = str.charAt(i);
            newLetters[i] = getNewLetter(letter, keyMod);
        }

        return new String(newLetters);
    }

    private char getNewLetter(char letter, int key) {
        int newLetterCode = letter + key;
        int floor = ASCII_CODE_OF_A - 1, ceil = ASCII_CODE_OF_Z;

        return newLetterCode <= ceil
                ? (char) newLetterCode
                : (char) (floor + newLetterCode % ceil);
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
