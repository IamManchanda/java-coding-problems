/**
 * Update the ith bit of a given number.
 */

public class Solution {
    public int updateIthBit(int n, int i, int newBit) throws IllegalArgumentException {
        if (newBit != 0 && newBit != 1) {
            throw new IllegalArgumentException("newBit must be 0 or 1");
        }

        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        int result = n | bitMask;

        return result;
    }

    private int clearIthBit(int n, int i) {
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
 * New bit:
 * 1
 * 
 * Result:
 * 14
 */
