import java.util.*;

/**
 * Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 * 
 * Approach: Hash Table (HashMap) and Stack
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Set<Character> openingBrackets = map.keySet();
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (openingBrackets.contains(ch)) {
                stack.push(ch);
            } else if (stack.isEmpty() || map.get(stack.pop()) != ch) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}

/*
 * Enter String `s`:
 * ()
 * 
 * Result:
 * true
 */

/*
 * Enter String `s`:
 * ()[]{}
 * 
 * Result:
 * true
 */

/*
 * Enter String `s`:
 * (]
 * 
 * Result:
 * false
 */
