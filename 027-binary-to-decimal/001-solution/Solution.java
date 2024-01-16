/**
 * Problem: Convert from binary to decimal.
 */

public class Solution {
    public int convertBinaryToDecimal(int n) {
        int decimal = 0;
        int power = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            decimal += lastDigit * (int) Math.pow(2, power);
            power++;
            n /= 10;
        }

        return decimal;
    }
}

/*
 * Enter binary number:
 * 10110
 * 
 * Result:
 * Binary number 10110 in decimal is: 22
 */
