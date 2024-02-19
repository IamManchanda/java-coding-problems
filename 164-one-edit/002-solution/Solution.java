/**
 * One Edit
 * https://www.algoexpert.io/questions/one-edit
 * 
 * Approach: Iterative (Two Pointers - Comparing Characters)
 * - Time complexity: O(n + m)
 * - Space complexity: O(n + m)
 * where, n is the length of stringOne
 * and, m is the length of stringTwo
 */

public class Solution {
    public boolean oneEdit(String stringOne, String stringTwo) {
        int n1 = stringOne.length(), n2 = stringTwo.length();

        if (Math.abs(n1 - n2) > 1) {
            return false;
        }

        boolean alreadyFoundDifference = false;
        int p1 = 0, p2 = 0;
        char c1, c2;

        while (p1 < n1 && p2 < n2) {
            c1 = stringOne.charAt(p1);
            c2 = stringTwo.charAt(p2);

            if (c1 != c2) {
                if (alreadyFoundDifference) {
                    return false;
                }

                alreadyFoundDifference = true;

                if (n1 == n2) {
                    p1++;
                    p2++;
                } else if (n1 < n2) {
                    p2++;
                } else { // n1 > n2
                    p1++;
                }
            } else {
                p1++;
                p2++;
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
