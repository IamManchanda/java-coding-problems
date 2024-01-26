/**
 * Count Set Bits
 */

public class Solution {
    public int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }

            n >>= 1;
        }

        return count;
    }
}

/*
 * Enter the number:
 * 10
 * 
 * Result:
 * 2
 */

/*
 * Enter the number:
 * 15
 * 
 * Result:
 * 4
 */
