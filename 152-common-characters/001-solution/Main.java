import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();

        String[] strings = new String[n];

        System.out.println();
        System.out.println("Enter items: ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            strings[i] = sc.next();
        }

        System.out.println();
        System.out.println("Entered `strings`");
        System.out.println(Arrays.toString(strings));
        // Solution
        Solution solution = new Solution();
        String[] result = solution.commonCharacters(strings);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}