import java.util.*;

/**
 * Duplicate Parentheses
 * https://www.codingninjas.com/studio/problems/duplicate-parenthesis_2663296
 * 
 * Approach: Using Stack
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public boolean duplicateParanthesis(String expr) {
        Stack<Character> st = new Stack<>();

        for (char ch : expr.toCharArray()) {
            if (ch == ')') {
                int count = 0;

                while (st.pop() != '(') {
                    count++;
                }

                if (count < 1) {
                    return true;
                }
            } else {
                st.push(ch);
            }
        }

        return false;
    }
}

/*
 * Enter String `s`:
 * (a+b)+((c+d))
 * 
 * Result:
 * true
 */

/*
 * Enter String `s`:
 * ((a+b) + c)
 * 
 * Result:
 * false
 */

/*
 * Enter String `s`:
 * ((a+b)+(c+d))
 * 
 * Result:
 * false
 */
