import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of jobs `N`: ");
        int N = sc.nextInt();

        System.out.println();
        System.out.println("Enter job details`: ");
        Job[] arr = new Job[N];
        for (int i = 0; i <= N - 1; i++) {
            System.out.println();
            int id = i + 1;
            System.out.print("Enter deadline for Job " + id + " : ");
            int deadline = sc.nextInt();
            System.out.print("Enter profit for Job " + id + " : ");
            int profit = sc.nextInt();

            arr[i] = new Job(id, deadline, profit);
        }

        System.out.println();
        System.out.println("Entered `Job[] arr`: ");
        System.out.println(Job.itemsToString(arr));

        System.out.println();
        System.out.println("Entered number of jobs `N`: ");
        System.out.println(N);

        // Solution
        Solution solution = new Solution();
        int[] result = solution.JobScheduling(arr, N);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println("Total jobs: " + result[0]);
        System.out.println("Maximum profit: " + result[1]);

        sc.close();
    }
}