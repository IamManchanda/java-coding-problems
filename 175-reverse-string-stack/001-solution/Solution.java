import java.util.*;

/**
 * Reverse a String using stack
 * 
 * Approach: Stack (LIFO)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder("");

        for (char c : str.toCharArray()) {
            s.push(c);
        }

        while (!s.isEmpty()) {
            sb.append(s.pop());
        }

        return sb.toString();
    }
}

/*
 * Enter String `str`:
 * abc
 * 
 * Result:
 * cba
 */
