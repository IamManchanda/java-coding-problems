import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        String result = solution.printNumberOddEven(number);

        // Output
        System.out.println();
        System.out.println("The number " + number + " is:");
        System.out.println(result);

        sc.close();
    }
}