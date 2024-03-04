import java.util.*;

/**
 * Activity Selection
 * 
 * Approach: Sorting + Greedy
 * - Time complexity: O(n log n)
 * - Space complexity: O(n)
 */

public class Solution {
    public Map<String, Object> activitySelection(int start[], int end[], int n) {
        int maxAct, lastEnd;
        ArrayList<Integer> selAct = new ArrayList<>();
        Map<String, Object> result = new HashMap<>();

        int[][] activities = new int[n][3];

        for (int i = 0; i <= n - 1; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

        maxAct = 1;
        selAct.add(activities[0][0]);
        lastEnd = activities[0][2];

        for (int i = 1; i <= n - 1; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                selAct.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        result.put("maxAct", maxAct);
        result.put("selAct", selAct);
        return result;
    }
}

/*
 * Entered number of activities `n`:
 * 6
 * 
 * Entered `start`:
 * [1, 3, 0, 5, 8, 5]
 * 
 * Entered `end`:
 * [2, 4, 6, 7, 9, 9]
 * 
 * Result:
 * Maximum activities: 4
 * Selected activities: [0, 1, 3, 4]
 */

/**
 * Entered number of activities `n`:
 * 6
 * 
 * Entered `start`:
 * [0, 1, 3, 5, 5, 8]
 * 
 * Entered `end`:
 * [6, 2, 4, 7, 9, 9]
 * 
 * Result:
 * Maximum activities: 4
 * Selected activities: [1, 2, 3, 5]
 */
