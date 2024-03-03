import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in Queue `q`: ");
        int N = sc.nextInt();

        System.out.println();
        System.out.println("Enter items in Queue `q`: ");
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i <= N - 1; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            q.add(sc.nextInt());
        }

        System.out.println();
        System.out.println("Entered `N`: ");
        System.out.println(N);

        System.out.println();
        System.out.println("Entered Queue `q`: ");
        System.out.println(q);

        // Solution
        Solution solution = new Solution();
        ArrayList<Integer> result = solution.rearrangeQueue(N, q);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}