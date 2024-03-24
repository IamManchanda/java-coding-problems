import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of tickets:");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter tickets:");
        Map<String, String> tickets = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Enter ticket " + (i + 1) + ":");
            System.out.print("From: ");
            String from = sc.next();
            System.out.print("To: ");
            String to = sc.next();
            tickets.put(from, to);
        }

        System.out.println();
        System.out.println("Entered tickets:");
        System.out.println(tickets);

        // Solution
        Solution solution = new Solution();
        List<String> result = solution.findItinerary(tickets);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}