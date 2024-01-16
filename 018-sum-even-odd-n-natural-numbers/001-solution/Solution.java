import java.util.*;

/**
 * Problem: Sum of even and odd for n natural numbers.
 */

public class Solution {
    public Map<String, Integer> sumEvenOddNNaturalNumbers(int n) {
        int evenSum = 0;
        int oddSum = 0;
        int i = 1;

        while (i <= n) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }

            i++;
        }

        Map<String, Integer> result = new HashMap<String, Integer>();
        result.put("evenSum", evenSum);
        result.put("oddSum", oddSum);

        return result;
    }
}

/*
 * Enter n:
 * 16
 * 
 * Result:
 * Even sum: 72
 * Odd sum: 64
 */