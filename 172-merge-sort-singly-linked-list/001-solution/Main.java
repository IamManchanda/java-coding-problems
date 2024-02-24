import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `linkedList`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items: ");

        // Custom LinkedList + Solution + Necessary Helper Methods
        Solution linkedList = new Solution();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            linkedList.add(sc.nextInt());
        }

        // Input Log
        System.out.println();
        System.out.println("Input:");
        linkedList.print();

        // Output
        System.out.println();
        System.out.println("Output:");
        linkedList.head = linkedList.mergeSort(linkedList.head);
        linkedList.print();

        sc.close();
    }
}