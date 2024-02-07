import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of elements in `array`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter elements of `array`: ");
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `array`: ");
        System.out.println(Arrays.toString(array));

        // Solution
        Solution solution = new Solution();
        boolean result = solution.isMonotonic(array);

        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}