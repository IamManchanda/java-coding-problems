import java.util.*;

/**
 * Swap two integers without using a temporary variable.
 * - Time Complexity: O(1)
 * - Space Complexity: O(1)
 */

public class Solution {
    public Map<String, Integer> swap(int x, int y) {
        Map<String, Integer> result = new HashMap<String, Integer>();

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        result.put("x", x);
        result.put("y", y);

        return result;
    }
}

/*
 * Enter `x`:
 * 3
 * 
 * Enter `y`:
 * 4
 * 
 * Input (Pre Swap):
 * x: 3
 * y: 4
 * 
 * Result (Post Swap):
 * x: 4
 * y: 3
 */
