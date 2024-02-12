import java.util.List;

/**
 * Print reverse array list
 */

public class Solution {
    public void printReverseArrayList(List<Integer> list) {
        int n = list.size();

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

/*
 * Entered `list`
 * [1, 2, 3, 4, 5]
 * 
 * Result:
 * 5 4 3 2 1
 */
