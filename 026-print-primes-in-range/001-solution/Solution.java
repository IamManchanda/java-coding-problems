/**
 * Problem: Print all prime numbers in a range.
 */

public class Solution {
    public void printPrimesInRange(int range) {
        for (int i = 1; i <= range; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

/*
 * Enter range:
 * 42
 * 
 * Result:
 * 2 3 5 7 11 13 17 19 23 29 31 37 41
 */
