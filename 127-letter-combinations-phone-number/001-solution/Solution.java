import java.util.*;

/**
 * Letter Combinations of a Phone Number
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */

public class Solution {
    private final static char[][] combinations = {
            {}, // 0
            {}, // 1
            { 'a', 'b', 'c' }, // 2
            { 'd', 'e', 'f' }, // 3
            { 'g', 'h', 'i' }, // 4
            { 'j', 'k', 'l' }, // 5
            { 'm', 'n', 'o' }, // 6
            { 'p', 'q', 'r', 's' }, // 7
            { 't', 'u', 'v' }, // 8
            { 'w', 'x', 'y', 'z' } // 9
    };

    public List<String> letterCombinations(String digits) {
        ArrayList<String> result = new ArrayList<String>();
        int len = digits.length();

        if (len == 0) {
            return result;
        }

        StringBuilder sb = new StringBuilder();
        search(0, len, sb, digits, result);

        return result;
    }

    private void search(int pos, int len, StringBuilder sb, String digits, ArrayList<String> result) {
        if (pos == len) {
            result.add(sb.toString());
            return;
        }

        int digit = digits.charAt(pos) - '0';
        char[] letters = combinations[digit];
        int n = letters.length;

        for (int i = 0; i <= n - 1; i++) {
            sb.append(letters[i]);
            search(pos + 1, len, sb, digits, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

/*
 * Enter `digits` String:
 * 23
 * 
 * Result:
 * [ad, ae, af, bd, be, bf, cd, ce, cf]
 */

/*
 * Enter `digits` String:
 * _
 * 
 * Result:
 * []
 * 
 * Note: _ represents space, input is empty string.
 */

/*
 * Enter `digits` String:
 * 2
 * 
 * Result:
 * [a, b, c]
 */
