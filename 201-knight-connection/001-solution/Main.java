import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter `x` and `y` axis of `knightA[]`: ");
        int[] knightA = new int[2];
        System.out.println("Enter `x`: ");
        knightA[0] = sc.nextInt();
        System.out.println("Enter `y`: ");
        knightA[1] = sc.nextInt();

        System.out.println();
        System.out.println("Enter `x` and `y` axis of `knightB[]`: ");
        int[] knightB = new int[2];
        System.out.println("Enter `x`: ");
        knightB[0] = sc.nextInt();
        System.out.println("Enter `y`: ");
        knightB[1] = sc.nextInt();

        System.out.println();
        System.out.println("Entered `knightA[]`: ");
        System.out.println(Arrays.toString(knightA));

        System.out.println();
        System.out.println("Entered `knightB[]`: ");
        System.out.println(Arrays.toString(knightB));

        // Solution
        Solution solution = new Solution();
        int result = solution.knightConnection(knightA, knightB);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}