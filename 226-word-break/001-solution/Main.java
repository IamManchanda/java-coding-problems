import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter a string `s`: ");
        String s = sc.nextLine();

        System.out.println();
        System.out.println("Enter number of items in `wordDict[]`:");
        int n = sc.nextInt();

        System.out.println();
        List<String> wordDict = new ArrayList<>();

        if (n == 0) {
            System.out.println("Entered `wordDict[]` is empty");
        } else {
            System.out.println("Enter items of `wordDict[]`: ");

            for (int i = 0; i < n; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                wordDict.add(sc.next());
            }
        }

        System.out.println();
        System.out.println("Entered string `s`: ");
        System.out.println(s);

        System.out.println();
        System.out.println("Entered `wordDict[]`: ");
        System.out.println(wordDict);

        // Solution
        Solution solution = new Solution();
        boolean result = solution.wordBreak(s, wordDict);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}