/**
 * Problem: Check if a number is prime.
 */

public class Solution {
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
 * Enter number:
 * -11
 * 
 * Result:
 * -11 is not prime.
 */

/*
 * Enter number:
 * 1
 * 
 * Result:
 * 1 is not prime.
 */

/*
 * Enter number:
 * 2
 * 
 * Result:
 * 2 is prime.
 */

/*
 * Enter number:
 * 11
 * 
 * Result:
 * 11 is prime.
 */

/*
 * Enter number:
 * 12
 * 
 * Result:
 * 12 is not prime.
 */
