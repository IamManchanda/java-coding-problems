import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter `n`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.print("Enter number of flights `m`: ");
        int m = sc.nextInt();

        System.out.println();
        System.out.println("Enter `flights`: ");
        int[][] flights = new int[m][3];

        for (int i = 0; i < m; i++) {
            System.out.println();
            System.out.println("Enter flight " + (i + 1) + " details: ");

            System.out.print("Enter `from`: ");
            flights[i][0] = sc.nextInt();

            System.out.print("Enter `to`: ");
            flights[i][1] = sc.nextInt();

            System.out.print("Enter `price`: ");
            flights[i][2] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `n`: ");
        System.out.println(n);

        System.out.println();
        System.out.println("Entered Flights: ");
        System.out.println(Arrays.deepToString(flights));

        System.out.println();
        System.out.println("Enter the source `src`:");
        int src = sc.nextInt();

        System.out.println();
        System.out.println("Enter the destination `dst`:");
        int dst = sc.nextInt();

        System.out.println();
        System.out.println("Enter the number of stops `k`:");
        int k = sc.nextInt();

        Solution solution = new Solution();
        int result = solution.findCheapestPrice(n, flights, src, dst, k);

        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}