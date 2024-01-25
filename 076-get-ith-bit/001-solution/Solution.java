/**
 * Get the ith bit of a given number.
 */

public class Solution {
    public int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        int bit = n & bitMask;

        if (bit == 0) {
            return 0;
        }

        return 1; // bit == 1
    }
}

/*
 * Enter the number:
 * 10
 * 
 * Enter the ith bit:
 * 2
 * 
 * Result:
 * 0
 */

/*
 * Enter the number:
 * 10
 * 
 * Enter the ith bit:
 * 3
 * 
 * Result:
 * 1
 */
