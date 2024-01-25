/**
 * Clear bits in range from i to j
 */

public class Solution {
    public int clearBitsInRange(int n, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        int bitMask = a | b;
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
 * Enter the jth bit:
 * 4
 * 
 * Result:
 * 2
 */
