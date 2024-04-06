import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the side: ");
        int side = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        int areaSquare = solution.calculateAreaSquare(side);

        // Output
        System.out.println();
        System.out.println("The area of a square with side " + side + " is:");
        System.out.println(areaSquare);

        sc.close();
    }
}