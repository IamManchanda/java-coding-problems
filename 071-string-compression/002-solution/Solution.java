/**
 * String Compression
 * https://leetcode.com/problems/string-compression/description/
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Solution {
    public int compress(char[] chars) {
        int i = 0, ci = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            chars[ci++] = currentChar;

            if (count > 1) {
                char[] countAsCharArray = intToCharArray(count);
                for (char c : countAsCharArray) {
                    chars[ci++] = c;
                }
            }
        }

        return ci;
    }

    private char[] intToCharArray(int n) {
        return Integer.toString(n).toCharArray();
    }
}

/*
 * Enter the number of chars:
 * 7
 * 
 * Enter the char at index 0:
 * a
 * 
 * Enter the char at index 1:
 * a
 * 
 * Enter the char at index 2:
 * b
 * 
 * Enter the char at index 3:
 * b
 * 
 * Enter the char at index 4:
 * c
 * 
 * Enter the char at index 5:
 * c
 * 
 * Enter the char at index 6:
 * c
 * 
 * Input:
 * [a, a, b, b, c, c, c]
 * 
 * Result:
 * 6
 */

/*
 * Enter the number of chars:
 * 1
 * 
 * Enter the char at index 0:
 * a
 * 
 * Input:
 * [a]
 * 
 * Result:
 * 1
 */

/*
 * Enter the number of chars:
 * 13
 * 
 * Enter the char at index 0:
 * a
 * 
 * Enter the char at index 1:
 * b
 * 
 * Enter the char at index 2:
 * b
 * 
 * Enter the char at index 3:
 * b
 * 
 * Enter the char at index 4:
 * b
 * 
 * Enter the char at index 5:
 * b
 * 
 * Enter the char at index 6:
 * b
 * 
 * Enter the char at index 7:
 * b
 * 
 * Enter the char at index 8:
 * b
 * 
 * Enter the char at index 9:
 * b
 * 
 * Enter the char at index 10:
 * b
 * 
 * Enter the char at index 11:
 * b
 * 
 * Enter the char at index 12:
 * b
 * 
 * Input:
 * [a, b, b, b, b, b, b, b, b, b, b, b, b]
 * 
 * Result:
 * 4
 */
