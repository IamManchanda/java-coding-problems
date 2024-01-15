import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the price of pencil: ");
        float pencilPrice = sc.nextFloat();

        System.out.println();
        System.out.println("Enter the price of pen: ");
        float penPrice = sc.nextFloat();

        System.out.println();
        System.out.println("Enter the price of eraser: ");
        float eraserPrice = sc.nextFloat();

        // Solution
        Solution solution = new Solution();
        float total = solution.calculateBill(pencilPrice, penPrice, eraserPrice);
        float totalWithGst = solution.calculateBillWithGst(total);

        // Output
        System.out.println();
        System.out.println("Total bill:");
        System.out.println(total);
        System.out.println();
        System.out.println("Total bill with GST:");
        System.out.println(totalWithGst);

        sc.close();
    }
}