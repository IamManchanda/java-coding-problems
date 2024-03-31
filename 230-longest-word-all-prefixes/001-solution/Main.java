import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `words[]`:");
        int N = sc.nextInt();

        System.out.println();
        String[] words = new String[N];

        if (N == 0) {
            System.out.println("Entered `words[]` is empty");
        } else {
            System.out.println("Enter items of `words[]`: ");

            for (int i = 0; i < N; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                words[i] = sc.next();
            }
        }

        System.out.println();
        System.out.println("Entered `words[]`: ");
        System.out.println(Arrays.toString(words));

        // Solution
        Solution solution = new Solution();
        String result = solution.longestWordWithAllPrefix(words);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}