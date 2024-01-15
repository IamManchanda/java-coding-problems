import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the radius: ");
        float radius = sc.nextFloat();

        // Solution
        Solution solution = new Solution();
        double areaCircle = solution.getAreaCircle(radius);

        // Output
        System.out.println();
        System.out.println("The area of the circle with radius " + radius + " is:");
        System.out.println(areaCircle);

        sc.close();
    }
}