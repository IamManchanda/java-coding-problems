/**
 * Clear i bits from the end of a given number.
 */

public class Solution {
    public int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        int result = n & bitMask;

        return result;
    }
}

/*
 * Enter the number:
 * 15
 * 
 * Enter the ith bit:
 * 2
 * 
 * Result:
 * 12
 */
