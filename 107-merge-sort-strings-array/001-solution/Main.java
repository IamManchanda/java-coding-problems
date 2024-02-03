import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items: ");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            arr[i] = sc.next();
        }

        System.out.println();
        System.out.println("Entered `arr`: ");
        System.out.println(Arrays.toString(arr));

        // Solution
        Solution solution = new Solution();
        String[] result = solution.mergeSort(arr);

        System.out.println();
        System.out.println("Result:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}