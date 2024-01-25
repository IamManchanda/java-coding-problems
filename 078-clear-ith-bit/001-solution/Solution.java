/**
 * Clear the ith bit of a given number.
 */

public class Solution {
    public int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        int result = n & bitMask;

        return result;
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
 * 10
 */

/*
 * Enter the number:
 * 10
 * 
 * Enter the ith bit:
 * 3
 * 
 * Result:
 * 2
 */
