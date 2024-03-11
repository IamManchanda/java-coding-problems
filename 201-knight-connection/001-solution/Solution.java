import java.util.*;

/**
 * Knight Connection
 * https://www.algoexpert.io/questions/knight-connection
 * 
 * Approach: Breadth First Search
 * - Time complexity: O(n * m)
 * - Space complexity: O(n * m)
 * where, n is the horizontal distance between the two knights
 * and, m is the vertical distance between the two knights
 */

public class Solution {
    private static final int[][] POSSIBLE_MOVES = new int[][] {
            { -2, 1 }, { -1, 2 }, { 1, 2 }, { 2, 1 },
            { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 }
    };

    public int knightConnection(int[] knightA, int[] knightB) {
        int x, y, count;
        Queue<List<Integer>> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(Arrays.asList(knightA[0], knightA[1], 0));
        visited.add(posToStr(knightA));

        while (true) {
            List<Integer> currPos = q.poll();
            x = currPos.get(0);
            y = currPos.get(1);
            count = currPos.get(2);

            if (x == knightB[0] && y == knightB[1]) {
                return getAns(count);
            }

            for (int[] move : POSSIBLE_MOVES) {
                List<Integer> pos = new ArrayList<>();
                pos.add(x + move[0]);
                pos.add(y + move[1]);

                String key = posToStr(pos);

                if (!visited.contains(key)) {
                    pos.add(count + 1);
                    q.add(pos);
                    visited.add(key);
                }
            }
        }
    }

    private int getAns(int count) {
        return (int) Math.ceil((double) count / 2);
    }

    private String posToStr(int[] position) {
        return position[0] + "," + position[1];
    }

    private String posToStr(List<Integer> position) {
        return position.get(0) + "," + position.get(1);
    }
}

/*
 * Entered `knightA[]`:
 * [0, 0]
 * 
 * Entered `knightB[]`:
 * [4, 2]
 * 
 * Result:
 * 1
 */

/*
 * Entered `knightA[]`:
 * [5, 2]
 * 
 * Entered `knightB[]`:
 * [-2, -4]
 * 
 * Result:
 * 3
 */
