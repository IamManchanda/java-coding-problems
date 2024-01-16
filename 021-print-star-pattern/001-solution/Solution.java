/**
 * Problem: Print star pattern.
 */

public class Solution {
    public void printStarPattern(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * Enter number:
 * 6
 * 
 * Result:
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 */
