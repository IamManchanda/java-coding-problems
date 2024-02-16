import java.util.*;

/**
 * Sweet and Savory
 * https://www.algoexpert.io/questions/sweet-and-savory
 * 
 * Approach: Two Pointers
 * - Time complexity: O(n log(n))
 * - Space complexity: O(n)
 */

public class Solution {
    public int[] sweetAndSavory(int[] dishes, int target) {
        int[] bestPair = new int[2];
        List<Integer> sweetDishes = new ArrayList<>();
        List<Integer> savoryDishes = new ArrayList<>();

        for (int dish : dishes) {
            if (dish < 0) {
                sweetDishes.add(dish);
            } else {
                savoryDishes.add(dish);
            }
        }

        sweetDishes.sort(Comparator.comparingInt(Math::abs));
        savoryDishes.sort(Comparator.naturalOrder());

        int bestDifference = Integer.MAX_VALUE,
                l = 0, nl = sweetDishes.size(),
                r = 0, nr = savoryDishes.size();

        while (l < nl && r < nr) {
            int currentSum = sweetDishes.get(l) + savoryDishes.get(r);

            if (currentSum <= target) {
                int currentDifference = target - currentSum;

                if (currentDifference < bestDifference) {
                    bestDifference = currentDifference;
                    bestPair[0] = sweetDishes.get(l);
                    bestPair[1] = savoryDishes.get(r);
                }

                r++;
            } else {
                l++;
            }
        }

        return bestPair;
    }
}

/*
 * Entered `dishes`
 * [5, 2, -7, 30, 12, -4, -20]
 * 
 * Enter the target:
 * 4
 * 
 * Result:
 * [-4, 5]
 */

/*
 * Entered `dishes`
 * [-3, -5, 1, 7]
 * 
 * Enter the target:
 * 8
 * 
 * Result:
 * [-3, 7]
 */
