import java.util.*;

/**
 * Sort an arraylist of integers
 */

public class Solution {
    public List<Integer> sort(List<Integer> list, boolean isDescending) {
        if (isDescending) {
            Collections.sort(list, Collections.reverseOrder());
        } else {
            Collections.sort(list);
        }

        return list;
    }
}

/*
 * Entered `list`
 * [2, 5, 9, 3, 6]
 * 
 * Sorting order: ASC
 * 
 * Result:
 * [2, 3, 5, 6, 9]
 */

/*
 * Entered `list`
 * [2, 5, 9, 3, 6]
 * 
 * Sorting order: DESC
 * 
 * Result:
 * [9, 6, 5, 3, 2]
 */
