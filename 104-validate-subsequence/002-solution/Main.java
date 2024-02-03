import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in an `array`: ");
        int na = sc.nextInt();

        System.out.println();
        System.out.println("Enter items: ");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < na; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            array.add(sc.nextInt());
        }

        System.out.println();
        System.out.println("Enter number of items in a `sequence`: ");
        int ns = sc.nextInt();

        System.out.println();
        System.out.println("Enter items: ");
        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < ns; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            sequence.add(sc.nextInt());
        }

        System.out.println();
        System.out.println("Entered `array`: ");
        System.out.println(array);

        System.out.println();
        System.out.println("Entered `sequence`: ");
        System.out.println(sequence);

        // Solution
        Solution solution = new Solution();
        boolean result = solution.isValidSubsequence(array, sequence);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}
