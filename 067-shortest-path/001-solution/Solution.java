import java.util.*;

/**
 * Shortest Path
 */

public class Solution {
    public float shortestPath(String path) {
        int n = path.length();
        Map<String, Integer> coordinates = getPathCoordinates(path, n);
        int x1 = 0, x2 = coordinates.get("x");
        int y1 = 0, y2 = coordinates.get("y");

        int x = x2 - x1;
        int y = y2 - y1;

        double xSquared = Math.pow(x, 2);
        double ySquared = Math.pow(y, 2);

        return (float) Math.sqrt(xSquared + ySquared);
    }

    private Map<String, Integer> getPathCoordinates(String path, int n) {
        Map<String, Integer> coordinates = new HashMap<String, Integer>();
        int x = 0, y = 0;

        for (int i = 0; i <= n - 1; i++) {
            char dir = path.charAt(i);

            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else { // dir == 'E'
                x++;
            }
        }

        coordinates.put("x", x);
        coordinates.put("y", y);

        return coordinates;
    }
}

/*
 * Enter the String:
 * WNEENESENNN
 * 
 * Result:
 * 5.0
 */
