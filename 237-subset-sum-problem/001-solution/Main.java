import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items `N`: ");
        int N = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `arr[]`: ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter item " + (i + 1) + " `of arr[]` : ");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered number of items `N`: ");
        System.out.println(N);

        System.out.println();
        System.out.println("Entered `arr[]`:");
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println("Enter `sum`:");
        int sum = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        boolean result = solution.isSubsetSum(N, arr, sum);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}