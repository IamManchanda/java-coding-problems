/**
 * String Compression
 * https://leetcode.com/problems/string-compression/description/
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class Solution {
    public int compress(char[] chars) {
        String newStr = compressString(chars);
        int n = newStr.length();

        for (int i = 0; i <= n - 1; i++) {
            chars[i] = newStr.charAt(i);
        }

        return n;
    }

    public String compressString(char[] chars) {
        StringBuilder newStr = new StringBuilder("");
        int n = chars.length;

        for (int i = 0; i <= n - 1; i++) {
            int count = 1;
            while (i <= n - 2 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            newStr.append(chars[i]);

            if (count > 1) {
                newStr.append(count);
            }
        }

        return newStr.toString();
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
