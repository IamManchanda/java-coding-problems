/**
 * Problem: Print Character pattern.
 */

public class Solution {
    public void printCharacterPattern(int lines) {
        char ch = 'A';
        for (int row = 1; row <= lines; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

/*
 * Enter number of lines:
 * 4
 * 
 * Result:
 * A
 * BC
 * DEF
 * GHIJ
 */
