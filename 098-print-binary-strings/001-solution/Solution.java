/**
 * Print all binary strings of length n.
 */

public class Solution {
    public void printBinaryStrings(int n) {
        StringBuilder str = new StringBuilder("");
        printBinaryStrings(n, str, 0);
    }

    private void printBinaryStrings(int n, StringBuilder str, int lastPlace) {
        if (n == 0) {
            System.out.println(str.toString());
            return;
        }

        StringBuilder str0 = new StringBuilder(str);
        printBinaryStrings(n - 1, str0.append("0"), 0);

        if (lastPlace == 0) {
            StringBuilder str1 = new StringBuilder(str);
            printBinaryStrings(n - 1, str1.append("1"), 1);
        }
    }
}

/*
 * Enter `n`:
 * 3
 * 
 * Result:
 * 000
 * 001
 * 010
 * 100
 * 101
 */

/*
 * Enter `n`:
 * 4
 * 
 * Result:
 * 0000
 * 0001
 * 0010
 * 0100
 * 0101
 * 1000
 * 1001
 * 1010
 */
