/**
 * Run-Length Encoding
 * https://www.algoexpert.io/questions/run-length-encoding
 * 
 * Approach: Iterative
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public String runLengthEncoding(String string) {
        int n = string.length(), currentRunLength = 1;
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n - 1; i++) {
            char currentCharacter = string.charAt(i);
            char previousCharacter = string.charAt(i - 1);

            if (currentCharacter != previousCharacter || currentRunLength == 9) {
                result.append(currentRunLength);
                result.append(previousCharacter);
                currentRunLength = 0;
            }

            currentRunLength++;
        }

        result.append(currentRunLength);
        result.append(string.charAt(n - 1));

        return result.toString();
    }
}

/*
 * Enter String `string`:
 * AAAAAAAAAAAAABBCCCCDD
 * 
 * Result:
 * 9A4A2B4C2D
 */
