/**
 * Palindrome Permutation
 * 
 * Approach: Hash Table (int[])
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    private static final int a = Character.getNumericValue('a');
    private static final int z = Character.getNumericValue('z');

    public boolean isPermutationOfPalindrome(String phrase) {
        int countOdd = 0;
        int[] table = new int[z - a + 1];

        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);

            if (x != -1) {
                table[x]++;
                countOdd += table[x] % 2 == 1 ? 1 : -1;
            }
        }

        return countOdd <= 1;
    }

    private int getCharNumber(char c) {
        int val = Character.getNumericValue(c);

        if (a <= val && val <= z) {
            return val - a;
        }

        return -1;
    }
}

/*
 * Enter String `phrase`:
 * Tact Coa
 * 
 * Result:
 * true
 */

/*
 * Enter String `phrase`:
 * race a car
 * 
 * Result:
 * false
 */

/*
 * Enter String `phrase`:
 * abc cba
 * 
 * Result:
 * true
 */
