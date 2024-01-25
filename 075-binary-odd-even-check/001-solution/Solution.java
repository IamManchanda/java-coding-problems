/**
 * Binary Odd Even Check
 */

public class Solution {
    public String oddOrEven(int n) {
        int bitMask = 1;
        int bit = n & bitMask;

        if (bit == 0) {
            return "Even";
        }

        return "Odd"; // bit == 1
    }
}

/*
 * Enter the number:
 * 3
 * 
 * Result:
 * Odd
 */

/*
 * Enter the number:
 * 4
 * 
 * Result:
 * Even
 */
