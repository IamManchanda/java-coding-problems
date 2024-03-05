import java.util.*;

/**
 * Job Sequencing Problem
 * 
 * Approach: Greedy Algorithm
 * - Time complexity: O(n log n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        int time = 0;
        int[] result = new int[2];
        ArrayList<Integer> seq = new ArrayList<>();

        for (Job job : arr) {
            if (job.deadline > time) {
                seq.add(job.id - 1); // 0-based index
                time++;
            }
        }

        result[0] = seq.size();
        result[1] = seq.stream().mapToInt(i -> arr[i].profit).sum();

        return result;
    }
}

/*
 * Entered `Job[] arr`:
 * [[1, 4, 20], [2, 1, 10], [3, 1, 40], [4, 1, 30]]
 * 
 * Entered number of jobs `N`:
 * 4
 * 
 * Result:
 * Total jobs: 2
 * Maximum profit: 60
 */
