import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of elements in `array`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter elements of `array`: ");
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array.add(sc.nextInt());
        }

        System.out.println();
        System.out.println("Entered `array`: ");
        System.out.println(array);

        System.out.println();
        System.out.println("Enter `toMove`: ");
        int toMove = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        List<Integer> result = solution.moveElementToEnd(array, toMove);

        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}