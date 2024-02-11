import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items: ");
        int n = sc.nextInt();

        int[] seats = new int[n];

        System.out.println();
        System.out.println("Enter items: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            seats[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `seats`");
        System.out.println(Arrays.toString(seats));

        // Solution
        Solution solution = new Solution();
        int result = solution.bestSeat(seats);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}