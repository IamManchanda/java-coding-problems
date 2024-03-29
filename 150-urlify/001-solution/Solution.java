/**
 * URLify
 * 
 * - Time complexity: O(n)
 * - Space complexity: O(1) auxiliary
 */

public class Solution {
    public String replaceSpaces(String str, int trueLength) {
        char[] result = replaceSpaces(str.toCharArray(), trueLength);
        return new String(result);
    }

    private char[] replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0;

        for (int i = 0; i <= trueLength - 1; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        int index = trueLength + spaceCount * 2;

        if (trueLength < str.length) {
            str[trueLength] = '\0';
        }

        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }

        return str;
    }
}

/*
 * Enter String `str`:
 * Mr John Smith_____
 * 
 * Enter Integer `trueLength`:
 * 13
 * 
 * Result:
 * Mr%20John%20Smith
 * 
 * Note: _ denotes space
 */
