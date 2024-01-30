/**
 * Problem: Find the factorial of the number.
 */

public class Solution {
    public int factorial(int number) {
        if (number == 0) {
            return 1;
        }

        return number * factorial(number - 1);
    }
}

/*
 * Enter number:
 * 5
 * 
 * Result:
 * 120
 */
