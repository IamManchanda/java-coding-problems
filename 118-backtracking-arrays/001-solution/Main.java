import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of elements in `arr`: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Solution
        Solution solution = new Solution();
        int[] result = solution.changeArr(arr);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}