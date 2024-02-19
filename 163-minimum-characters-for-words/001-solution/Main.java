import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `words`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `words` (one per line): ");
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            words[i] = sc.next();
        }

        System.out.println();
        System.out.println("Entered `words`");
        System.out.println(Arrays.toString(words));

        // Solution
        Solution solution = new Solution();
        char[] result = solution.minimumCharactersForWords(words);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}