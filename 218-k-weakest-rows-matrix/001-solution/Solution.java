import java.util.*;

/**
 * The K Weakest Rows in a Matrix
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/description/
 * 
 * Approach: Counting Soldiers + Priority Queue
 * - Time complexity: O(n log m + n log n + k log n)
 * - Space complexity: O(n)
 * where, n is the number of rows
 * and, m is the number of columns in the matrix
 * and, k is the number of weakest rows to return
 * 
 * Note: As k <= n,
 * the time complexity can be simplified to O(n log m + n log n)
 */

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0; i < mat.length; i++) {
            int soldiers = countSoldiers(mat[i]);
            pq.add(new Row(soldiers, i));
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().idx;
        }

        return result;
    }

    private int countSoldiers(int[] row) {
        int left = 0, right = row.length;

        while (left < right) {
            int mid = findMidIndex(left, right);

            if (row[mid] == 1) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private int findMidIndex(int start, int end) {
        // Avoids overflow compared to (start + end) / 2
        return start + (end - start) / 2;
    }

    static class Row implements Comparable<Row> {
        int soldiers, idx;

        public Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row other) {
            if (this.soldiers == other.soldiers) {
                return this.idx - other.idx;
            }

            return this.soldiers - other.soldiers;
        }
    }
}

/*
 * Entered `mat[][]`:
 * [[1, 1, 0, 0, 0],
 * [1, 1, 1, 1, 0],
 * [1, 0, 0, 0, 0],
 * [1, 1, 0, 0, 0],
 * [1, 1, 1, 1, 1]]
 * 
 * Enter `k`:
 * 3
 * 
 * Result:
 * [2, 0, 3]
 */

/*
 * Entered `mat[][]`:
 * [[1, 0, 0, 0],
 * [1, 1, 1, 1],
 * [1, 0, 0, 0],
 * [1, 0, 0, 0]]
 * 
 * Enter `k`:
 * 2
 * 
 * Result:
 * [0, 2]
 */
