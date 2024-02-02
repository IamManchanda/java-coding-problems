import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter `n`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `arr`: ");
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println("Enter `key`: ");
        int key = sc.nextInt();

        // Solution & Output
        Solution solution = new Solution();
        System.out.println();
        System.out.println("Result:");
        solution.printAllOccurrences(arr, key);

        sc.close();
    }
}
