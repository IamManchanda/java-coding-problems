/**
 * Add 1 to an integer using Bit Manipulation.
 * 
 * Tip:
 * As, -x = ~x + 1;
 * Thus, -~x = x + 1;
 */

public class Solution {
    public int addOne(int x) {
        int notX = ~x;
        int negativeNotX = -notX;
        return negativeNotX;
    }
}

/*
 * Enter `x`:
 * 6
 * 
 * Result:
 * 7
 */

/*
 * Enter `x`:
 * -4
 * 
 * Result:
 * -3
 */

/*
 * Enter `x`:
 * 0
 * 
 * Result:
 * 1
 */
