import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of elements in `arrayOne`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter elements of `arrayOne`: ");
        int[] arrayOne = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arrayOne[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Enter number of elements in `arrayTwo`: ");
        int m = sc.nextInt();

        System.out.println();
        System.out.println("Enter elements of `arrayTwo`: ");
        int[] arrayTwo = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arrayTwo[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `arrayOne`: ");
        System.out.println(Arrays.toString(arrayOne));

        System.out.println();
        System.out.println("Entered `arrayTwo`: ");
        System.out.println(Arrays.toString(arrayTwo));

        // Solution
        Solution solution = new Solution();
        int[] result = solution.smallestDifference(arrayOne, arrayTwo);

        System.out.println();
        System.out.println("Result:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}