import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items `n`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items `value` and `weight`: ");
        Item[] arr = new Item[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.println();
            System.out.print("Enter item " + (i + 1) + " `value` : ");
            int x = sc.nextInt();
            System.out.print("Enter item " + (i + 1) + " `weight` : ");
            int y = sc.nextInt();
            arr[i] = new Item(x, y);
        }

        System.out.println();
        System.out.println("Enter maximum weight `W`: ");
        int W = sc.nextInt();

        int[] value = new int[n];
        int[] weight = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            value[i] = arr[i].value;
            weight[i] = arr[i].weight;
        }

        System.out.println();
        System.out.println("Entered `int[] value`: ");
        System.out.println(Arrays.toString(value));

        System.out.println();
        System.out.println("Entered `int[] weight`: ");
        System.out.println(Arrays.toString(weight));

        System.out.println();
        System.out.println("Entered `Item[] arr`: ");
        System.out.println(Item.itemsToString(arr));

        System.out.println();
        System.out.println("Entered number of items `n`: ");
        System.out.println(n);

        // Solution
        Solution solution = new Solution();
        double result = solution.fractionalKnapsack(W, arr, n);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}