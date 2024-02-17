/**
 * Palindrome Permutation
 * 
 * Approach: Bit Vector
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    private static final int a = Character.getNumericValue('a');
    private static final int z = Character.getNumericValue('z');

    public boolean isPermutationOfPalindrome(String phrase) {
        int bitVector = createBitVector(phrase);

        return bitVector == 0 || checkExactlyOneBitSet(bitVector);
    }

    private int createBitVector(String phrase) {
        int bitVector = 0;

        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            bitVector = toggle(bitVector, x);
        }

        return bitVector;
    }

    private int getCharNumber(char c) {
        int val = Character.getNumericValue(c);

        if (a <= val && val <= z) {
            return val - a;
        }

        return -1;
    }

    private int toggle(int bitVector, int index) {
        if (index < 0) {
            return bitVector;
        }

        int mask = 1 << index;

        if ((bitVector & mask) == 0) {
            bitVector |= mask;
        } else {
            bitVector &= ~mask;
        }

        return bitVector;
    }

    private boolean checkExactlyOneBitSet(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
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
