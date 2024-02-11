/**
 * Best Seat
 * https://www.algoexpert.io/questions/best-seat
 * 
 * Approach: Linear Scan (One Pass)
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int bestSeat(int[] seats) {
        int n = seats.length;
        int best = -1;
        int maxSpace = 0;

        int l = 0;
        while (l < n) {
            int r = l + 1;

            while (r < n && seats[r] == 0) {
                r++;
            }

            int space = r - l - 1;

            if (space > maxSpace) {
                best = findMidIndex(l, r);
                maxSpace = space;
            }

            l = r;
        }

        return best;
    }

    private int findMidIndex(int start, int end) {
        // Avoids overflow compared to (start + end) / 2
        return start + (end - start) / 2;
    }
}

/*
 * Entered `seats`
 * [1, 0, 1, 0, 0, 0, 1]
 * 
 * Result:
 * 4
 */

/*
 * Entered `seats`
 * [1, 0, 0, 1]
 * 
 * Result:
 * 1
 */
