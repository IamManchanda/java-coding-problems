import java.util.*;

/**
 * Merge Overlapping Intervals
 * https://www.algoexpert.io/questions/merge-overlapping-intervals
 * 
 * Approach: Sorting + Iteration
 * - Time Complexity: O(n log(n))
 * - Space Complexity: O(n)
 */

public class Solution {
    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int n = intervals.length;
        List<int[]> mergedIntervals = new ArrayList<int[]>();
        int[] currentInterval = intervals[0];

        mergedIntervals.add(currentInterval);

        for (int i = 1; i <= n - 1; i++) {
            int[] nextInterval = intervals[i];

            if (currentInterval[1] >= nextInterval[0]) {
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                currentInterval = nextInterval;
                mergedIntervals.add(currentInterval);
            }
        }

        return transform(mergedIntervals);
    }

    private int[][] transform(List<int[]> mergedIntervals) {
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}

/*
 * Entered `intervals`
 * [[1, 2], [3, 5], [4, 7], [6, 8], [9, 10]]
 * 
 * Result:
 * [[1, 2], [3, 8], [9, 10]]
 */
