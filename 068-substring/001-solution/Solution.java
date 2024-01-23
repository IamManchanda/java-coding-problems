/**
 * Substring of a String
 * Approach: Custom Built
 */

public class Solution {
    public String subString(String s, int si, int ei) {
        String substr = "";

        for (int i = si; i <= ei - 1; i++) {
            substr += s.charAt(si + i);
        }

        return substr;
    }
}

/*
 * Enter the String:
 * HelloWorld
 * 
 * Enter the start index:
 * 0
 * 
 * Enter the end index:
 * 5
 * 
 * Result:
 * Hello
 */
