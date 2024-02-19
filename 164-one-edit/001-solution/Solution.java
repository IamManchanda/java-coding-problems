/**
 * One Edit
 * https://www.algoexpert.io/questions/one-edit
 * 
 * Approach: Iterative (Comparing Characters and Substrings)
 * - Time complexity: O(n + m)
 * - Space complexity: O(n + m)
 * where, n is the length of stringOne
 * and, m is the length of stringTwo
 */

public class Solution {
    public boolean oneEdit(String stringOne, String stringTwo) {
        int n1 = stringOne.length(), n2 = stringTwo.length(),
                n = Math.min(n1, n2);

        if (Math.abs(n1 - n2) > 1) {
            return false;
        }

        char c1, c2;

        for (int i = 0; i <= n - 1; i++) {
            c1 = stringOne.charAt(i);
            c2 = stringTwo.charAt(i);

            if (c1 != c2) {
                if (n1 == n2) {
                    return stringOne.substring(i + 1)
                            .equals(stringTwo.substring(i + 1));
                } else if (n1 < n2) {
                    return stringOne.substring(i)
                            .equals(stringTwo.substring(i + 1));
                } else { // n1 > n2
                    return stringOne.substring(i + 1)
                            .equals(stringTwo.substring(i));
                }
            }
        }

        // If we reach here, then stringOne and stringTwo are same
        return true;
    }
}

/*
 * Enter `stringOne`:
 * hello
 * 
 * Enter `stringTwo`:
 * hollo
 * 
 * Result:
 * true
 */

/*
 * Enter `stringOne`:
 * hello
 * 
 * Enter `stringTwo`:
 * help
 * 
 * Result:
 * false
 */

/*
 * Enter `stringOne`:
 * hello
 * 
 * Enter `stringTwo`:
 * hllo
 * 
 * Result:
 * true
 */
