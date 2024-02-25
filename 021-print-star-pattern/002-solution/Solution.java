/**
 * Problem: Print star pattern.
 * 
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public void printStarPattern(int lines) {
        StringBuilder sb = new StringBuilder("*");

        for (int row = 1; row <= lines; row++) {
            System.out.println(sb);
            sb.append("*");
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
