/**
 * Problem: Convert from decimal to binary.
 */

public class Solution {
    public int convertDecimalToBinary(int n) {
        int binary = 0;
        int power = 0;

        while (n > 0) {
            int remainder = n % 2;
            binary += remainder * (int) Math.pow(10, power);
            power++;
            n /= 2;
        }

        return binary;
    }
}

/*
 * Enter decimal number:
 * 22
 * 
 * Result:
 * Decimal number 22 in binary is: 10110
 */
