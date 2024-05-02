import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] cities = {
                { 0, 1, 2, 3, 4 },
                { 1, 0, 5, 0, 7 },
                { 2, 5, 0, 6, 0 },
                { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, 0 }
        };

        System.out.println();
        System.out.println("Entered Cities: ");
        System.out.println(Arrays.deepToString(cities));

        Solution solution = new Solution();
        int result = solution.getMinimumCost(cities);

        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);
    }
}