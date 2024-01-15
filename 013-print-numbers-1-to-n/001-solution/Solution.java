/**
 * Problem: Print numbers from 1 to n.
 */

public class Solution {
    public void printNumbers(int n) {
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
    }
}

/*
 * Enter n:
 * 14
 * 
 * Result:
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14
 */