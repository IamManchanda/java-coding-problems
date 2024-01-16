/**
 * Problem: Print multiplication table of the number.
 */

public class Solution {
    public void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}

/*
 * Enter number:
 * 20
 * 
 * Result:
 * 20 * 1 = 20
 * 20 * 2 = 40
 * 20 * 3 = 60
 * 20 * 4 = 80
 * 20 * 5 = 100
 * 20 * 6 = 120
 * 20 * 7 = 140
 * 20 * 8 = 160
 * 20 * 9 = 180
 * 20 * 10 = 200
 */