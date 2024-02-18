import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `words`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `words`: ");
        List<String> words = new ArrayList<>();

        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            words.add(sc.next());
        }

        System.out.println();
        System.out.println("Entered `words`");
        System.out.println(words);

        // Solution
        Solution solution = new Solution();
        List<List<String>> result = solution.groupAnagrams(words);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}