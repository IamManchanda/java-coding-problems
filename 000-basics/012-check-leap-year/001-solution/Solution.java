/**
 * Problem: Write a Java program that takes a year from the user and print
 * whether that year is a leap year or not.
 */

public class Solution {
    public boolean isLeapYear(int year) throws IllegalArgumentException {
        if (year < 0) {
            throw new IllegalArgumentException("Year must be positive.");
        }

        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;

        if (isDivisibleBy4 && !isDivisibleBy100) {
            return true;
        }

        if (isDivisibleBy4 && isDivisibleBy100 && isDivisibleBy400) {
            return true;
        }

        return false;
    }
}

/*
 * Enter the year:
 * 2024
 * 
 * Result:
 * 2024 is a leap year.
 */

/*
 * Enter the year:
 * 1857
 * 
 * Result:
 * 1857 is not a leap year.
 */

/*
 * Enter the year:
 * 1900
 * 
 * Result:
 * 1900 is not a leap year.
 */

/*
 * Enter the year:
 * 2000
 * 
 * Result:
 * 2000 is a leap year.
 */