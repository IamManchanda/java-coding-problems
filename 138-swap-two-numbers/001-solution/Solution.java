import java.util.*;

/**
 * Swap two numbers in a list
 */

public class Solution {
    public List<Integer> swap(List<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

        return list;
    }
}

/*
 * Entered `list`
 * [2, 5, 9, 3, 6]
 * 
 * Enter `idx1`:
 * 1
 * 
 * Enter `idx2`:
 * 3
 * 
 * Result:
 * [2, 3, 9, 5, 6]
 */
