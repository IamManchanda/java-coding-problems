import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of competitions: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();

        System.out.println();
        System.out.println("Enter competitors for each competition: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter competitors for competition " + (i + 1) + ": ");
            ArrayList<String> competition = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter competitor " + (j + 1) + ": ");
                competition.add(sc.next());
            }
            competitions.add(competition);
        }

        System.out.println();
        System.out.println("Enter results for each competition: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter result for competition " + (i + 1) + ": ");
            results.add(sc.nextInt());
        }

        System.out.println();
        System.out.println("Entered `competitions`: ");
        System.out.println(competitions);

        System.out.println();
        System.out.println("Entered `results`: ");
        System.out.println(results);

        // Solution
        Solution solution = new Solution();
        String result = solution.tournamentWinner(competitions, results);

        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}