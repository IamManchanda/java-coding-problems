import java.util.*;

/**
 * K Closest Points to Origin
 * https://leetcode.com/problems/k-closest-points-to-origin/description/
 * 
 * Approach: Priority Queue and Euclidean Distance Formula
 * - Time complexity: O(n log n)
 * - Space complexity: O(n)
 */

public class Solution {
    private static final int[] origin = new int[] { 0, 0 };

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>();

        for (int[] point : points) {
            double distance = euclideanDistance(point, origin);
            pq.add(new Point(point[0], point[1], distance));
        }

        int[][] result = new int[k][2];

        for (int i = 0; i < k; i++) {
            Point point = pq.poll();
            result[i][0] = point.x;
            result[i][1] = point.y;
        }

        return result;
    }

    private double euclideanDistance(int[] point1, int[] point2) {
        int x1 = point1[0], x2 = point2[0],
                y1 = point1[1], y2 = point2[1];

        // √((x1 - x2)^2 + (y1 - y2)^2)
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    static class Point implements Comparable<Point> {
        int x, y;
        double distance;

        Point(int x, int y, double distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }

        @Override
        public int compareTo(Point other) {
            return Double.compare(this.distance, other.distance);
        }
    }
}

/*
 * Entered `points[][]`:
 * [[1, 3], [-2, 2]]
 * 
 * Enter `k`:
 * 1
 * 
 * Result:
 * [[-2, 2]]
 */

/*
 * Entered `points[][]`:
 * [[3, 3], [5, -1], [-2, 4]]
 * 
 * Enter `k`:
 * 2
 * 
 * Result:
 * [[3, 3], [-2, 4]]
 */
