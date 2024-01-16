/**
 * Problem: Print star pattern.
 */

public class Solution {
    public void printStarPattern(int n) {
        for (int i = 1; i <= n; i++) {
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
